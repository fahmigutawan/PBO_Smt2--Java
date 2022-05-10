package com.company.prak.utp;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    Buku(String judul, String penulis, int jumlah) {
        setJudul(judul);
        setPenulis(penulis);
        setJumlah(jumlah);
    }

    void tampilkanInfoBuku() {
        String tmp = String.format("""
                Judul Buku\t: %s
                Penulis\t\t: %s
                Jumlah Buku\t: %d
                """, getJudul(), getPenulis(), getJumlah());
        System.out.println(tmp);
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}