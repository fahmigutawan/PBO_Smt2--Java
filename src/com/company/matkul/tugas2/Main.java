package com.company.matkul.tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.onboardMenu();
    }
}

class UserInterface {
    Scanner scanner = new Scanner(System.in);
    DataKRS krs = new DataKRS();
    DataBuku buku = new DataBuku();


    void onboardMenu() {
        System.out.print("""
                                
                ==========================================================
                Selamat datang, silahkan pilih menu sesuai keinginan anda:
                ==========================================================
                                
                1. Layanan KRS
                2. Layanan Pendataan Buku
                3. Keluar
                                
                Pilihan => 
                """);
        switch (scanner.nextLine()) {
            case "1": {
                krsMenu();
                break;
            }
            case "2": {
                bukuMenu();
                break;
            }
            case "3": {
                System.exit(0);
                break;
            }
        }
    }

    void krsMenu() {
        System.out.print("""
                                
                ====================
                Menu pengelolaan KRS
                ====================
                                
                Silahkan pilih menu:
                1. Tambah KRS baru
                2. Hapus KRS
                3. Tampilkan KRS
                4. Kembali
                                
                Pilihan => 
                """);

        switch (Integer.parseInt(scanner.nextLine())) {
            case 1: {
                krsAdd();
                break;
            }
            case 2: {
                krsRemove();
                break;
            }
            case 3: {
                krsPrint();
                break;
            }
            case 4: {
                onboardMenu();
                break;
            }
        }
    }

    void krsPrint() {
        krs.print();

        System.out.print("""
                                        
                Kembali ke menu? (y/n)
                pilihan => :
                """);
        switch (scanner.nextLine().toLowerCase()) {
            case "y": {
                krsMenu();
                break;
            }
            case "n": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
                break;
            }
        }
    }

    void krsRemove() {
        krs.remove(scanner);
        System.out.print("""
                                        
                KRS Sudah dihapus.
                1. Hapus lagi
                2. Kembali ke menu
                """);
        switch ((scanner.nextLine()).toLowerCase()) {
            case "1": {
                krsRemove();
                break;
            }
            case "2": {
                krsMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
            }
        }
    }

    void krsAdd() {
        krs.add(scanner);
        System.out.print("""
                                
                Data KRS berhasil ditambahkan
                1. Tambah lagi
                2. Kembali ke menu
                """);

        switch (scanner.nextLine().toLowerCase()) {
            case "1": {
                krsAdd();
                break;
            }
            case "2": {
                krsMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
            }
        }
    }

    void bukuMenu() {
        System.out.print("""
                                
                =====================
                Menu pengelolaan BUKU
                =====================
                                
                Silahkan pilih menu:
                1. Tambah buku baru
                2. Hapus buku
                3. Tampilkan buku
                4. Cari buku
                5. Kembali
                                
                Pilihan => 
                """);
        switch (scanner.nextLine()) {
            case "1": {
                bukuAdd();
                break;
            }
            case "2": {
                bukuRemove();
                break;
            }
            case "3": {
                bukuPrint();
                break;
            }
            case "4": {
                bukuSearch();
                break;
            }
            case "5": {
                bukuMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
                break;
            }
        }
    }

    void bukuAdd() {
        buku.add(scanner);
        System.out.print("""
                                
                Buku berhasil ditambahkan
                1. Tambah lagi
                2. Kembali ke menu
                """);
        switch (scanner.nextLine()) {
            case "1": {
                bukuAdd();
                break;
            }
            case "2": {
                bukuMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
                break;
            }
        }
    }

    void bukuRemove() {
        buku.remove(scanner);
        System.out.print("""
                                
                Buku telah dihapus
                1. Hapus lagi
                2. Kembali ke menu
                """);

        switch (scanner.nextLine()) {
            case "1": {
                bukuRemove();
                break;
            }
            case "2": {
                bukuMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
            }
        }
    }

    void bukuPrint() {
        buku.print();
        System.out.print("""
                                
                Kembali ke menu? (y/n)
                """);

        switch (scanner.nextLine().toLowerCase()) {
            case "y": {
                bukuMenu();
                break;
            }
            case "n": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
            }
        }
    }

    void bukuSearch() {
        buku.search(scanner);
        System.out.print("""
                                
                Pencarian selesai
                1. Cari lagi
                2. Kembali ke menu
                """);

        switch (scanner.nextLine()) {
            case "1": {
                bukuSearch();
                break;
            }
            case "2": {
                bukuMenu();
                break;
            }
            default: {
                System.out.println("Format input salah");
                System.exit(0);
                break;
            }
        }
    }
}
