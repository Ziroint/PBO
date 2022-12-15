package com.example.progressuas;

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


    @FXML
    public void masukmenu(ActionEvent actionEvent) throws SQLException {
        if(username.getText().isBlank()==false && password.getText().isBlank() == false){
            salahlogin.setText("Masukkan username dan password yang benar ");

            validasi();
        }else{
            salahlogin.setText("Tolong masukkan username dan password.");
        }
    }
    @FXML
    private void exitaplikasi(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Exit_login.fxml");
    }
    public void validasi(){
        Main n = new Main();
        ConnectionClass connectionClass= new ConnectionClass();
        Connection connection = connectionClass.getConnection();

        String verifikasi = "SELECT COUNT(1) FROM login_akun WHERE Username = '"+username.getText()+"' AND passoword = '"+password.getText()+"'";

        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(verifikasi);

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