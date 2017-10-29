/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Dewa Pradipta
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton rdLaki;
    @FXML
    private ToggleGroup PilihanJK;
    @FXML
    private RadioButton rdPerempuan;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField editberat;
    @FXML
    private JFXTextField edittinngi;
    @FXML
    private JFXTextField beratideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton buttonProses;
    @FXML
    private JFXButton buttonReset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        int ideal = 0;
        String Nama = nama.getText();
        int Tinggi = Integer.parseInt(edittinngi.getText());
        int Berat = Integer.parseInt(editberat.getText());
        
        if(rdLaki.isSelected()){
            ideal = parseInt(edittinngi.getText()) -105;
            
            beratideal.setText(""+ideal);
        
        if(ideal == Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi: "+Tinggi+"\nIdeal ");
            saran.setText("Pertahankan");
        }
        else if(ideal < Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi"+Tinggi+"\nOverweight");
            saran.setText("Kurangi porsi makan anda");
            
        }
        else if(ideal > Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi: "+Tinggi+"\nUnderWeight ");
            saran.setText("Tambah porsi makan anda");
        }
        }
        if(rdPerempuan.isSelected()){
            ideal = parseInt(edittinngi.getText()) -110;
            beratideal.setText(""+ideal);
        
        if(ideal==Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi: "+Tinggi+"I\ndeal ");
            saran.setText("Pertahankan");
        }
        else if(ideal < Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi"+Tinggi+"\nOverweight");
            saran.setText("Kurangi porsi makan anda");
            
        }
        else if(ideal > Berat){
            hasil.setText("Nama: "+Nama+"\nTinggi: "+Tinggi+"\nUnderWeight ");
            saran.setText("Tambah porsi makan anda");
        }
        }
    }

    @FXML
    private void Hapus(ActionEvent event) {
        nama.setText("");
        edittinngi.setText("");
        editberat.setText("");
        rdLaki.setSelected(false);
        rdPerempuan.setSelected(false);
        hasil.setText("");
        saran.setText("");
        beratideal.setText("");
        saran.setText("");
    }
    
}
