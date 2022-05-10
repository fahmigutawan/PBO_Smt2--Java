package com.company.prak.laprak_bab7;

public class Segitiga extends BangunDatar implements Hitung {
    private double alas, tinggi;

    Segitiga(String nama, double alas, double tinggi) {
        super.setNama(nama);
        super.updateListBangunDatar(nama);
        super.updateListSisiBangunDatar("3");
        super.updateListSudutBangunDatar("3");
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    void info() {
        System.out.printf("""
                Nama bangun datar : Segitiga
                Panjang alas : %.1f
                Tinggi : %.1f
                Luas : %.1f
                Keliling : %.1f
                Nilai spesial : %.1f
                """, alas, tinggi, hitungLuas(), hitungKeliling(), hitungSpesial());
    }

    @Override
    void search(String key) {

    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + hitungSpesial();
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}
