
package hospital_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseConnectionClass {
    Connection con = null;
    public static Connection connectDB(){
        /*try {
            
            Class.forName("org.sqlite.JDBC");
           //Connection con  = DriverManager.getConnection("jdbc:sqlite:newDB.sqlite");
            Connection con  = DriverManager.getConnection("jdbc:sqlite:DatabaseLogIn2.sqlite");

           //Connection con  = DriverManager.getConnection("jdbc:sqlite:E:/DIU/4th senester/java/DbConnection2:DatabaseLogIn2.sqlite");
            JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection failed " );
            return null;
        }*/
        
        try {           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con  = DriverManager.getConnection("jdbc:mysql://localhost/hospital","root","");
            JOptionPane.showMessageDialog(null,"connected");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Database connection failed " );
            return null;
    }
    
}
}
