package com.company.matkul.tugas1;

import java.util.ArrayList;

public class KRS {
    private ArrayList<String> mataKuliah;
    private int arrSize;

    public KRS(){
        mataKuliah = new ArrayList();
    }
    public void tambahMataKuliah(String matkul){
        mataKuliah.add(matkul);
    }
    public void print(){
        arrSize = mataKuliah.size();
        for(int i=0;i<arrSize;i++){
            if(arrSize>5){
                System.err.println("Error: KRS telah penuh");
                arrSize=5;
            }
            System.out.println(mataKuliah.get(i));
        }
    }
}
