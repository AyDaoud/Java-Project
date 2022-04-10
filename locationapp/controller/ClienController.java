package locationapp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import locationapp.model.ClientModel;
import locationapp.view.ClientView;


public class ClienController {
    private ClientView view;
    private ClientModel model;
    private boolean on=false;
    private int ID;
    public ClienController(ClientView v, ClientModel m) {
        view = v;view.setLocationRelativeTo(null);view.getEntryFrame().setLocationRelativeTo(null);
        model = m;
        view.setTab(model.setTable("%","%"));
        view.RechercheListener((ActionEvent e) -> {
            view.setTab(model.setTable(view.getNom()+"%",view.getPrenom()+"%"));
        });
        
        view.AjouterListener((ActionEvent e) -> {
            view.setTitre("Ajouter un Client");
            on=false;
            view.setOkButName("Ajouter");
            view.getEntryFrame().setVisible(true);
        });
        
        view.ModifierListener((ActionEvent e) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                ID = Integer.valueOf((String)view.getTab().getValueAt(row, 0));
                view.setNomTf2((String)view.getTab().getValueAt(row, 1));
                view.setPrenomTf2((String)view.getTab().getValueAt(row, 2));
                view.setAdrTf((String)view.getTab().getValueAt(row, 3));
                view.setNperTf((String)view.getTab().getValueAt(row, 4));
                view.setTitre("Modifier un Client");
                on=true;
                view.setOkButName("Modifier");
                view.getEntryFrame().setVisible(true);
            }else view.selPopUp();
        });
        
        view.SupprumerListener((ActionEvent e) -> {
            int row = view.getTab().getSelectedRow();
            if(row != -1){
                boolean b = model.SupprimerClient(Integer.valueOf((String)view.getTab().getValueAt(row, 0)));
                if(!b)view.supPopUp();
                view.setTab(model.setTable("%","%"));
            }else view.selPopUp();
        });
        
        view.OkButListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nom = view.getNomTf2();
                String prenom = view.getPrenomTf2();
                String adr = view.getAdrTf();
                long nper=0;
                try{
                    nper = Long.parseLong(view.getNperTf());
                    if(nom.equals("") || prenom.equals("") || adr.equals(""))
                        view.verPopUp();
                    else{
                        if(on)
                            model.ModifierClient(ID,nom,prenom,adr,nper);
                        else
                            model.ajouterClient(nom,prenom,adr,nper);
                        view.getEntryFrame().dispatchEvent(new WindowEvent(view.getEntryFrame(), WindowEvent.WINDOW_CLOSING));
                        view.setTab(model.setTable("%","%"));
                    }
                }catch(Exception ex){
                    view.verPopUp();
                }
            }
        });
    } 
}