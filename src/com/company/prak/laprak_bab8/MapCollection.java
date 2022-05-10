package com.company.prak.laprak_bab8;

import com.company.prak.laprak_bab8.utils.Tim;
import com.company.prak.laprak_bab8.utils.ValueType;
import kotlin.Unit;

import java.util.*;

public class MapCollection {
    Map<Integer, List<Integer>> timA = new HashMap<>();
    Map<Integer, List<Integer>> timB = new HashMap<>();

    public static void main(String[] args) {
        MapCollection obj = new MapCollection();
        obj.init();

        obj.soalKedua(obj);
    }

    void soalPertama(MapCollection obj) {
        System.out.println("""
                Tinggi badan sama:
                """ + obj.getSameTB() + "\n");
        System.out.println("""
                Berat badan sama:
                """ + obj.getSameBB() + "\n");
        System.out.printf("""
                Rentang tinggi badan:
                A ==> %d
                B ==> %d
                \n""", (obj.getMaxTB(Tim.A) - obj.getMinTB(Tim.A)), (obj.getMaxTB(Tim.B) - obj.getMinTB(Tim.B)));
        System.out.printf("""
                Rentang berat badan:
                A ==> %d
                B ==> %d
                \n""", (obj.getMaxBB(Tim.A) - obj.getMinBB(Tim.A)), (obj.getMaxBB(Tim.B) - obj.getMinBB(Tim.B)));
        System.out.println("""
                Tinggi badan A yang tidak terdapat pada B
                """ + obj.getUniqueTB(Tim.A) + "\n");
        System.out.println("""
                Berat badan B yang tidak terdapat pada A
                """ + obj.getUniqueBB(Tim.B) + "\n");
    }

    void soalKedua(MapCollection obj) {
        //Change weight of team members that have 165 height.
        obj.setValue(Tim.B, ValueType.Berat, 5, 66);
        obj.setValue(Tim.B, ValueType.Berat, 9, 66);
        System.out.print("""
                Data terbaru tim B setelah tinggi 168 diupdate adalah:
                """);
        for (int i = 1; i <= timB.size(); i++) {
            System.out.println("Pemain-" + i + " " + timB.get(i));
        }
        System.out.println();

        //Put all values of members who has equals height to new Map.


        //Filtering to new Map that only team members who has 168++ height left.
    }

    void init() {
        timA.put(1, Arrays.asList(168, 50));
        timA.put(2, Arrays.asList(170, 60));
        timA.put(3, Arrays.asList(165, 56));
        timA.put(4, Arrays.asList(168, 55));
        timA.put(5, Arrays.asList(172, 60));
        timA.put(6, Arrays.asList(170, 70));
        timA.put(7, Arrays.asList(169, 66));
        timA.put(8, Arrays.asList(165, 56));
        timA.put(9, Arrays.asList(171, 72));
        timA.put(10, Arrays.asList(166, 56));

        timB.put(1, Arrays.asList(170, 66));
        timB.put(2, Arrays.asList(167, 60));
        timB.put(3, Arrays.asList(165, 59));
        timB.put(4, Arrays.asList(166, 58));
        timB.put(5, Arrays.asList(168, 58));
        timB.put(6, Arrays.asList(175, 71));
        timB.put(7, Arrays.asList(172, 68));
        timB.put(8, Arrays.asList(171, 68));
        timB.put(9, Arrays.asList(168, 65));
        timB.put(10, Arrays.asList(169, 60));
    }

    void setValue(Tim tim, ValueType valueType, int key, int value) {
        var tmpTim = timA;
        var tmpIndex = 0;

        if (tim.equals(Tim.B)) tmpTim = timB;
        if (valueType.equals(ValueType.Berat)) tmpIndex = 1;

        tmpTim.get(key).set(tmpIndex, value);
    }

    int getMaxTB(Tim tim) {
        var tmpTim = timA;
        if (tim == Tim.B) {
            tmpTim = timB;
        }

        var biggestItem = -1;
        for (int i = 1; i <= tmpTim.size(); i++) {
            biggestItem = Math.max(biggestItem, tmpTim.get(i).get(0));
        }
        return biggestItem;
    }

    int getMaxBB(Tim tim) {
        var tmpTim = timA;
        if (tim == Tim.B) {
            tmpTim = timB;
        }

        var biggestItem = -1;
        for (int i = 1; i <= tmpTim.size(); i++) {
            biggestItem = Math.max(biggestItem, tmpTim.get(i).get(1));
        }
        return biggestItem;
    }

    int getMinTB(Tim tim) {
        var tmpTim = timA;
        if (tim == Tim.B) {
            tmpTim = timB;
        }

        var smallestItem = tmpTim.get(1).get(0);
        for (int i = 1; i <= tmpTim.size(); i++) {
            smallestItem = Math.min(smallestItem, tmpTim.get(i).get(0));
        }
        return smallestItem;
    }

    int getMinBB(Tim tim) {
        var tmpTim = timA;
        if (tim == Tim.B) {
            tmpTim = timB;
        }

        var smallestItem = tmpTim.get(1).get(1);
        for (int i = 1; i <= tmpTim.size(); i++) {
            smallestItem = Math.min(smallestItem, tmpTim.get(i).get(1));
        }
        return smallestItem;
    }

    ArrayList<Integer> getSameTB() {
        var result = new ArrayList<Integer>();

        for (int i = 1; i <= timA.size(); i++) {
            var tmpA = timA.get(i).get(0);
            for (int j = 1; j <= timB.size(); j++) {
                var tmpB = timB.get(j).get(0);
                if (Objects.equals(tmpA, tmpB)) {
                    //Cek double number inside result first
                    for (int k = 0; k < result.size(); k++) {
                        if (Objects.equals(tmpA, result.get(k))) {
                            break;
                        }
                        if (k == result.size() - 1) {
                            result.add(tmpB);
                        }
                    }

                    if (result.size() == 0) {
                        result.add(tmpB);
                    }
                }
            }
        }

        return result;
    }

    ArrayList<Integer> getSameBB() {
        var result = new ArrayList<Integer>();

        for (int i = 1; i <= timA.size(); i++) {
            var tmpA = timA.get(i).get(1);
            for (int j = 1; j <= timB.size(); j++) {
                var tmpB = timB.get(j).get(1);
                if (Objects.equals(tmpA, tmpB)) {
                    //Cek double number inside result first
                    for (int k = 0; k < result.size(); k++) {
                        if (Objects.equals(tmpA, result.get(k))) {
                            break;
                        }
                        if (k == result.size() - 1) {
                            result.add(tmpB);
                        }
                    }

                    if (result.size() == 0) {
                        result.add(tmpB);
                    }
                }
            }
        }

        return result;
    }

    ArrayList<Integer> getUniqueTB(Tim tim) {
        var tmpTim = timA;
        var oppositeTim = timB;
        var result = new ArrayList<Integer>();

        if (tim.equals(Tim.B)) {
            tmpTim = timB;
            oppositeTim = timA;
        }
        for (int i = 1; i <= tmpTim.size(); i++) {
            var firstTmp = tmpTim.get(i).get(0);
            var isUnique = true;
            for (int j = 1; j <= oppositeTim.size(); j++) {
                var secTmp = oppositeTim.get(j).get(0);
                if (firstTmp.equals(secTmp)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.add(firstTmp);
            }
        }

        return result;
    }

    ArrayList<Integer> getUniqueBB(Tim tim) {
        var tmpTim = timA;
        var oppositeTim = timB;
        var result = new ArrayList<Integer>();

        if (tim.equals(Tim.B)) {
            tmpTim = timB;
            oppositeTim = timA;
        }
        for (int i = 1; i <= tmpTim.size(); i++) {
            var firstTmp = tmpTim.get(i).get(1);
            var isUnique = true;
            for (int j = 1; j <= oppositeTim.size(); j++) {
                var secTmp = oppositeTim.get(j).get(1);
                if (firstTmp.equals(secTmp)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result.add(firstTmp);
            }
        }

        return result;
    }
}
