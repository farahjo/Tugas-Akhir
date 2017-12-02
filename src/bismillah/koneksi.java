/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SMK TELKOM
 */
public class koneksi {
    Connection con;
    Statement stm;
    java.sql.Connection conn;
    
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/bismillahta", "root", "");
            stm = (Statement) con.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }     
}
    
void connectdb() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools
}
}