
package Menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
    
    private static Connection koneksi;
    
    
    public static Connection getConnections() throws SQLException {
        String db = "jdbc:mysql://localhost:3306/db_ppesawat";
        String user = "root";
        String pass = "";
        
        if(koneksi == null) {
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        
        return koneksi;
    } 
    
}
