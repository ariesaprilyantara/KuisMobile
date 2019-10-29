package com.example.kuis;
import android.graphics.drawable.Drawable;

public class Anggota {

    private String nama, status;
    private Drawable gambar;

    public Anggota(String nama, String status, Drawable gambar) {
        this.nama = nama;
        this.status = status;
        this.gambar = gambar;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
