package com.company.prak.utp;

public class Pegawai {
    private String nama;
    private String nomorPegawai;

    Pegawai(String nama, String nomorPegawai) {
        setNama(nama);
        setNomorPegawai(nomorPegawai);
    }

    void tampilkanInfoPegawai() {
        String tmp = String.format("""
                Informasi Pegawai di Perpustakaan :
                Nama\t\t\t: %s
                Nomor Pegawai\t: %s
                """, getNama(), getNomorPegawai());
        System.out.println(tmp);
    }

    void menambahPelanggan(String nama, String nomorPelanggan, Perpustakaan perpus) {
        perpus.listPelanggan[perpus.jumlahPelanggan] = new Pelanggan(nama, nomorPelanggan);
        perpus.jumlahPelanggan++;
    }

    void menambahBuku(String judul, String penulis, int jumlah, Perpustakaan perpus) {
        Buku existedBuku;
        int n=perpus.jumlahBuku;

        if (perpus.jumlahBuku == 0) {
            perpus.listBuku[0] = new Buku(judul, penulis, jumlah);
            perpus.jumlahBuku += 1;
        }else{
            for (int i = 0; i < n; i++) {
                if (perpus.listBuku[i].getJudul() == judul) {
                    existedBuku = perpus.listBuku[i];
                    existedBuku.setJudul(judul);
                    existedBuku.setPenulis(penulis);
                    existedBuku.setJumlah(existedBuku.getJumlah() + jumlah);
                    break;
                }else if(i==n-1){
                    perpus.listBuku[n] = new Buku(judul, penulis, jumlah);
                    perpus.jumlahBuku += 1;
                }
            }
        }
    }

    public String getNama() {
        return nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }
}
