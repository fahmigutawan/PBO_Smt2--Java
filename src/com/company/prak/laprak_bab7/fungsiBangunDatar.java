package com.company.prak.laprak_bab7;

public class fungsiBangunDatar extends BangunDatar {
    @Override
    void info() {
        System.out.println("--------------------Informasi Bangun Datar--------------------");
        for (int i = 0; i < 10; i++) {
            if (listBangunDatar[i] == null) {
                break;
            }

            System.out.println((i+1) + ". " + listBangunDatar[i]);
        }
    }

    @Override
    void search(String key) {
        int count = 0;
        String sisi = "0", sudut = "0", searched = "";

        for (int i = 0; i < 10; i++) {
            if (listBangunDatar[i] == null) {
                break;
            }
            if (listBangunDatar[i].toLowerCase()
                    .contains(key.toLowerCase())) {
                count++;

                if (searched.equals("")) {
                    sisi = listSisiBangunDatar[i];
                    sudut = listSudutBangunDatar[i];
                    searched = listBangunDatar[i];
                }
            }
        }

        System.out.println("==================================================");
        System.out.println("Hasil pencarian bangun datar :");
        if (count > 0) {
            System.out.printf("""
                    Bangun Datar %s ditemukan!!
                    Jumlah bangun datar dalam list %s = %s
                    Sisi bangun datar = %s
                    Sudut bangun datar = %s
                    """, key, searched, count, sisi, sudut);
        } else {
            System.out.printf("""
                    Bangun Datar %s tidak ada dalam list bangun datar
                    """, key);
        }
        System.out.println("==================================================");
    }
}
