package locationapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.beans.PropertyChangeEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import locationapp.model.Location;
import locationapp.model.LocationModel;
import locationapp.model.Reservation;
import locationapp.view.LocationView;

public class LocationController {
    private final LocationView view;
    private final LocationModel model;
    private int ID;
    private boolean on;

    public LocationController(LocationView v, LocationModel m) {
        this.view = v;view.setLocationRelativeTo(null);
        view.getClotFrame().setLocationRelativeTo(null);
        this.model = m;
        
        view.setTab(model.setTable(0, "%", "%")); 
        view.setIdcCom(model.getClientIDs());
        view.setIdvCom(model.getVoitureIDs());
        view.RechercheListener((ActionEvent e) -> {
            view.setTab(model.setTable(view.getId(),view.getNom()+"%",view.getPrenom()+"%"));
            
        });
        view.AjouterListener((ActionEvent e) -> {
            view.getIdcCom().setSelectedIndex(0);
            view.getIdvCom().setSelectedIndex(0);
            view.getEntryFrame().setVisible(true); 
            on=true;
        });
        view.OkButListener((ActionEvent e) -> {
            String dd = view.getDd();
            String df = view.getDf();
            long kil =  0;
            try{
                kil = Long.parseLong(view.getKilomTf().getText());
                if(dd.equals("") || df.equals(""))
                    view.verPopUp();
                else if (dd.equals("") || df.equals("") || view.getWkndChState() &&  
                        !(dd.substring(0,3).equals("Fri") && df.substring(0,3).equals("Mon")))
                    view.verPopUp();
                else{
                    if(on){
                        model.AjouterLoc(view.getIdcComV(),view.getIdvComV(),dd,view.getHdSpV(),df,view.getHfSpV(),kil, view.getCautChV(),view.getDedChV());
                        if(view.getResChState())model.endRes(view.getIdrComV());
                    }
                    else
                        model.ModLoc(ID,view.getIdcComV(),view.getIdvComV(),dd,view.getHdSpV(),df,view.getHfSpV(),kil,view.getCautChV(),view.getDedChV());

                    view.getEntryFrame().dispatchEvent(new WindowEvent(view.getEntryFrame(), WindowEvent.WINDOW_CLOSING));
                        view.setTab(model.setTable(0,"%","%"));
                }
            }catch(Exception ex){view.verPopUp();}
        });
        view.idcComchanged((ActionEvent e) -> {
            view.setNomTf2(model.getClientNom(view.getIdcComV()));
            view.setPrenomTf2(model.getClientPrenom(view.getIdcComV()));
        });
        view.idvComchanged((ActionEvent e) -> {
            view.setMatTf(model.getVoitureMat(view.getIdvComV()));
            view.setVoitTf(model.getVoitureNom(view.getIdvComV()));
            view.setPrixTf(Double.toString(model.getPrix(view.getIdvComV())));
        });
        view.idrComchanged((ActionEvent e) -> {
            Reservation r = model.getRes(view.getIdrComV());
            view.getIdcCom().setSelectedItem(r.getCLIENT().getID_CLI());
            view.getIdvCom().setSelectedItem(r.getVOITURE().getID_V());
            view.getIdcCom().setEnabled(false);view.getIdvCom().setEnabled(false);
            try {
                view.getDdPk().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(r.getDATE_DEB()));
                view.getDfPk().setDate(new SimpleDateFormat("yyyy-MM-dd").parse(r.getDATE_FIN()));                
            } catch (ParseException ex) {
                Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
            }
            String H = r.getHEURE_DEB();
            view.setHdSp(Integer.valueOf(H.substring(0,2)));
            view.setMdSp(Integer.valueOf(H.substring(3,5)));
            H = r.getHEURE_FIN();
            view.setHfSp(Integer.valueOf(H.substring(0,2)));
            view.setMfSp(Integer.valueOf(H.substring(3,5)));
            view.setKiloTf(Kilo());
        });
        view.getDdPk().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if(!view.getDf().equals(""))view.setKiloTf(Kilo());
        });
        view.getDfPk().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if(!view.getDd().equals(""))view.setKiloTf(Kilo());
        });
        view.getKiloTf().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!view.getPrixTf().getText().isEmpty())view.setMont_Tf(""+(view.getKiloTfV()*view.getPrixTfV()));                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        view.getKiloTf().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!view.getPrixTf().getText().isEmpty())view.setMont_Tf(""+(view.getKiloTfV()*view.getPrixTfV()));                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        view.getMontTf().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                view.getCautTf().setText(Double.toString(Double.parseDouble(view.getMontTf().getText())*0.2));
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        view.resChListener((ActionEvent e) -> {
            if(view.getResChState()){
                view.setIdrCom(model.getReservationIDs());
                view.getIdrCom().setEnabled(true);
                view.getIdrCom().setSelectedIndex(0);                
            }
            else{
                view.getIdcCom().setEnabled(true);view.getIdvCom().setEnabled(true);
                view.getIdrCom().setEnabled(false);
            }
        });
        view.wkndChListener((ActionEvent e) -> {
            if(view.getWkndChState()){
                view.setHdSp(19);view.setHfSp(7);view.setMfSp(30);
                view.getHdSp().setEnabled(false);view.getHfSp().setEnabled(false);
                view.getMdSp().setEnabled(false);view.getMfSp().setEnabled(false);
                view.setKiloTf(model.wkKilo());
            }
            else{
            view.getHdSp().setEnabled(true);view.getHfSp().setEnabled(true);
            view.getMdSp().setEnabled(true);view.getMfSp().setEnabled(true);
            view.setKiloTf(Kilo());}
        });
        
        view.ModifierListener((ActionEvent ActionLister) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                ID=Integer.valueOf((String)view.getTab().getValueAt(row, 0));
                Location l = model.getLoc(ID);
                view.getIdcCom().setSelectedItem(l.getCLIENT().getID_CLI());
                view.getIdvCom().setSelectedItem(l.getVOITURE().getID_V());
                view.setDdPk(l.getDATE_DEB());
                view.setDfPk(l.getDATE_REST());
                String H = l.getHEURE_DEB();
                view.setHdSp(Integer.valueOf(H.substring(0,2)));
                view.setMdSp(Integer.valueOf(H.substring(3,5)));
                H = l.getHEURE_REST();
                view.setHfSp(Integer.valueOf(H.substring(0,2)));
                view.setMfSp(Integer.valueOf(H.substring(3,5)));
                view.setKilomTf(l.getKILO_DEB());
                view.getCautCh().setSelected(l.isCAUTION_PAYEE());
                view.getDedCh().setSelected(l.isDEDOMAGEMENT());
                view.setKiloTf(Kilo());
                view.getEntryFrame().setVisible(true);
                on=false;
            }else view.selPopUp();
        });
        view.cloButListener((ActionEvent e) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                ID=Integer.valueOf((String)view.getTab().getValueAt(row, 0));
                view.getIdLocTf().setText(ID+"");
                Location l = model.getLoc(ID);
                view.setNomTf3(l.getCLIENT().getNOM());view.setPreomTf3(l.getCLIENT().getPRENOM());
                view.setMatTf1(l.getVOITURE().getMATRICULE());
                view.setVoitTf1(l.getVOITURE().getMARQUE()+l.getVOITURE().getTYPE());
                view.getClotFrame().setVisible(true);
            }else view.selPopUp();
            view.setTab(model.setTable(0, "%", "%")); 
        });
        view.getDrPk().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            if(!"".equals(view.getKilomTf1().getText())){
                Location l = model.getLoc(ID);
                l.setDATE_REST_EFF(model.form(view.getDr()));
                l.setHEURE_REST_EFF(view.getHrSpV());
                l.setKILO_REST(view.getKilomTf1V());
                view.setMontTf1(model.calculmMont(l).toString());
            }
        });
        view.getKilomTf1().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!"".equals(view.getDr())){
                    Location l = model.getLoc(ID);
                    l.setDATE_REST_EFF(model.form(view.getDr()));
                    l.setHEURE_REST_EFF(view.getHrSpV());
                    l.setKILO_REST(view.getKilomTf1V());
                    view.setMontTf1(model.calculmMont(l).toString());
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        view.OkBut1Listener((ActionEvent e) -> {
            String dr = view.getDr();System.out.println(dr);
            long kil =0;
            try{
                kil = Long.parseLong(view.getKilomTf1().getText());
                Location l = model.getLoc(ID);
                l.setDATE_REST_EFF(model.form(dr));
                l.setHEURE_REST_EFF(view.getHrSpV());
                l.setKILO_REST(kil);
                model.updateLoc(l);
                view.getClotFrame().dispatchEvent(new WindowEvent(view.getClotFrame(), WindowEvent.WINDOW_CLOSING));
            }catch(Exception ex){view.verPopUp();}
        });
    }
    private String Kilo() {
        if(view.getWkndChState())return model.wkKilo();
        else{
            String dd = model.form(view.getDd());
            String hd = view.getHdSpV();
            String df = model.form(view.getDf());
            String hf = view.getHfSpV();
            if(dd.isEmpty()|| df.isEmpty())return "";
            else return Long.toString(model.calculKilo(dd,hd+":00",df,hf+":00"));
        }
    } 
}