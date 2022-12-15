package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
public class Bantuan_Controller {

    @FXML
    private Button back;

    @FXML
    public void kembalikemenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("main_menu.fxml");
    }
}
