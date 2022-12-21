module com.example.progressuas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens com.example.progressuas to javafx.fxml;
    exports com.example.progressuas;
}