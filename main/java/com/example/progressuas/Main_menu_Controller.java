package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

// class main_menu_controller dengan button stockbarang, bantuan, keluar.
public class Main_menu_Controller {

    @FXML
    private Button stockbarang;
    @FXML
    private Button bantuan;
    @FXML
    private Button keluar;

    // button stock barang degan onaction StockBarang
    // menggunakan class main untuk memanggil method changeScene untuk ke page berikutnya
    @FXML
    public void StockBarang(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Stock_barang.fxml");
    }

    // button bantuan dengan onaction Bantuan
    // menggunakan class main untuk memanggil method changeScene untuk ke page berikutnya
    @FXML
    public void Bantuan(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("bantuan.fxml");
    }

    // button keluar dengan onaction Exit
    // menggunakan class main untuk memanggil method changeScene untuk ke page berikutnya
    @FXML
    public void Exit(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Exit_menu.fxml");
    }
}
