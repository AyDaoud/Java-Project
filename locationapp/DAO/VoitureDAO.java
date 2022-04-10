package locationapp.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import locationapp.model.Voiture;

public class VoitureDAO extends DAO<Voiture>{
    private final ClasseDAO clDAO = new ClasseDAO(Connect.getInstance());
    public VoitureDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Voiture v) {
        String query = String.format("INSERT INTO EPT.VOITURE (ID_V, MATRICULE, MARQUE, TYPE, PUISSANCE,"
                + " DATE_A, PRIX_A, ETAT, RADIO, CLIMAT, ABS, AIRBAG, ID_CLASS) VALUES (%d, '%s', '%s',"
                + " '%s', %d, '%s', %f, '%s', %b, %b, %b, %b, %d)",v.getID_V(),v.getMATRICULE(),
                v.getMARQUE(),v.getTYPE(),v.getPUISSANCE(),v.getDATE_A(),v.getPRIX_A(),v.getETAT(),
                v.getRADIO(),v.getCLIMAT(),v.getABS(),v.getAIRBAG(),v.getCLASSE().getID_CLASS());
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
    public boolean delete(Voiture v) {
        String query = "DELETE FROM EPT.VOITURE WHERE ID_V="+v.getID_V();
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
    public boolean update(Voiture v) {
        String query = String.format("UPDATE EPT.VOITURE SET MATRICULE='%s', MARQUE='%s', TYPE='%s', "
                + "PUISSANCE=%d, DATE_A='%s', PRIX_A=%f, ETAT='%s', RADIO=%b, CLIMAT=%b, ABS=%b,"
                + " AIRBAG=%b, ID_CLASS=%d WHERE ID_V = %d ",v.getMATRICULE(),v.getMARQUE(),
                v.getTYPE(),v.getPUISSANCE(),v.getDATE_A(),v.getPRIX_A(),v.getETAT(),v.getRADIO(),
                v.getCLIMAT(),v.getABS(),v.getAIRBAG(),v.getCLASSE().getID_CLASS(),v.getID_V());
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
    public Voiture find(int id) {
        String query = "SELECT * FROM EPT.VOITURE WHERE ID_V = " + id +" AND ETAT LIKE 'Disponible'";
        Voiture v = null;
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);res.next();
            v = new Voiture(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),
                res.getInt(5),res.getString(6),res.getDouble(7),res.getString(8),res.getBoolean(9),
                res.getBoolean(10),res.getBoolean(11),res.getBoolean(12),clDAO.find(res.getInt(13)));
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
    public Vector<Integer> findIDs() {
        Vector<Integer> v = new Vector();
        String query = "SELECT ID_V FROM EPT.VOITURE WHERE ETAT LIKE 'Disponible'";
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
    public Vector<Voiture> find(String mat, String marque, String type, boolean r, boolean c, boolean abs, boolean ab) {
        Vector<Voiture> vec = new Vector();
        String query = String.format("SELECT * FROM EPT.VOITURE WHERE MATRICULE LIKE '%s' AND MARQUE LIKE '%s'"
                + "AND TYPE LIKE '%s' %s %s %s %s AND ETAT LIKE 'Disponible'",mat, marque, type, r?"AND RADIO=TRUE":"", c?"AND CLIMAT=TRUE":"",
                abs?"AND ABS=TRUE":"", ab?"AND AIRBAG=TRUE":"");
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()) {
                Voiture v = new Voiture(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),
                res.getInt(5),res.getString(6),res.getDouble(7),res.getString(8),res.getBoolean(9),
                res.getBoolean(10),res.getBoolean(11),res.getBoolean(12),clDAO.find(res.getInt(13)));
                vec.add(v);
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    @Override
    public Vector<String> header() {
        Vector <String> v = new Vector<>();
        try {
            String query = "SELECT * FROM EPT.VOITURE";
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            ResultSetMetaData rsmd = res.getMetaData();
            for(int i = 1; i <= rsmd.getColumnCount()-1 ;i++){
                v.add(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    @Override
    public int NextId() {
        String query = "SELECT MAX(ID_V) FROM EPT.VOITURE";
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
}
