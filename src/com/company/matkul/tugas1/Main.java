package com.company.matkul.tugas1;

public class Main {
    public static void main(String[] args) {
        KRS krs = new KRS();

        krs.tambahMataKuliah("PKK");
        krs.tambahMataKuliah("PBO");
        krs.tambahMataKuliah("AOK");
        krs.tambahMataKuliah("Agama Islam");
        krs.tambahMataKuliah("Pemrograman Dasar");
        krs.tambahMataKuliah("Kewarganegaraan");
        krs.print();
    }
}
