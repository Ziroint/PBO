package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

// class bantuan_controller dengan button back dan deskripsi
public class Bantuan_Controller {

    @FXML
    private Button back;
    @FXML
    private Button deskripsi;

    // button back dengan onaction kembalikemenu
    // menggunakan class main untuk memanggil method changeScene untuk ke tampilan berikutnya
    @FXML
    public void kembalikemenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("main_menu.fxml");
    }

    // button deskripsi dengan onaction deskripsiaction
    // menggunakan class main untuk memanggil method changeScene untuk ke tampilan berikutnya
    @FXML
    private void deskripsiaction(ActionEvent actionEvent) throws IOException{
        Main n = new Main();
        n.changeScene("Deskripsi.fxml");
    }
}
