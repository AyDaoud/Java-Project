package locationapp.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import locationapp.model.Location;

public class LocationDAO extends DAO<Location> {
    private final ClientDAO cDAO = new ClientDAO(Connect.getInstance());
    private final VoitureDAO vDAO = new VoitureDAO(Connect.getInstance());
    public LocationDAO(Connection conn) {
        super(conn);
    }
    
    @Override
    public boolean create(Location l) {
        String query = String.format("INSERT INTO EPT.LOCATION (ID_LOC, ID_CLI, ID_V, DATE_DEB,"
            + "HEURE_DEB, DATE_REST, HEURE_REST, KILO_DEB, CAUTION_PAYEE, DEDOMAGEMENT, DATE_REST_EFF, "
            + "HEURE_REST_EFF, KILO_REST) VALUES (%d, %d, %d,'%s','%s','%s','%s', %d, %b, %b, %s,"
            + "%s, %d)",l.getID_LOC(),l.getCLIENT().getID_CLI(),l.getVOITURE().getID_V(),l.getDATE_DEB(),
            l.getHEURE_DEB(),l.getDATE_REST(),l.getHEURE_REST(),l.getKILO_DEB(),l.isCAUTION_PAYEE(),l.isDEDOMAGEMENT(),
            l.getDATE_REST_EFF(), l.getHEURE_REST_EFF(), l.getKILO_REST());
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
    public boolean delete(Location l) {
        String query = "DELETE FROM EPT.LOCATION WHERE ID_V="+l.getID_LOC();
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
    public boolean update(Location l) {
        String query = String.format("UPDATE EPT.LOCATION SET ID_CLI=%d, ID_V=%d, DATE_DEB='%s',"
            + " DATE_REST='%s', HEURE_DEB='%s', HEURE_REST='%s', KILO_DEB=%d, CAUTION_PAYEE=%b,DEDOMAGEMENT=%b,"
            + " DATE_REST_EFF='%s', HEURE_REST_EFF='%s',KILO_REST=%d"
            + " WHERE ID_LOC=%d",
            l.getCLIENT().getID_CLI(),l.getVOITURE().getID_V(),l.getDATE_DEB(),l.getDATE_REST(),l.getHEURE_DEB(),
            l.getHEURE_REST(),l.getKILO_DEB(),l.isCAUTION_PAYEE(),l.isDEDOMAGEMENT(),l.getDATE_REST_EFF(),
            l.getHEURE_REST_EFF(),l.getKILO_REST(),l.getID_LOC());
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
    public Location find(int id) {
    String query = "SELECT * FROM EPT.LOCATION WHERE ID_LOC="+id;
        Location l = null;
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);res.next();
            l = new Location(res.getInt(1),res.getString(4),res.getString(5),
                res.getString(6),res.getString(7),res.getLong(8),res.getBoolean(9),res.getBoolean(10),res.getString(11),
                res.getString(12),res.getLong(13),cDAO.find(res.getInt(2)),vDAO.find(res.getInt(3)));
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
    }
    
    public Vector<Location> find(int id, String nom, String prenom) {
        Vector<Location> vec = new Vector();
        String query = String.format("SELECT * FROM EPT.LOCATION AS l  " +
                "JOIN EPT.CLIENT AS c " +
                "ON c.ID_CLI=l.ID_CLI " +
                "WHERE %s c.NOM LIKE '%s' AND c.PRÉNOM LIKE '%s'"+
                "ORDER BY ID_LOC",(id!=0)?("l.ID_LOC="+id+" AND"):"",nom,prenom);
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()) {
                Location l = new Location(res.getInt(1),res.getString(4),res.getString(5),
                res.getString(6),res.getString(7),res.getLong(8),res.getBoolean(9),res.getBoolean(10),res.getString(11),
                res.getString(12),res.getLong(13),cDAO.find(res.getInt(2)),vDAO.find(res.getInt(3)));
                vec.add(l);
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }

    public Vector<Location> findByIdv(int idv) {
        Vector<Location> vec = new Vector();
        String query = String.format("SELECT * FROM EPT.LOCATION WHERE ID_LOC=%d AND KILO_REST=0",idv);
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()) {
                Location l = new Location(res.getInt(1),res.getString(4),res.getString(5),
                res.getString(6),res.getString(7),res.getLong(8),res.getBoolean(9),res.getBoolean(10),res.getString(11),
                res.getString(12),res.getLong(13),cDAO.find(res.getInt(2)),vDAO.find(res.getInt(3)));
                vec.add(l);
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    
    @Override
    public Vector<String> header() {
        Vector <String> v = new Vector<>();
        String query = "SELECT * FROM EPT.LOCATION AS l  " +
                "JOIN EPT.CLIENT AS c " +
                "ON c.ID_CLI=l.ID_CLI " +
                "JOIN EPT.VOITURE as v " +
                "ON v.ID_V=l.ID_v ";
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            ResultSetMetaData rsmd = res.getMetaData();
            v.add(rsmd.getColumnName(1));
            v.add(rsmd.getColumnName(14));v.add(rsmd.getColumnName(15));v.add(rsmd.getColumnName(16));
            v.add(rsmd.getColumnName(19));v.add(rsmd.getColumnName(20));v.add(rsmd.getColumnName(21));
            for(int i = 4; i <= 13 ;i++){
                v.add(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    @Override
    public int NextId() {
        String query = "SELECT MAX(ID_LOC) FROM EPT.LOCATION";
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
        String query = "SELECT ID_LOC FROM EPT.LOCATION WHERE KILO_REST=0";
        Vector<Integer> v = new Vector<>();
        try{
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while(res.next()){
                v.add(res.getInt(1));
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
}
    