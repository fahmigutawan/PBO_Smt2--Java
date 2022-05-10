package com.company.matkul.tugas1_5;

public class KRS {
    private static MataKuliah[] daftarMataKuliah = new MataKuliah[5];

    public static void main(String[] args) {
        KRS krs = new KRS();
        MataKuliah nama = new MataKuliah("KODE1","NAMA1");

        try{
            krs.tambahMataKuliah(nama);
            krs.tambahMataKuliah(new MataKuliah("COM60016","Pengantar Keilmuan Komputer"));
            krs.tambahMataKuliah(new MataKuliah("COM60014","Pemrograman Dasar"));
            krs.tambahMataKuliah(new MataKuliah("COM60011","Arsitektur dan Organisasi Komputer"));
            krs.tambahMataKuliah(new MataKuliah("MPK60001","Agama Islam"));
            krs.tambahMataKuliah(new MataKuliah("UBU60004","Bahasa Inggris"));

            /** Percobaan item keenam dst (overload) **/
            krs.tambahMataKuliah(new MataKuliah("UBU60005","MATKUL KE 6"));
            krs.tambahMataKuliah(new MataKuliah("UBU60007","MATKUL KE 7"));

            /** Fungsi Print **/
            krs.print();
        }
        catch(Exception e){
            System.err.println("KRS Telah penuh");
            krs.print();
        }

        System.out.println(nama.getKode());
        System.out.println(daftarMataKuliah[0].getKode());
    }
    public void tambahMataKuliah(MataKuliah mataKuliah){
        for(int i=0;;i++){
            if(daftarMataKuliah[i]==null){
                daftarMataKuliah[i] = mataKuliah;
                break;
            }
        }
    }
    public void print(){
        for(int i=0;i<5;i++) {
            if(daftarMataKuliah[i]!=null){
                String kode = daftarMataKuliah[i].getKode();
                String matkul = daftarMataKuliah[i].getNama();
                System.out.printf("%s: %s\n",kode,matkul);
            }
        }
    }
}