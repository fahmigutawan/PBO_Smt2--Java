package com.company.prak.laprak_bab7;

abstract class BangunDatar {
    private String nama;
    static String[] listBangunDatar = new String[10];
    static String[] listSisiBangunDatar = new String[10];
    static String[] listSudutBangunDatar = new String[10];

    abstract void info();

    abstract void search(String key);

    public static BangunDatar getInstanceBangunDatarOf(Hitung bangun) {
        BangunDatar bangunDatar = null;
        if (bangun instanceof Persegi)
            bangunDatar = (Persegi) bangun;
        else if (bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if (bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
        else if (bangun instanceof Trapesium)
            bangunDatar = (Trapesium) bangun;
        else if (bangun instanceof Layang)
            bangunDatar = (Layang) bangun;
        return bangunDatar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void updateListBangunDatar(String key) {
        int index = -1;

        for (int i = 0; i < 10; i++) {
            if (listBangunDatar[i] == null) {
                index = i;
                break;
            }
        }
        listBangunDatar[index] = key;
    }

    public void updateListSisiBangunDatar(String sisi) {
        int index = -1;

        for (int i = 0; i < 10; i++) {
            if (listSisiBangunDatar[i] == null) {
                index = i;
                break;
            }
        }
        listSisiBangunDatar[index] = sisi;
    }

    public void updateListSudutBangunDatar(String sudut) {
        int index = -1;

        for (int i = 0; i < 10; i++) {
            if (listSudutBangunDatar[i] == null) {
                index = i;
                break;
            }
        }
        listSudutBangunDatar[index] = sudut;
    }
}
