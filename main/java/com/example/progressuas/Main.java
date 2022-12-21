package com.example.progressuas;

// memangill fungsi library dari javafx application untuk aplikasi, fxml untuk tampilan page,
// scene untuk berpindah ke page berikutnya, stage berisi semua objek aplikasi dan dapat dipanggil dengan show()
// IOException untuk menyediakan penangan terhadap erorr
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


// class main dari application javafx
public class Main extends Application {
    // membuat nama Stage menjadi stg
    private static Stage stg;
    @Override
    public void start(Stage primaryStage) throws IOException {
        // memulai aplikasi dalam halaman login dengan menggunakan FXMLLoader dan juga Scene
        stg = primaryStage;
        stg.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setTitle("Manajemen Stok Barang Alat Tulis");
        stg.setScene(scene);
        stg.show();

    }

    // method changeScene untuk menganti ke page berikutnya
    public void changeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args) {
        launch();
    }
}