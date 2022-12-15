package com.example.progressuas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect_barang {
    public Connection conectbarang;

    public Connection getConectbarang() {
        String dbbarang = "stok_barang";
        String username = "root";
        String password = "";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conectbarang = DriverManager.getConnection("jdbc:mysql://localhost/" + dbbarang, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conectbarang;
    }

    private ResultSet resultSet;

    Statement statement;

    public int showdata(String query) {
        try {
            statement = conectbarang.createStatement();
            return statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println("Terjadi error yang tidak diketahui: " + e);
        }
        return 0;
    }
}