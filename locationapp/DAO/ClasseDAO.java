package locationapp.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import locationapp.model.Classe;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

public class ClasseDAO extends DAO<Classe>{

    public ClasseDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(Classe obj) {
        return false;
    }

    @Override
    public boolean delete(Classe obj) {
        return false;
    }

    @Override
    public boolean update(Classe obj) {
        return false;
    }

    @Override
    public Classe find(int id) {
        Classe c = null;
        try {
            String query = "SELECT * FROM EPT.CLASSE WHERE ID_CLASS = "+id;
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);res.next();
            c = new Classe(res.getInt(1),res.getDouble(2),res.getDouble(3));
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    public Vector<Integer> findIDs() {
        Vector<Integer> v = new Vector();
        String query = "SELECT ID_CLASS FROM EPT.CLASSE";
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
    
    @Override
    public Vector<String> header() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int NextId() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
