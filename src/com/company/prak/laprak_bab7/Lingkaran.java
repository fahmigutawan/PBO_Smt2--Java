package com.company.prak.laprak_bab7;

public class Lingkaran extends BangunDatar implements Hitung {
    private double jari;
    private static final double pi = 3.14;

    Lingkaran(String nama, double jari) {
        super.setNama(nama);
        super.updateListBangunDatar(nama);
        super.updateListSisiBangunDatar("1");
        super.updateListSudutBangunDatar("0");
        this.jari = jari;
    }

    @Override
    void info() {
        System.out.printf("""
                Nama bangun datar : Lingkaran
                Panjang jari jari : %.1f
                Luas : %.1f
                Keliling : %.1f
                Nilai spesial : %.1f
                """, jari, hitungLuas(), hitungKeliling(), hitungSpesial());
    }

    @Override
    void search(String key) {

    }

    @Override
    public double hitungLuas() {
        return pi * jari * jari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * pi * jari;
    }

    @Override
    public double hitungSpesial() {
        double tembereng = (hitungLuas() / 4) - (jari * jari / 2);
        return tembereng;
    }
}
