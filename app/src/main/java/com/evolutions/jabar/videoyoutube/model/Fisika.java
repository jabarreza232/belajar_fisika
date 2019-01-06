package com.evolutions.jabar.videoyoutube.model;

import java.io.Serializable;

public class Fisika  implements Serializable{
    String judul,isi_materi,gambar,isi_materi2;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi_materi() {
        return isi_materi;
    }

    public void setIsi_materi(String isi_materi) {
        this.isi_materi = isi_materi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getIsi_materi2() {
        return isi_materi2;
    }

    public void setIsi_materi2(String isi_materi2) {
        this.isi_materi2 = isi_materi2;
    }
}
