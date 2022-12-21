package com.example.progressuas;

// collection untuk menyimpan dan memanipulasi sebuah objek, biasanya digunakan untuk mencari, mengurutkan menginput dan menghapus
// ObeservableList peran integral yang digunakan untuk komponen tableview
// filteredlist untuk memfilter data observablelist dengan predikat yang disediakan.
// sortedlist untuk mengurutkan data
// propertyvaluefactory untuk mengekstrak nilai dari item baris tableview
//
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

// class stockbarang_controller dengan button back, save, update, delete, view
// terdapat juga textfield untuk kode, jenis, nama, harga, jumlah, dan search
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

    // tableview dengan nama tvBooks dan kolom kode, jenis, nama, harga, jumlah
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

    Connection connection;
    Statement statement;
    ResultSet resultSet;

    // dipanggil untuk menginisialisasi
    public void initilize(URL url, ResourceBundle rb){
        viewdatabase();
    }

    // mengambil koneksi pada stock_barang
    public Connection getConnection(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stok_barang", "root","");
            return connection;
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            return null;
        }
    }

    // menggunakan method ObservableList untuk mengambil semua yang ada pada database stock_barang dan untuk menampilkan data
    public ObservableList<Tablebooks> getTablebooksList(){
        ObservableList<Tablebooks> tablebooks = FXCollections.observableArrayList();
        Connection connection = getConnection();
        String query = "SELECT * FROM stock_barang";
        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            Tablebooks stock_barang;
            while(resultSet.next()){
                stock_barang = new Tablebooks(resultSet.getString("kode_barang"), resultSet.getString("jenis_barang"), resultSet.getString("nama_barang"),
                        resultSet.getDouble("harga"), resultSet.getInt("jumlah"));
                tablebooks.add(stock_barang);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return tablebooks;
    }

    // executeQuery digunakan untuk mengesekusi perintah sql
    private void executeQuery(String insert) {
        Connection connection = getConnection();
        try{
            statement = connection.createStatement();
            statement.executeUpdate(insert);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // view database
    // menggunakan observablelist dalam table view untuk menampilkan data yang terdapat pada database
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

    // savedatabase
    // membuat method savedatabase dengan query dari sql dan memanggil fungsi cleardata, pada saat di klik textfieldny kosong
    @FXML
    private void savedatabase(ActionEvent actionEvent) {
        String insert = "Insert INTO stock_barang VALUES ('"+ kdbarang.getText() + "','" + jnsbarang.getText() + "','" + nmbarang.getText() + "'," + harga.getText() + "," +
                jlhbarang.getText() +")";
        executeQuery(insert);
        cleardata();
    }

    // update database
    // membuat method update dengan query dari sql dan memanggil fungsi cleardata, pada saat di klik textfieldny kosong
    @FXML
    private void updatedatabase(ActionEvent actionEvent) {
        String update = "UPDATE stock_barang SET jenis_barang = '"+jnsbarang.getText()+"', nama_barang = '"+ nmbarang.getText()+"', harga = " + harga.getText() + ", jumlah ="  +
                jlhbarang.getText() +" WHERE kode_barang = '" + kdbarang.getText() + "'";
        executeQuery(update);
        cleardata();
    }

    // deletedatabase
    // membuat method delete dengan query dari sql dan memanggil fungsi cleardata, pada saat di klik textfieldny kosong
    @FXML
    private void deletedatabase(ActionEvent actionEvent) {
        String delete = "DELETE FROM stock_barang WHERE kode_barang = '"+ kdbarang.getText() +"'";
        executeQuery(delete);
        cleardata();
    }

    // membuat method search agar lebih mudah
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
            // data yang telah difilter di sorting dalam table view
            SortedList<Tablebooks> sortedList = new SortedList<>(filterdata);
            sortedList.comparatorProperty().bind(tvBooks.comparatorProperty());
            tvBooks.setItems(sortedList);
        }catch(Exception e){
            System.out.println(e);
        }
    }

    // membuat onemousclick pada table, saat mengklik bagian dari table maka akan muncul pada textfield
    // menggunakan class tablebooks untuk mengambil kode, jenis, nama, harga, jumlah
    @FXML
    private void Oneclick(MouseEvent mouseEvent) {
        Tablebooks tablebooks = tvBooks.getSelectionModel().getSelectedItem();
        kdbarang.setText(tablebooks.getKode());
        jnsbarang.setText(tablebooks.getJenis());
        nmbarang.setText(tablebooks.getNama());
        harga.setText(" "+tablebooks.getHarga());
        jlhbarang.setText(" "+tablebooks.getJumlah());
    }
    // method untuk membersihkan textfield setelah diklik
    private void cleardata(){
        kdbarang.setText("");
        jnsbarang.setText("");
        nmbarang.setText("");
        harga.setText("");
        jlhbarang.setText("");
    }

    // button back dengan onaction backtomenu
    // menggunakan class main untuk memanggil method changeScene untuk ke page berikutnya
    @FXML
    public void Backtomenu(ActionEvent actionEvent) throws IOException {
        Main n = new Main();
        n.changeScene("Main_menu.fxml");
    }
}