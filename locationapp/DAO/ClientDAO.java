package locationapp.DAO;

import java.sql.Connection;
import java.util.Vector;
import locationapp.model.Client;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDAO extends DAO<Client> {

    public ClientDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Client c) {
        String query = String.format("INSERT INTO EPT.CLIENT (ID_CLI, NOM, \"PRÉNOM\", ADRESSE,"
            + " NUM_PERMIS) VALUES (%d, '%s', '%s', '%s', %d)",c.getID_CLI(),c.getNOM(),
            c.getPRENOM(),c.getADRESSE(),c.getNUM_PERMIS());
        try {
            Statement state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    @Override
    public boolean delete(Client c) {
        String query = "DELETE FROM EPT.CLIENT WHERE ID_CLI="+c.getID_CLI();
        try {
            Statement state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            //Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    @Override
    public boolean update(Client c) {
        String query = String.format("UPDATE EPT.CLIENT SET NOM='%s', PRÉNOM='%s',"+
                " ADRESSE='%s', NUM_PERMIS=%d WHERE ID_CLI=%d", c.getNOM(),
                c.getPRENOM(),c.getADRESSE(),c.getNUM_PERMIS(),c.getID_CLI());
        try {
            Statement state = conn.createStatement();
            state.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
    @Override
    public Client find(int id) {
        String query = "SELECT * FROM EPT.CLIENT WHERE ID_CLI = " + id;
        Client c = null;
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            res.next();
                c = new Client(res.getInt(1),res.getString(2),res.getString(3),
                        res.getString(4),res.getLong(5));
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
 
    @Override
    public Vector<String> header() {
        Vector <String> v = new Vector<>();
        try {
            String query = "SELECT * FROM EPT.CLIENT";
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            ResultSetMetaData rsmd = res.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount() ;i++){
                v.add(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    
    @Override
    public int NextId() {
        String query = "SELECT MAX(ID_CLI) FROM EPT.CLIENT";
        int id=1;
        try{
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            res.next();
            if(res.getInt(1)!=-1)id=res.getInt(1)+1;
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id;
    }
    
    public Vector<Integer> findIDs() {
        Vector<Integer> v = new Vector();
        String query = "SELECT ID_CLI FROM EPT.CLIENT";
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next())
                v.add(res.getInt(1));
            
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    
    public Vector<Client> find(String nom,String prenom) {
        Vector<Client> v = new Vector();
        String query = String.format("SELECT * FROM EPT.CLIENT WHERE (NOM LIKE '%s' AND PRÉNOM LIKE '%s')"
                + " ORDER BY ID_CLI ASC",nom,prenom);
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()) {
                Client c = new Client(res.getInt(1), res.getString(2), res.getString(3),
                        res.getString(4), res.getLong(5));
                v.add(c);
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
}
