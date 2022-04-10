package locationapp.DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Connect {
    private static Connection conn;
    private String user = "ept";
    private String pass = "123";
    private String url = "jdbc:derby://localhost:1527/LocationVoitures";
    
    public Connect(){
        try {
            conn = DriverManager.getConnection(url, user, pass);       
        } catch (SQLException e) {
            
        }      
    }
    //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
    public static Connection getInstance(){
        if(conn == null)
            new Connect();
        return conn;  
    }
}