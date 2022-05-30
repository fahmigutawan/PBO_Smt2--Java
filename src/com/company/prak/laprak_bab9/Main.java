package com.company.prak.laprak_bab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var arrA = new ArrayList<TeamMember>();
        var arrB = new ArrayList<TeamMember>();
        var arrBoth = new ArrayList<TeamMember>();
        Main obj = new Main();

        arrA.add(new TeamMember("A", "1", 50, 168));
        arrA.add(new TeamMember("A", "2", 60, 170));
        arrA.add(new TeamMember("A", "3", 56, 165));
        arrA.add(new TeamMember("A", "4", 55, 168));
        arrA.add(new TeamMember("A", "5", 60, 172));
        arrA.add(new TeamMember("A", "6", 70, 170));
        arrA.add(new TeamMember("A", "7", 66, 169));
        arrA.add(new TeamMember("A", "8", 56, 165));
        arrA.add(new TeamMember("A", "9", 72, 171));
        arrA.add(new TeamMember("A", "10", 56, 166));

        arrB.add(new TeamMember("B", "1", 66, 170));
        arrB.add(new TeamMember("B", "2", 60, 167));
        arrB.add(new TeamMember("B", "3", 59, 165));
        arrB.add(new TeamMember("B", "4", 58, 166));
        arrB.add(new TeamMember("B", "5", 58, 168));
        arrB.add(new TeamMember("B", "6", 71, 175));
        arrB.add(new TeamMember("B", "7", 68, 172));
        arrB.add(new TeamMember("B", "8", 68, 171));
        arrB.add(new TeamMember("B", "9", 65, 168));
        arrB.add(new TeamMember("B", "10", 60, 169));

        for (int i = 0; i < 10; i++) {
            arrBoth.add(arrA.get(i));
            arrBoth.add(arrB.get(i));
        }

        //obj.soalSatu(arrA, arrB, arrBoth);

        obj.soalDua(arrA, arrB, arrBoth);
    }

    void soalSatu(ArrayList<TeamMember> arrA, ArrayList<TeamMember> arrB, ArrayList<TeamMember> arrBoth) {

        /**Sort tinggi ASCENDING*/
        System.out.println("Urutan tinggi ASCENDING\n");
        Collections.sort(arrBoth, new TeamMemberComparator(SortBy.TINGGI, SortMethod.ASCENDING));
        for (TeamMember item : arrBoth) {
            System.out.println(item);
        }
        System.out.println();

        /**Sort tinggi DESCENDING*/
        System.out.println("Urutan tinggi DESCENDING\n");
        Collections.sort(arrBoth, new TeamMemberComparator(SortBy.TINGGI, SortMethod.DESCENDING));
        for (TeamMember item : arrBoth) {
            System.out.println(item);
        }
        System.out.println();

        /**Sort berat ASCENDING*/
        System.out.println("Urutan berat ASCENDING\n");
        Collections.sort(arrBoth, new TeamMemberComparator(SortBy.BERAT, SortMethod.ASCENDING));
        for (TeamMember item : arrBoth) {
            System.out.println(item);
        }
        System.out.println();

        /**Sort berat DESCENDING*/
        System.out.println("Urutan berat DESCENDING\n");
        Collections.sort(arrBoth, new TeamMemberComparator(SortBy.BERAT, SortMethod.DESCENDING));
        for (TeamMember item : arrBoth) {
            System.out.println(item);
        }
        System.out.println();

        /**Nilai maksimum*/
        System.out.print("Max TB Tim A =>");
        TeamMember memberAMaxTB = arrA.stream().max(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberAMaxTB);

        System.out.print("Max TB Tim B =>");
        TeamMember memberBMaxTB = arrB.stream().max(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberBMaxTB);

        System.out.print("Max BB Tim A =>");
        TeamMember memberAMaxBB = arrA.stream().max(Comparator.comparingInt(TeamMember::getBerat)).get();
        System.out.println(memberAMaxBB);

        System.out.print("Max BB Tim B =>");
        TeamMember memberBMaxBB = arrB.stream().max(Comparator.comparingInt(TeamMember::getBerat)).get();
        System.out.println(memberBMaxBB);

        /**Nilai minimum*/
        System.out.print("Min TB Tim A =>");
        TeamMember memberAMinTB = arrA.stream().min(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberAMinTB);

        System.out.print("Min TB Tim B =>");
        TeamMember memberBMinTB = arrB.stream().min(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberBMinTB);

        System.out.print("Min BB Tim A =>");
        TeamMember memberAMinBB = arrA.stream().min(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberAMinBB);

        System.out.print("Min BB Tim B =>");
        TeamMember memberBMinBB = arrB.stream().min(Comparator.comparingInt(TeamMember::getTinggi)).get();
        System.out.println(memberBMinBB);

        TeamMember[] tmp = new TeamMember[10];
        List<TeamMember> copiedC = Arrays.asList(tmp);
        Collections.copy(copiedC, arrB);
        System.out.println();
        System.out.println("Hasil copy ke list C");
        for (TeamMember item : copiedC) {
            System.out.println(item);
        }
    }

    void soalDua(ArrayList<TeamMember> arrA, ArrayList<TeamMember> arrB, ArrayList<TeamMember> arrBoth) {
        Comparator<TeamMember> comparatorTB = Comparator.comparingInt(TeamMember::getTinggi);
        Comparator<TeamMember> comparatorBB = Comparator.comparingInt(TeamMember::getBerat);

        Collections.sort(arrB, new TeamMemberComparator(SortBy.TINGGI, SortMethod.ASCENDING));
        /**TIm B 168 & 160*/
        var tbB168 = Collections.binarySearch(arrB, new TeamMember(null, null, 0, 168), comparatorTB);
        System.out.println("HASIL CARI TB 168");
        if (tbB168!=-1){
            System.out.println(arrB.get(tbB168));
        }else{
            System.out.println("TIDAK DITEMUKAN");
        }
        System.out.println();

        var tbB160 = Collections.binarySearch(arrB, new TeamMember(null, null, 0, 160), comparatorTB);
        System.out.println("HASIL CARI TB 160");
        if(tbB160!=-1){
            System.out.println(arrB.get(tbB160));
        }else{
            System.out.println("TIDAK DITEMUKAN");
        }
        System.out.println();


        Collections.sort(arrB, new TeamMemberComparator(SortBy.BERAT, SortMethod.ASCENDING));
        /**Tim A BB 56 & 53*/

        var bbA56 = Collections.binarySearch(arrA, new TeamMember(null, null, 56, 0), comparatorBB);
        System.out.println("HASIL CARI BB 56");
        if (bbA56>=0){
            System.out.println(arrA.get(bbA56));
        }else{
            System.out.println("TIDAK DITEMUKAN");
        }
        System.out.println();

        var bbA53 = Collections.binarySearch(arrA, new TeamMember(null, null, 53, 0), comparatorBB);
        System.out.println("HASIL CARI BB 53");
        if(bbA53>=0){
            System.out.println(arrA.get(bbA53));
        }else{
            System.out.println("TIDAK DITEMUKAN");
        }
        System.out.println();


        /**MENCARI YANG SAMA*/
        for(TeamMember memberA:arrA){
            for(TeamMember memberB:arrB){
                if(memberA.tinggi == memberB.tinggi){
                    System.out.println("ADA TINGGI SAMA");
                }
                if(memberA.berat == memberB.berat){
                    System.out.println("ADA BERAT SAMA");
                }
            }
        }
    }
}
