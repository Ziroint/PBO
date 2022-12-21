package com.example.progressuas;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

// class deskripsi_controller dengan button back
public class Deskripsi_Controller {
    @FXML
    private Button back;

    // button back dengan onaction kembalikemenu
    // menggunakan class main untuk memanggil changeScene untuk ke page berikutnya.
    @FXML
    private void kembalikemenu() throws IOException {
        Main n = new Main();
        n.changeScene("bantuan.fxml");
    }
}
