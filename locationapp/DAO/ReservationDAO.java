package locationapp.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import locationapp.model.Reservation;


public class ReservationDAO extends DAO<Reservation> {
    private final ClientDAO cDAO = new ClientDAO(Connect.getInstance());
    private final VoitureDAO vDAO = new VoitureDAO(Connect.getInstance());
    public ReservationDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Reservation r) {
        String query = String.format("INSERT INTO EPT.RESERVATION (ID_RES, ID_CLI, ID_V, DATE_DEB,"
            + " HEURE_DEB, DATE_FIN, HEURE_FIN, ETAT, RAISON_D_ANNUL) VALUES (%d,%d,%d,'%s','%s','%s','%s',"
            + " 'En cours', NULL)",r.getID_RES(),r.getCLIENT().getID_CLI(),r.getVOITURE().getID_V(),r.getDATE_DEB(),r.getHEURE_DEB(),
            r.getDATE_FIN(),r.getHEURE_FIN());
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
    public boolean delete(Reservation r) {
        String query = "DELETE FROM EPT.Reservation WHERE ID_V="+r.getID_RES();
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
    public boolean update(Reservation r) {
        String query = String.format("UPDATE EPT.RESERVATION SET ID_CLI=%d, ID_V=%d, DATE_DEB='%s',"
            + " HEURE_DEB='%s', DATE_FIN='%s', HEURE_FIN='%s', ETAT='%s', RAISON_D_ANNUL='%s' WHERE ID_RES=%d ",
            r.getCLIENT().getID_CLI(),r.getVOITURE().getID_V(),r.getDATE_DEB(),r.getHEURE_DEB(),r.getDATE_FIN(),
            r.getHEURE_FIN(),r.getETAT(),r.getRAISON_D_ANNUL(),r.getID_RES());
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
    public Reservation find(int id) {
        String query = "SELECT * FROM EPT.RESERVATION WHERE ID_RES="+id;
        Reservation r = null;
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);res.next();
            r = new Reservation(res.getInt(1),res.getString(4),res.getString(5),res.getString(6),res.getString(7),
                    res.getString(8),res.getString(9),cDAO.find(res.getInt(2)),vDAO.find(res.getInt(3)));
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return r;
    }
    
    public Vector<Reservation> find(int id, String nom, String prenom) {
        Vector<Reservation> vec = new Vector();
        String query = String.format("SELECT * FROM EPT.RESERVATION AS r  " +
                "JOIN EPT.CLIENT AS c " +
                "ON c.ID_CLI=r.ID_CLI " +
                "WHERE %s c.NOM LIKE '%s' AND c.PRÉNOM LIKE '%s'"+ 
                "ORDER BY ID_RES ASC",(id!=0)?("r.ID_RES="+id+" AND"):"",nom,prenom);
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next()) 
            {
                Reservation r = new Reservation(res.getInt(1),res.getString(4),res.getString(5),res.getString(6),
                        res.getString(7),res.getString(8),res.getString(9),cDAO.find(res.getInt(2)),
                        vDAO.find(res.getInt(3)));
                vec.add(r);
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vec;
    }
    
    public Vector<Reservation> findByIdv(int idv) {
        Vector<Reservation> vec = new Vector();
        String query = String.format("SELECT * FROM EPT.RESERVATION WHERE ID_V=%d AND ETAT='En cours'",idv);
        try {
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while (res.next())
            {
                Reservation r = new Reservation(res.getInt(1),res.getString(4),
                res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),
                        cDAO.find(res.getInt(2)),vDAO.find(res.getInt(3)));
                vec.add(r);
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
            String query = "SELECT * FROM EPT.RESERVATION AS r  " +
                "JOIN EPT.CLIENT AS c " +
                "ON c.ID_CLI=r.ID_CLI " +
                "JOIN EPT.VOITURE as v " +
                "ON v.ID_V=r.ID_v ";
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            ResultSetMetaData rsmd = res.getMetaData();
            v.add(rsmd.getColumnName(1));
            v.add(rsmd.getColumnName(10));v.add(rsmd.getColumnName(11));v.add(rsmd.getColumnName(12));
            v.add(rsmd.getColumnName(15));v.add(rsmd.getColumnName(17));v.add(rsmd.getColumnName(18));
            for(int i = 4; i <= 9 ;i++){
                v.add(rsmd.getColumnName(i));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }

    @Override
    public int NextId() {
        String query = "SELECT MAX(ID_RES) FROM EPT.RESERVATION";
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
        String query = "SELECT ID_RES FROM EPT.RESERVATION "
                + "WHERE ETAT='En cours'" 
                + "ORDER BY ID_RES ASC";
        Vector<Integer> v = new Vector<>();
        try{
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);
            while(res.next()){
                //if(res.getInt(1)!=-1)return v;
                v.add(res.getInt(1));
            }
        } catch (SQLException ex) {
           Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v;
    }
}
