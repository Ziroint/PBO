package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Main_menu_Controller {

    @FXML
    private Button stockbarang;
    @FXML
    private Button bantuan;
    @FXML
    private Button keluar;

    @FXML
    public void StockBarang(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Stock_barang.fxml");
    }

    @FXML
    public void Bantuan(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("bantuan.fxml");
    }

    @FXML
    public void Exit(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Exit_menu.fxml");
    }
}
