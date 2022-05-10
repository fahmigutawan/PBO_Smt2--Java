package com.company.matkul.studikasus.kasus4_1a;

public class SupirTravel extends Karyawan {
    SupirTravel(String nama, String alamat, String noTelp, String jenisKel) {
        super(nama, alamat, noTelp, jenisKel);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Behaviour: Mengemudi travel");
    }
}
