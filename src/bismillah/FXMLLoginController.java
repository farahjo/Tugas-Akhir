/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLLoginController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private Button btnsignin;
    public String User="farah";
    public String Pass="123";
    @FXML
    private Button btnsignup;
    @FXML
    private PasswordField password;
    String user, pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void signin(ActionEvent event)  {
        user=username.getText();
        pass=password.getText();
       // tampilUser.setText(username);
       // tampilPass.setText(password);
        
        if(username.equals(User) && password.equals(Pass)){
        try {
            // Hide this current window (if this is what you want)
            JOptionPane.showMessageDialog(null,"benar");
            ((Node)(event.getSource())).getScene().getWindow().hide();
            
            // Load the new fxml
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("DocumentController.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            
            // Create new stage (window), then set the new Scene
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("LOGIN");
            stage.show();
            
        } catch (IOException e) {
            System.out.println("Failed to create new Window." + e);
        }
        }
    }
    @FXML
    private void signup(ActionEvent event) {
    }
    
}
