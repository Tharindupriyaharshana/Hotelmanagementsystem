
package DB;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DBconect {
    
    public static Connection connect(){
    
    Connection conn=null;
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/villa","root","1234");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    
    return conn;
    
    }
    
}
