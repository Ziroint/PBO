package com.example.progressuas;

// class Tablebooks untuk mengambil teks
public class Tablebooks {
    private String kode;
    private String jenis;
    private String nama;
    private double harga;
    private int jumlah;

    public Tablebooks(String kode, String jenis, String nama, double harga, int jumlah) {
        this.kode = kode;
        this.jenis = jenis;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getKode() {
        return kode;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}
