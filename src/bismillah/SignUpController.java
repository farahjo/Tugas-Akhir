/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import com.jfoenix.controls.JFXTextField;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javax.swing.JOptionPane;



/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class SignUpController implements Initializable {

    @FXML
    private JFXTextField first;
    @FXML
    private JFXTextField password;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField last;
    @FXML
    private Button btnlogin;
    @FXML
    private Button btnok;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(javafx.event.ActionEvent event) throws IOException {
         try{
            String sql = "INSERT INTO ta VALUES ('"+first.getText()+"',"
            + "'"+last.getText()+"','"+email.getText()+"','"+username.getText()+"','"+password.getText()+"'}";
            
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            
            ((Node) (event.getSource())).getScene().getWindow().hide();
            
            //Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("utama.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            
            //Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("bismillah");
            stage.show();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @FXML
    private void ok(javafx.event.ActionEvent event) throws IOException {
       
    }
    
}
