package com.example.progressuas;

// connection untuk koneksi ke data, membuat objek statement
// drivermanager untuk memanggil driver JDBC ke memori dan digunakan untuk mmebuka koneksi ke sumber data
import java.sql.Connection;
import java.sql.DriverManager;

// class ConnectionClass dengan memanggil library Connection dengan nama connection
public class ConnectionClass {
    public Connection connection;
    // fungsi untuk menggambil alamat dari database yang telah dibuat.
    public Connection getConnection(){
        String dbName ="stok_barang";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }

}
