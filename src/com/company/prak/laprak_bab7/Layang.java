package com.company.prak.laprak_bab7;

public class Layang extends BangunDatar implements Hitung {
    private double diagonal1, diagonal2, sisiMiring1, sisiMiring2;

    Layang(String nama, double diagonal1, double diagonal2, double sisiMiring1, double sisiMiring2) {
        super.setNama(nama);
        super.updateListBangunDatar(nama);
        super.updateListSisiBangunDatar("4");
        super.updateListSudutBangunDatar("4");
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMiring1 = sisiMiring1;
        this.sisiMiring2 = sisiMiring2;
    }

    @Override
    void info() {
        System.out.printf("""
                Nama bangun datar : Layang
                Panjang diagonal 1 : %.1f
                Panjang diagonal 2 : %.1f
                Panjang sisi miring 1 : %.1f
                Panjang sisi miring 2 : %.1f
                Luas : %.1f
                Keliling : %.1f
                Nilai spesial : %.1f
                """, diagonal1, diagonal2, sisiMiring1, sisiMiring2, hitungLuas(), hitungKeliling(), hitungSpesial());
    }

    @Override
    void search(String key) {

    }

    @Override
    public double hitungLuas() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (sisiMiring1 + sisiMiring2);
    }

    @Override
    public double hitungSpesial() {
        double sDiagonal = Math.min(diagonal1, diagonal2) / 2;
        double sMiring = Math.min(sisiMiring1, sisiMiring2);
        double tinggiSegitigaKecil = Math.sqrt((sMiring * sMiring) - (sDiagonal * sDiagonal));
        return sDiagonal * tinggiSegitigaKecil;
    }
}
