package com.example.progressuas;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;


public class Stockbarang_Controller {
    @FXML
    private Button back;
    @FXML
    private TextField kdbarang;
    @FXML
    private TextField jnsbarang;
    @FXML
    private TextField nmbarang;
    @FXML
    private TextField harga;
    @FXML
    private TextField jlhbarang;
    @FXML
    private Button save;
    @FXML
    private Button update;
    @FXML
    private Button view;
    @FXML
    private Button delete;
    @FXML
    private TextField search;

    // table
    @FXML
    private TableView <Tablebooks> tvBooks;
    @FXML
    private TableColumn <Tablebooks, String> kdbrng;
    @FXML
    private TableColumn <Tablebooks , String> jnsbrng;
    @FXML
    private TableColumn <Tablebooks , String> nmbrng;
    @FXML
    private TableColumn <Tablebooks , Double> hrgbrng;
    @FXML
    private TableColumn <Tablebooks , Integer> jlhbrng;
    @FXML
    private Button searchid;

    Connection connection;
    Statement statement;
    public void initilize(URL url, ResourceBundle rb){
        viewdatabase();
        searchdatabase();
    }
    public Connection getConnection(){
        Connection connection;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok_barang", "root","");
            return connection;
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            return null;
        }
    }
    @FXML
    private void savedatabase(ActionEvent actionEvent) {
        String insert = "Insert INTO stock_barang VALUES ('"+ kdbarang.getText() + "','" + jnsbarang.getText() + "','" + nmbarang.getText() + "'," + harga.getText() + "," + jlhbarang.getText() +")";
        executeQuery(insert);

    }
    public ObservableList<Tablebooks> getTablebooksList(){
        ObservableList<Tablebooks> tablebooks = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM stock_barang";
        Statement statement;
        ResultSet resultSet;

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Tablebooks stock_barang;
            while(resultSet.next()){
                stock_barang = new Tablebooks(resultSet.getString("kode_barang"), resultSet.getString("jenis_barang"), resultSet.getString("nama_barang"), resultSet.getDouble("harga"), resultSet.getInt("jumlah"));
                tablebooks.add(stock_barang);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return tablebooks;
    }
    // update database

    private void executeQuery(String insert) {
        Connection connection = getConnection();
        Statement statement;
        try{
            statement = connection.createStatement();
            statement.executeUpdate(insert);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // update data base

    @FXML
    private void updatedatabase(ActionEvent actionEvent) {
        String update = "UPDATE stock_barang SET jenis_barang = '"+jnsbarang.getText()+"', nama_barang = '"+ nmbarang.getText()+"', harga = " + harga.getText() + ", jumlah ="  +jlhbarang.getText() +" WHERE kode_barang = '" + kdbarang.getText() + "'";
        executeQuery(update);
    }

    // view database
    @FXML
    private void viewdatabase() {
        ObservableList<Tablebooks> list = getTablebooksList();

        kdbrng.setCellValueFactory(new PropertyValueFactory<Tablebooks, String>("kode"));
        jnsbrng.setCellValueFactory(new PropertyValueFactory<Tablebooks, String>("jenis"));
        nmbrng.setCellValueFactory(new PropertyValueFactory<Tablebooks, String>("nama"));
        hrgbrng.setCellValueFactory(new PropertyValueFactory<Tablebooks, Double>("harga"));
        jlhbrng.setCellValueFactory(new PropertyValueFactory<Tablebooks, Integer>("jumlah"));

        tvBooks.setItems(list);
    }

    @FXML
    private void deletedatabase(ActionEvent actionEvent) {
        String delete = "DELETE FROM stock_barang WHERE kode_barang = '"+ kdbarang.getText() +"'";
        executeQuery(delete);
    }

    @FXML
    private void searchdatabase() {
        try{
            ObservableList<Tablebooks> list = getTablebooksList();

            tvBooks.setItems(list);
            FilteredList<Tablebooks> filterdata = new FilteredList<>(list, b -> true);
            search.textProperty().addListener((observableValue, s, t1) -> {
                filterdata.setPredicate(stock_barang -> {
                    if (t1 == null || t1.isEmpty()) {
                        return true;
                    }
                    String lowerCaseFilter = t1.toLowerCase();

                    if (stock_barang.getJenis().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                        return true; // filter match jenis
                    } else if (stock_barang.getNama().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                        return true;
                    } else if (String.valueOf(stock_barang.getKode()).indexOf(lowerCaseFilter) != -1)
                        return true;
                    else
                        return false;

                });
            });
            SortedList<Tablebooks> sortedList = new SortedList<>(filterdata);
            sortedList.comparatorProperty().bind(tvBooks.comparatorProperty());
            tvBooks.setItems(sortedList);
        }catch(Exception e){
            System.out.println(e);
        }

    }


    @FXML
    private void Oneclick(MouseEvent mouseEvent) {
        Tablebooks tablebooks = tvBooks.getSelectionModel().getSelectedItem();
        kdbarang.setText(tablebooks.getKode());
        jnsbarang.setText(tablebooks.getJenis());
        nmbarang.setText(tablebooks.getNama());
        harga.setText(" "+tablebooks.getHarga());
        jlhbarang.setText(" "+tablebooks.getJumlah());

    }
    @FXML
    public void Backtomenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Main_menu.fxml");
    }
}
