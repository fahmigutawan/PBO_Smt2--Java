package com.company.prak.laprak_bab9;

import java.util.Comparator;

public class TeamMember {
    public String tim;
    public String urutan;

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int berat, tinggi;

    public TeamMember(String tim, String urutan, Integer berat, int tinggi) {
        this.tim = tim;
        this.urutan = urutan;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    @Override
    public String toString() {
        return String.format("==(TIM %s)==BB = %d || TB = %d", tim, berat, tinggi);
    }
}

class TeamMemberComparator implements Comparator<TeamMember> {
    SortBy sortBy;
    SortMethod sortMethod;

    public TeamMemberComparator(SortBy sortBy, SortMethod sortMethod) {
        this.sortBy = sortBy;
        this.sortMethod = sortMethod;
    }

    @Override
    public int compare(TeamMember o1, TeamMember o2) {
        if (sortBy.equals(SortBy.BERAT)) {
            if (sortMethod.equals(SortMethod.ASCENDING)) return o1.berat - o2.berat;
            if (sortMethod.equals(SortMethod.DESCENDING)) return o2.berat - o1.berat;
        }

        if (sortBy.equals(SortBy.TINGGI)) {
            if (sortMethod.equals(SortMethod.ASCENDING)) return o1.tinggi - o2.tinggi;
            if (sortMethod.equals(SortMethod.DESCENDING)) return o2.tinggi - o1.tinggi;
        }

        return 0;
    }
}
