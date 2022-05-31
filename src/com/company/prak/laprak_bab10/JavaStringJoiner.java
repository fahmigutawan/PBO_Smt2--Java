package com.company.prak.laprak_bab10;

import java.util.StringJoiner;

public class JavaStringJoiner {
    public JavaStringJoiner() {
        StringJoiner sj = new StringJoiner(",", "{", "}");
        sj.add("USA");
        sj.add("India");
        sj.add("UK");
        System.out.println(sj);
        StringJoiner sj1 = new StringJoiner("|", "#", "#");
        sj1.add("France");
        sj1.add("Germany");
        System.out.println(sj1);
        sj1.merge(sj1);
        System.out.println(sj1);
    }
}
