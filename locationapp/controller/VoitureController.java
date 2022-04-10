package locationapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Vector;
import locationapp.model.VoitureModel;
import locationapp.view.VoitureView;

public class VoitureController {
    private VoitureView view;
    private VoitureModel model;
    public VoitureController(VoitureView v, VoitureModel m) {
        this.view = v;view.setLocationRelativeTo(null);view.getEntryFrame().setLocationRelativeTo(null);
        this.model = m;
        view.setTab(model.setTable("%","%","%",false,false,false,false));
        
        view.RechercheListener((ActionEvent e) -> {
            view.setTab(model.setTable(view.getMatTf().getText()+"%",view.getMarTf().getText()+"%",
                    view.getTypeTf().getText()+"%",view.getRadioch().isSelected(),view.getClimCh().isSelected(),
                    view.getAbsCh().isSelected(),view.getAirCh().isSelected()));
        });
        view.AjouterListener((ActionEvent e) -> {
            Vector<Integer> vv =model.classIds();
            for(int i = 0 ; i < vv.size(); i++)view.getClasCom2().addItem(vv.get(i).toString());
            view.getEntryFrame().setVisible(true);
        });
        view.OkButListener((ActionEvent e)->{
            String mat = view.getMatTf2().getText(), mar = view.getMarTf2().getText(), 
                    type = view.getTypeTf2().getText(),
                    date = (view.getDatePk2().getDate()!=null)?view.getDatePk2().getDate().toString():"";
            int puis=0;double prix=0;
            if(mat.equals("") || mar.equals("") || type.equals("") || date.equals(""))
                view.verPopUp();
            else{
                try{
                    puis = Integer.parseInt(view.getPuisTf2().getText());
                    prix = Double.parseDouble(view.getPrixTf2().getText());
                    model.create(mat, mar, type, puis, model.form(view.getDatePk2().getDate()),
                            prix,view.getRadioch2().isSelected(),view.getClimCh2().isSelected(),
                            view.getAbsCh2().isSelected(),view.getAirCh2().isSelected(),
                            Integer.parseInt(view.getClasCom2().getSelectedItem().toString()));
                    view.getEntryFrame().dispatchEvent(new WindowEvent(view.getEntryFrame(), WindowEvent.WINDOW_CLOSING));
                }catch(Exception ex){view.verPopUp();}
            }
            view.setTab(model.setTable("%","%","%",false,false,false,false));
        });
        view.VerifListener((ActionEvent e)-> {
            view.setTab1(model.setTable1());
            view.getjFrame1().setVisible(true);
        });
        view.SupprimerListener((ActionEvent e)-> {
            model.supp();
            view.setTab(model.setTable("%","%","%",false,false,false,false));
            view.getjFrame1().dispatchEvent(new WindowEvent(view.getjFrame1(), WindowEvent.WINDOW_CLOSING));
        });
        view.trouButListener((ActionEvent e)-> {
            view.setTab2(model.setTable("-", "-", "-", true, true, true, true));//empty table
            view.getjFrame2().setVisible(true);
        });
        view.rechButListener((ActionEvent e)-> {
            String dd = (view.getDd1().getDate()!=null)?view.getDd1().getDate().toString():"";
            String df = (view.getDf1().getDate()!=null)?view.getDf1().getDate().toString():"";
            if(dd.equals("") || df.equals(""))view.verPopUp();
            else{
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz yyyy");
                System.out.println(dd);
                LocalDateTime date1 = LocalDateTime.parse(dd,formatter);
                LocalDateTime date2 = LocalDateTime.parse(df,formatter);
                System.out.println(date1.toString());
                dd = date1.toString().substring(0, 10);
                df = date2.toString().substring(0, 10);
                if(date1.compareTo(date2)>0)view.verPopUp();
                else
                view.setTab2(model.setDispTable(dd, df, view.getRadioch3().isSelected(), view.getClimCh3().isSelected(),
                        view.getAbsCh3().isSelected(), view.getAirCh3().isSelected()));
            }
        });
    }
}