package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

// class exitlogin_controller
// menggunakan button okeleave dan cancel
public class Exitlogin_Controller {
    @FXML
    private Button okeleave;
    @FXML
    private Button cancel;

    // okeleave dengan onaction keluaraplikasi dengan menggunakan system.exit untuk keluar dari aplikasi
    @FXML
    private void keluaraplikasi(ActionEvent actionEvent) {
        System.exit(0);
    }

    // cancel dengan onaction cancelkeluar dengan menggunakan class main dan
    // memanggil method changeScene untuk tetap pada tampilan login
    @FXML
    private void cancelkeluar(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Login.fxml");
    }
}
