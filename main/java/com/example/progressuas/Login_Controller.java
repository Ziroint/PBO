package com.example.progressuas;

// fxml untuk tampilan, scene button dan label untuk button dan label dari tampilan fxml
// scene password field dan text field dari tampilan fxml
// IOException untuk menyediakan penanganan terhadap error
// sql connection untuk mengkoneksi dari database yang dibuat
// Resultset mempresentasikan hasil dari database yang dihasilkan dari statement sql select
// sql exception menyediakan penganganan terhadap kesalahan
// statement untuk mempresentasikan suatu perintah sql dan menerima objek resultset
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// membuat class dengan nama Login_Controller dengan textfield, button, dan label.
public class Login_Controller {
    @FXML
    private TextField username;
    @FXML
    private Button login;
    @FXML
    private PasswordField password;
    @FXML
    private Label salahlogin;
    @FXML
    private Button exit;

    // menggunakan method masuk menu dari button login
    @FXML
    public void masukmenu(ActionEvent actionEvent) throws SQLException {
        if(username.getText().isBlank()==false && password.getText().isBlank() == false){
            salahlogin.setText("Masukkan username dan password yang benar ");
            validasi();
        }else{
            salahlogin.setText("Tolong masukkan username dan password.");
        }
    }

    // method keluar aplikasi dari button exit
    @FXML
    private void exitaplikasi(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Exit_login.fxml");
    }

    // method validasi
    public void validasi(){
        // memanggil class main dengan nama n untuk memanggil method change scene
        Main n = new Main();
        // memanggil class connection class untuk koneksi ke database
        ConnectionClass connectionClass= new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        // membuat variabel verifikasi untuk username dan password yang sama dengan inputan
        String verifikasi = "SELECT COUNT(1) FROM login_akun WHERE Username = '"+username.getText()+"' AND passoword = '"+password.getText()+"'";

        try{
            // statement dan resultset untuk mengeksekusi query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verifikasi);

            // perulangan jika hasil dari inputan == 1 atau benar maka lanjut ke tampilan selanjutnya, jika salah maka coba lagi
            while(resultSet.next()){
                if(resultSet.getInt(1)==1){
                    n.changeScene("Main_menu.fxml");
                }else{
                    salahlogin.setText("salah inputan, coba lagi!");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        String sql ="SELECT * FROM USER;";
    }
}