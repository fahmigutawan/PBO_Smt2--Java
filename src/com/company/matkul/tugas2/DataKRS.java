package com.company.matkul.tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class DataKRS {
    ArrayList<KRS> listKRS =  new ArrayList<>();

    class KRS {
        String namaKrs;

        KRS(String namaKrs) {
            this.namaKrs = namaKrs;
        }
    }

    public void add(Scanner scanner) {
        System.out.print("Masukkan nama mata kuliah => ");
        listKRS.add(new KRS(scanner.nextLine()));
    }

    public void print() {
        System.out.println("""
                ====================
                Daftar KRS terdaftar
                ====================               """);
        for (int i = 0; i < listKRS.size(); i++) {
            System.out.println((i+1) + ". "+ listKRS.get(i).namaKrs);
        }
    }

    public void remove(Scanner scanner) {
        print();
        System.out.println("""
                                
                Pilih angka KRS yang ingin dihapus
                Pilihan => 
                """);

        int number = scanner.nextInt();
        listKRS.remove(number - 1);
    }
}
