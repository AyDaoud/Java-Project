package locationapp.DAO;

import java.sql.Connection;
import java.util.Vector;

public abstract class DAO<T> {
    protected Connection conn = null;

    public DAO(Connection conn){
      this.conn = conn;
    }

    public abstract boolean create(T obj);

    public abstract boolean delete(T obj);

    public abstract boolean update(T obj);

    public abstract T find(int id);
    
    public abstract Vector<String> header();
    
    public abstract int NextId();
}
