package com.example.pembelianbuah.models;

public class Buah {
    String tanggal, nama, harga, jumlah, merk;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Buah(String tanggal, String nama, String harga, String jumlah, String merk) {
        this.tanggal = tanggal;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.merk = merk;
    }

    public Buah() {
    }
}
