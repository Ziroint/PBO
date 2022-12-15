package com.example.progressuas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Exitlogin_Controller {
    @FXML
    private Button okeleave;
    @FXML
    private Button cancel;
    private AnchorPane scenePane;

    Stage stage;
    @FXML
    private void keluaraplikasi(ActionEvent actionEvent) {
        System.exit(0);
        //stage = (Stage) scenePane.getScene().getWindow();
        //stage.close();
    }

    @FXML
    private void cancelkeluar(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Login.fxml");
    }
}
