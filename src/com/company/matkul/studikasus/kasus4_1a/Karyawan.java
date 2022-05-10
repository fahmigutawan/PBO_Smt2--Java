package com.company.matkul.studikasus.kasus4_1a;

public class Karyawan {
    String nama, alamat, noTelp, jenisKel;

    Karyawan(String nama, String alamat, String noTelp, String jenisKel){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.jenisKel = jenisKel;
    }

    public void print(){
        System.out.println("Nama: "+nama);
        System.out.println("Alamat: "+alamat);
        System.out.println("No. Telp: "+noTelp);
        System.out.println("Jenis Kelamin: "+jenisKel);
    }
}
