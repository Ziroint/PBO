package com.example.progressuas;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;

// class untuk keluar dari menu utama
// dengan menggunakan button oke dan cancel
public class Exitmenu_Controller {
    @FXML
    private Button Oke;
    @FXML
    private Button Cancel;

    // oke menu merupakan onaction dari button oke
    // memanggil class main untuk memanggil method changeScene untuk ke tampilan berikutnya
    @FXML
    public void Okemenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Login.fxml");
    }

    // cancelmenu merupakan onaction dari button cancel
    // memanggil class main untuk memanggil method changeScene untuk ke tampilan yang sama
    @FXML
    public void CancelMenu(ActionEvent actionEvent) throws IOException{
        Main n = new Main();
        n.changeScene("Main_menu.fxml");
    }
}
