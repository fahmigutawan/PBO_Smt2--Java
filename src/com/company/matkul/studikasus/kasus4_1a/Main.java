package com.company.matkul.studikasus.kasus4_1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Karyawan[] arrKaryawan = new Karyawan[3];

        for(int i=0;i<arrKaryawan.length;i++){
            System.out.println("\nMasukkan kategori");
            String kategori = scanner.nextLine();

            switch(kategori){
                case "supir travel":
                    arrKaryawan[i] = new SupirTravel(
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine()
                    );
                    arrKaryawan[i].print();
                    break;
                case "supir rentcar":
                    arrKaryawan[i] = new SupirRentCar(
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine()
                    );
                    arrKaryawan[i].print();
                    break;
                case "admin":
                    arrKaryawan[i] = new Admin(
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine(),
                            scanner.nextLine()
                    );
                    arrKaryawan[i].print();
                    break;
            }
        }
    }
}
