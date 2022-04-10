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
import locationapp.model.ReservationModel;
import locationapp.view.ReservationView;

public class ReservationController{
    private final ReservationView view;
    private final ReservationModel model;
    private int ID;
    private boolean on;
    public ReservationController(ReservationView v, ReservationModel m) {
        this.view = v;v.setVisible(true);v.setLocationRelativeTo(null);
        this.model = m;
        view.setIdcCom(model.getClientIDs());
        view.setIdvCom(model.getVoitureIDs());
        view.setTab(model.setTable(0, "%", "%")); 
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
            if(dd.equals("") || df.equals(""))
                view.verPopUp();
            else if (dd.equals("") || df.equals("") || view.getWkndChState() &&  
                    !(dd.substring(0,3).equals("Fri") && df.substring(0,3).equals("Mon")))
                view.verPopUp();
            else{
                if(on)
                    model.AjouterRes(view.getIdcComV(),view.getIdvComV(),dd,view.getHdSpV(),df,view.getHfSpV());
                else
                    model.ModRes(ID,view.getIdcComV(),view.getIdvComV(),view.getDd(),view.getHdSpV(),view.getDf(),view.getHfSpV());

                view.getEntryFrame().dispatchEvent(new WindowEvent(view.getEntryFrame(), WindowEvent.WINDOW_CLOSING));
                    view.setTab(model.setTable(0,"%","%"));
            }
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
        view.getDdPk().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            view.setKiloTf(Kilo());
        });
        view.getDfPk().addPropertyChangeListener((PropertyChangeEvent evt) -> {
            view.setKiloTf(Kilo());
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
        view.getPrixTf().getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(!view.getKiloTf().getText().isEmpty())view.setMont_Tf(""+(view.getKiloTfV()*view.getPrixTfV()));                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
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
                view.setKiloTf(Kilo());
            }
        });
        view.ModifierListener((ActionEvent ActionLister) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                ID=Integer.valueOf((String)view.getTab().getValueAt(row, 0));
                view.getIdcCom().setSelectedItem(Integer.valueOf((String)view.getTab().getValueAt(row, 1)));
                view.getIdvCom().setSelectedItem(Integer.valueOf((String)view.getTab().getValueAt(row, 4)));
                try {
                    view.getDdPk().setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) view.getTab().getValueAt(row, 7)));
                    view.getDfPk().setDate(new SimpleDateFormat("yyyy-MM-dd").parse((String) view.getTab().getValueAt(row, 9)));                
                } catch (ParseException ex) {
                    Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
                }
                String H = (String)view.getTab().getValueAt(row, 8);
                view.setHdSp(Integer.valueOf(H.substring(0,2)));
                view.setMdSp(Integer.valueOf(H.substring(3,5)));
                H = (String)view.getTab().getValueAt(row, 10);
                view.setHfSp(Integer.valueOf(H.substring(0,2)));
                view.setMfSp(Integer.valueOf(H.substring(3,5)));
                view.setKiloTf(Kilo());
                view.getEntryFrame().setVisible(true);
                on=false;
            }else view.selPopUp();
        });
        view.chButListener((ActionEvent e) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                ID=Integer.valueOf((String)view.getTab().getValueAt(row, 0));
                view.getEtatCom().setSelectedItem((String)view.getTab().getValueAt(row, 11));
                if(!((String)view.getTab().getValueAt(row, 11)).equals("Annulée"))view.getRaTf().setEnabled(false);
                view.getRaTf().setEditable(true);
                view.getRaTf().setText((String)view.getTab().getValueAt(row, 12));
                view.getEtatFrame().setVisible(true);
            }else view.selPopUp();
        });
        view.Ok3ButListener((ActionEvent e) -> {
            String etat = view.getEtatCom().getSelectedItem().toString();
            String rais = view.getRaTf().getText();
            if(!etat.equals("Annulée")) view.getRaTf().setEditable(false);
            if(etat.equals("Annulée") && rais.equals("")) view.verPopUp();
            else{
                model.chEtatRes(ID,etat,rais);
                view.setTab(model.setTable(0,"%","%"));
                view.getEtatFrame().dispatchEvent(new WindowEvent(view.getEtatFrame(), WindowEvent.WINDOW_CLOSING));
            }
        });
    }
 
    private String Kilo() {
        if(view.getWkndChState())return model.wkKilo();
        else{
            String dd = view.getDd();
            String hd = view.getHdSpV();
            String df = view.getDf();
            String hf = view.getHfSpV();
            if(dd.isEmpty()|| df.isEmpty())return "";
            else return model.calculKilo(dd,hd,df,hf);
        }
    }
}