package com.company.prak.laprak_bab6;

import java.util.ArrayList;

public class DataInsertion {
    ArrayList<Computer> stockComputer = new ArrayList();
    ArrayList<Computer> pickedComputer = new ArrayList();
    public static int ammount = 0;
    private static final int MAX_AMMOUNT = 4;

    DataInsertion() {
        stockComputer.add(new Computer(
                "Asus",
                "ROG Strix G531G7",
                "F98725162805",
                "Intel Core i7-9750H",
                "GTX 1650 Ti",
                4000));

        stockComputer.add(new Computer(
                "Acer",
                "Predator Helios 500",
                "N83521324JFK",
                "Intel Core i9-11980HK",
                "RTX 3080",
                25000));

        stockComputer.add(new Computer(
                "Dell",
                "Alienware M15 R6",
                "X19251234NUX",
                "Intel Core i7-11800H",
                "RTX 3070",
                17000));

        stockComputer.add(new Computer(
                "MSI",
                "Prestige 15",
                "L09676543DER",
                "Intel Core i7-1185G7",
                "GTX 1650 Max-Q",
                5000));
    }

    public void addData(int choice) {
        if (ammount <= MAX_AMMOUNT) {
            pickedComputer.add(stockComputer.get(choice - 1));
            System.out.println("Data Berhasil Ditambahkan\n");
            ammount++;
        } else if (choice < 0 || choice > stockComputer.size()) {
            System.out.println("False Input\n");
        } else {
            System.out.println("Penambahan Data Melebihi Kuota\n");
        }
    }

    public void printDataInsertion() {
        for (int i = 0; i < ammount; i++) {
            System.out.println((i + 1) + ".\n" + pickedComputer.get(i));
        }
    }
}
