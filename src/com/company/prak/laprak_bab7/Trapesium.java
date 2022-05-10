package com.company.prak.laprak_bab7;

public class Trapesium extends BangunDatar implements Hitung {
    private double alasAtas, alasBawah, tinggi;

    Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        super.setNama(nama);
        super.updateListBangunDatar(nama);
        super.updateListSisiBangunDatar("4");
        super.updateListSudutBangunDatar("4");
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    @Override
    void info() {
        System.out.printf("""
                Nama bangun datar : Trapesium
                Panjang alas atas : %.1f
                Panjang alas bawah : %.1f
                Tinggi trapesium : %.1f
                Luas : %.1f
                Keliling : %.1f
                Nilai spesial : %.1f
                """, alasAtas, alasBawah, tinggi, hitungLuas(), hitungKeliling(), hitungSpesial());
    }

    @Override
    void search(String key) {

    }

    @Override
    public double hitungLuas() {
        return ((alasAtas + alasBawah) * tinggi) / 2;
    }

    @Override
    public double hitungKeliling() {
        double alasMiring = (Math.abs((alasBawah - alasAtas))) / 2;
        double sisiMiring = Math.sqrt((tinggi * tinggi) + (alasMiring * alasMiring));
        return alasAtas + alasBawah + 2 * (sisiMiring);
    }

    @Override
    public double hitungSpesial() {
        return Math.min(alasAtas, alasBawah) * tinggi;
    }
}
