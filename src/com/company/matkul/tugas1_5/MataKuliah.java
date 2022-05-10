package com.company.matkul.tugas1_5;

public class MataKuliah {
    private String kode;
    private String nama;

    public MataKuliah(String kode, String nama){
        if(kode==null || nama==null){
            this.kode="";
            this.nama="";
        }
        else{
            this.kode = kode;
            this.nama = nama;
        }
    }

    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
}
