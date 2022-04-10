package locationapp.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import locationapp.model.ModLoc;

public class ModLocDAO extends DAO<ModLoc>{

    public ModLocDAO(Connection conn) {
        super(conn);
    }

    @Override
    public boolean create(ModLoc obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ModLoc obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ModLoc obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ModLoc find(int id) {
        ModLoc m = null;
        try {
            String query = "SELECT * FROM EPT.MODE_LOC WHERE ID_MOD = "+id;
            Statement state = conn.createStatement();
            ResultSet res = state.executeQuery(query);res.next();
            m = new ModLoc(res.getInt(1),res.getString(2),res.getInt(3),res.getInt(4));
        } catch (SQLException ex) {
            Logger.getLogger(ClasseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return m;
    }

    @Override
    public Vector<String> header() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int NextId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
