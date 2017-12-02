/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private CheckBox a1;
    @FXML
    private Button proses;
    @FXML
    private CheckBox a2;
    @FXML
    private CheckBox a7;
    @FXML
    private CheckBox a8;
    @FXML
    private CheckBox a5;
    @FXML
    private CheckBox a6;
    @FXML
    private CheckBox a4;
    @FXML
    private CheckBox a3;
    @FXML
    private CheckBox a9;
    @FXML
    private CheckBox a11;
    @FXML
    private CheckBox a10;
    @FXML
    private TextField jumlah12;
    @FXML
    private JFXTextField pemesan;
    @FXML
    private Button cetak;
    @FXML
    private JFXRadioButton radio1;
    @FXML
    private ToggleGroup keterangan;
    @FXML
    private JFXRadioButton radio2;
    @FXML
    private JFXDatePicker waktu;
    @FXML
    private TextField jumlah1;
    @FXML
    private TextField jumlah7;
    @FXML
    private TextField jumlah6;
    @FXML
    private TextField jumlah5;
    @FXML
    private TextField jumlah4;
    @FXML
    private TextField jumlah3;
    @FXML
    private TextField jumlah2;
    @FXML
    private TextField jumlah10;
    @FXML
    private TextField jumlah11;
    @FXML
    private TextField jumlah8;
    @FXML
    private TextField jumlah9;
      @FXML
    private JFXTextField inpemesan;

    @FXML
    private JFXTextArea TA;
     int jumlahmakan,harga, jumlahminum, hargatotal;
     int total1,total2,total3,total4,total5,total6,total7,total8,total9,total10,total11;
    String menu="";
    String kasir="";
    String atasnama, tampilTotalBayar, ket, date;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
         if(a1.isSelected()){
         harga = 6000;
         menu +=a1.getText()+", ";
         jumlahmakan=Integer.parseInt(jumlah1.getText());
         total1=harga;
         System.out.println(total1);
      }
       if(a2.isSelected()){
         harga = 9500;
         menu +=a2.getText()+", ";
         jumlahmakan=Integer.parseInt(jumlah2.getText());
         total2=harga;
         System.out.println(total2);
      }
    }

    @FXML
    private void cetak(ActionEvent event) {
     if (radio1.isSelected()){
         ket = "Cash";
     } else if (radio2.isSelected()){
         ket = "Kredit";
     }else {
         ket = "";
     }
    
     atasnama = inpemesan.getText();
     date = waktu.getValue().toString();
     
     TA.setText("Nama Pemesan :" +atasnama+ "\n" + "Pembayaran :" +ket+ "\n" + "Tanggal Pemesanan :" +date+ "\n");
            
    }
    
}
