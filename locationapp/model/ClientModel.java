package locationapp.model;

import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import locationapp.DAO.ClientDAO;
import locationapp.DAO.Connect;

public class ClientModel {
    private final ClientDAO cDAO = new ClientDAO(Connect.getInstance());
    public DefaultTableModel setTable(String nom, String prenom) {
        Vector<String> title = cDAO.header();
        Vector<Vector<String>> data = clientToVect(cDAO.find(nom, prenom));
        return new DefaultTableModel(data,title);
    }
    
    private Vector<Vector<String>> clientToVect(Vector<Client> vc) {
        Vector<Vector<String>> v = new Vector<> ();
        for(int i = 0; i < vc.size() ; i++){
            Client c = vc.get(i);
            Vector<String> vs = new Vector<> ();
            vs.add(Integer.toString(c.getID_CLI()));
            vs.add(c.getNOM());vs.add(c.getPRENOM());vs.add(c.getADRESSE());
            vs.add(Long.toString(c.getNUM_PERMIS()));
            v.add(vs);     
        }
        return v;
    }

    public void ajouterClient(String nomTf2, String prenomTf2, String adrTf, long nperTf) {
        Client c = new Client(cDAO.NextId(), nomTf2, prenomTf2, adrTf, nperTf);
        cDAO.create(c);
    }

    public void ModifierClient(int ID, String nomTf2, String prenomTf2, String adrTf, long nperTf) {
        Client c = new Client(ID, nomTf2, prenomTf2, adrTf, nperTf);
        cDAO.update(c);
    }

    public boolean SupprimerClient(int ID) {
       return cDAO.delete(cDAO.find(ID));
    }
}