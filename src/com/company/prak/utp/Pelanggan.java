package com.company.prak.utp;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] bukuPinjaman = new Buku[3];
    private int jumlahTerpinjam;

    Pelanggan(String nama, String nomorPelanggan) {
        setNama(nama);
        setNomorPelanggan(nomorPelanggan);
    }

    void tambahBuku(Buku bukuPinjam) {
        if (bukuPinjam.getJumlah() > 0 && jumlahTerpinjam < 3) {
            bukuPinjaman[jumlahTerpinjam] = bukuPinjam;
            jumlahTerpinjam++;
        }
    }

    void tampilkanInfoPelanggan() {
        String tmp = String.format("""
                Nama\t\t\t\t: %s
                Nomor Pelanggan\t\t: %s
                Buku yang Dipinjam\t: 
                """, getNama(), getNomorPelanggan());
        for (int i = 0; i < jumlahTerpinjam; i++) {
            tmp += String.format("%d. %s\n", i + 1, bukuPinjaman[i].getJudul());
        }
        System.out.println(tmp);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
}
