package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Exitmenu_Controller {

    @FXML
    private Button Oke;
    @FXML
    private Button Cancel;

    @FXML
    public void Okemenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Login.fxml");
    }

    @FXML
    public void CancelMenu(ActionEvent actionEvent) throws IOException{
        Main n = new Main();
        n.changeScene("Main_menu.fxml");
    }
}
