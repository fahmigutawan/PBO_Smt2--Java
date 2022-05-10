package com.company.matkul.tugas2;

import kotlin.Unit;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBuku {
    ArrayList<Buku> listBuku = new ArrayList<>();

    class Buku {
        String nama;

        Buku(String nama) {
            this.nama = nama;
        }
    }

    void add(Scanner scanner) {
        System.out.print("Judul buku =>");
        listBuku.add(new Buku(scanner.nextLine()));
    }

    void print() {
        System.out.println("""
                ================
                Daftar buku anda
                ================
                """);
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println(i + 1 + ". " + listBuku.get(i).nama);
        }
    }

    void remove(Scanner scanner) {
        print();
        System.out.print("""
                                
                Hapus nomor berapa?
                pilihan =>
                """);
        listBuku.remove(scanner.nextInt() - 1);
    }

    void search(Scanner scanner) {
        int number = 0;
        System.out.print("""
                
                Masukkan keyword yang anda cari
                Input =>
                """);
        String keyword = scanner.nextLine();
        System.out.println("""
                                
                Hasil cari:
                """);
        for (Buku tmp : listBuku) {
            if (tmp.nama.toLowerCase().contains(keyword.toLowerCase())) {
                number++;
                System.out.println(number + ". " + tmp.nama);
            }
        }
        number = 0;
    }
}
