package com.company.prak.utp;

public class Perpustakaan {
    Buku[] listBuku = new Buku[100];
    int jumlahBuku = 0;
    Pelanggan[] listPelanggan = new Pelanggan[20];
    int jumlahPelanggan = 0;
    public Pegawai pegawaiPerpus;

    Perpustakaan(Pegawai pegawai) {
        this.pegawaiPerpus = pegawai;
    }

    void pinjam(String namaPelanggan, String judulBuku) {
        Buku tmp = cariBuku(judulBuku);
        if (tmp != null) {
            Pelanggan tmpPelanggan = null;
            for (int i = 0; i < jumlahPelanggan; i++) {
                if (listPelanggan[i].getNama() == namaPelanggan) {
                    tmpPelanggan = listPelanggan[i];
                    break;
                }
            }
            if(tmpPelanggan!=null){
                tmpPelanggan.tambahBuku(tmp);
                tmp.setJumlah(tmp.getJumlah() - 1);
            }
        }
    }

    Buku cariBuku(String judulBuku) {
        Buku tmp = null;
        if (jumlahBuku > 0) {
            for (int i = 0; i < jumlahBuku; i++) {
                if (listBuku[i].getJudul() == judulBuku) {
                    if(listBuku[i].getJumlah()>0) {
                        tmp = listBuku[i];
                        break;
                    }
                }
            }
        }
        return tmp;
    }

    void tampilkanInfoPerpustakaan() {
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println();
        System.out.println("===================");
        System.out.println("Daftar Pelanggan di Perpustakaan");
        for (int i = 0; i < jumlahPelanggan; i++) {
            listPelanggan[i].tampilkanInfoPelanggan();
            System.out.println();
        }
        System.out.println("===================");
        for (int i = 0; i < jumlahBuku; i++) {
            listBuku[i].tampilkanInfoBuku();
            System.out.println();
        }
    }
}
