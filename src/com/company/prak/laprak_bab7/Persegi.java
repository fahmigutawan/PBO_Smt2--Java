package com.company.prak.laprak_bab7;

public class Persegi extends BangunDatar implements Hitung {
    private double panjangSisi;

    Persegi(String nama, double panjangSisi) {
        super.setNama(nama);
        super.updateListBangunDatar(nama);
        super.updateListSisiBangunDatar("4");
        super.updateListSudutBangunDatar("4");
        this.panjangSisi = panjangSisi;
    }

    @Override
    void info() {
        System.out.printf("""
                Nama bangun datar : Persegi
                Panjang sisi : %.1f
                Luas : %.1f
                Keliling : %.1f
                Nilai Spesial : %.1f
                """, panjangSisi, hitungLuas(), hitungKeliling(), hitungSpesial());
    }

    @Override
    void search(String key) {
        System.out.println("DARI PERSEGI => " + key);
    }

    @Override
    public double hitungLuas() {
        return panjangSisi * panjangSisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * panjangSisi;
    }

    @Override
    public double hitungSpesial() {
        return Math.sqrt(2 * (panjangSisi * panjangSisi));
    }
}
