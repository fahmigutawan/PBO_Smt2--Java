package com.company.prak.utp;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Fahmi Noordin R","215150200111071");
        Perpustakaan perpus = new Perpustakaan(pegawai);

        pegawai.menambahBuku("Java","Graita",5,perpus);
        pegawai.menambahBuku("Python","Safir",20,perpus);
        pegawai.menambahBuku("Javascript","Machsun",2,perpus);
        pegawai.menambahBuku("Javascript","Machsun",5,perpus);
        pegawai.menambahBuku("Kaya 7 turunan","Nabila Kol",10,perpus);
        pegawai.menambahBuku("Seni Berkayu","Hashiram Senju",10,perpus);
        pegawai.menambahBuku("Attack on Titan 139","Eren Iyega",10,perpus);
        pegawai.menambahBuku("Panduan Bermain Genshin Impact","Cantika",3,perpus);
        pegawai.menambahBuku("Cara membuat toko online","Pak Kalapak",5,perpus);
        pegawai.menambahBuku("Golang","Tiancan",3,perpus);

        pegawai.menambahPelanggan("Hayasaka","99001110009",perpus);
        pegawai.menambahPelanggan("Miyuki","99001100008",perpus);
        pegawai.menambahPelanggan("Kei","990011110077",perpus);

        pegawai.menambahBuku("Heavens","Tiancan",3,perpus);
        pegawai.menambahBuku("Kaguya-sama","Akasaka",3,perpus);
        pegawai.menambahBuku("Solo leveling","Chugong",1,perpus);

        perpus.pinjam("Hayasaka","Overlord");
        perpus.pinjam("Miyuki","Solo Leveling");
        perpus.pinjam("Kei","Solo Leveling");
        perpus.pinjam("Hayasaka","Kaguya-sama");

        pegawai.menambahBuku("Overlord","Maruyama",3,perpus);
        pegawai.menambahBuku("Kaguya-sama","Akasaka",1,perpus);
        pegawai.menambahBuku("Solo Leveling","Chugong",1,perpus);

        perpus.pinjam("Kei","Heavens");
        perpus.pinjam("Miyuki","Solo Leveling");
        perpus.pinjam("Kei","Kaguya-sama");

        pegawai.menambahPelanggan("Shinomiya","2",perpus);

        perpus.pinjam("Shinomiya","Solo Leveling");
        perpus.pinjam("Shirogane","Kaguya-sama");

        perpus.tampilkanInfoPerpustakaan();
    }
}
