package com.company.prak.laprak_bab6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuUI menuUI = new MenuUI();
        menuUI.mainMenu();
    }
}

class MenuUI{
    Scanner scanner = new Scanner(System.in);
    DataInsertion dataInsertion = new DataInsertion();

    MenuUI(){
        System.out.println("""
                ===================================================
                            HOOP Computer & Gadgets Inc.
                ===================================================
                  
                Selamat Datang di Sistem HOOP
                Silahkan pilih menu yang dituju          
                """);
    }

    void mainMenu(){
        System.out.println("""
                Pilihan
                1. Tambah Data
                2. Cetak Data
                3. Selesai
                """);

        switch (scanner.nextInt()){
            case 1:
                printStockComputer();
                tambahData();
                break;
            case 2:
                cetakData();
                break;
            case 3:
                System.exit(120);
                System.out.println("Thank You for Using The System");
                break;
            default:
                System.out.println("Format salah, harap coba lagi\n");
                mainMenu();
                break;
        }
    }
    void tambahData(){
        System.out.print("""
                Pilihan:
                1. Pilih Komputer
                2. Keluar
                """);
        switch (scanner.nextInt()){
            case 1:
                System.out.print("Pilihan => ");
                dataInsertion.addData(scanner.nextInt());
                tambahData();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.println("Format salah, harap coba lagi\n");
                tambahData();
                break;
        }
    }
    void cetakData(){
        System.out.println("""
                        List Komputer       
                ==============================
                """);
        dataInsertion.printDataInsertion();
        mainMenu();
    }
    void printStockComputer(){
        for(int i=0;i<dataInsertion.stockComputer.size();i++){
            System.out.println(i+1+".");
            System.out.println(dataInsertion.stockComputer.get(i));
        }
    }
}
