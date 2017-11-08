
package Database;

import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class UserDB {
    
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private DatabaseConnection DBCon;
    
    public UserDB(){
        DBCon = new DatabaseConnection();
        con = DBCon.getConnection();  
    }
    
    public boolean Validate(String username, String password){
        String query = "SELECT * FROM user WHERE Username='" +  username + "' AND Password='" + password
                + "'";
        boolean result = false;
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                String user = rs.getString("Username");
                String pass = rs.getString("Password");
                if((user.equals(user)) && (pass.equals(pass))){
                    result = true;
                    break;
                }
            }
        } catch(Exception e){
            System.out.println("A database error occured! \n" + e);
        }              
        return result;
    }   
}