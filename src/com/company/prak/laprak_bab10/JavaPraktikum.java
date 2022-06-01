package com.company.prak.laprak_bab10;

import java.util.*;

public class JavaPraktikum {
    public JavaPraktikum() {
        String s = """
                Saya belajar bahasa Java. 
                Bahasa Java mempunyai kelas berupa String. 
                Belajar String Java itu mudah. 
                String Java juga sering diimplementasikan.
                """;
        StringTokenizer st = new StringTokenizer(s.toLowerCase(Locale.ROOT), ". \n");
        Iterator<Object> it = st.asIterator();
        ArrayList<String> arr = new ArrayList<>();

        while (it.hasNext()) {
            arr.add(it.next().toString());
        }

        //checking
        System.out.println("==Token== ==Frekuensi==");
        while (arr.size() != 0) {
            String word = arr.get(0);
            int freq = 1;
            int size = arr.size();

            int i = 1;
            do {
                if(size != 1){
                    if (word.equals(arr.get(i))) {
                        arr.remove(arr.get(i));
                        size--;
                        freq++;
                    }
                }
                i++;
            } while (i < size);
            System.out.printf("  %-12s  %d\n", word, freq);
            arr.remove(word);
        }
    }
}
