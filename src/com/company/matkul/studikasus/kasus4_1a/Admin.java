package com.company.matkul.studikasus.kasus4_1a;

public class Admin extends Karyawan{
    Admin(String nama, String alamat, String noTelp, String jenisKel) {
        super(nama, alamat, noTelp, jenisKel);
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Behaviour: Memanajemen bisnis");
    }
}
