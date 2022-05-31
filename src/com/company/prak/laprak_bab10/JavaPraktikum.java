package com.company.prak.laprak_bab10;

import java.util.Iterator;
import java.util.StringTokenizer;

public class JavaPraktikum {
    public JavaPraktikum() {
        int frekuensi = 0;
        String s = """
                Saya belajar bahasa Java. 
                Bahasa Java mempunyai kelas berupa String. 
                Belajar String Java itu mudah. 
                String Java juga sering diimplementasikan.
                """;
        StringTokenizer st = new StringTokenizer(s,". \n");
        Iterator<Object> iterator = st.asIterator();

        System.out.println("==Token== ==Frekuensi==");
        while(iterator.hasNext()){
            frekuensi++;
            System.out.printf("  %-12s  %d\n", iterator.next(), frekuensi);
        }
    }
}
