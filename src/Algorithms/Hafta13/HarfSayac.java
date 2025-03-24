package Algorithms.Hafta13;

import java.util.ArrayList;
import java.util.Arrays;

public class HarfSayac {
    /*
    Bir karakter dizisindeki harfleri ve bu harflerin kaç defa geçtiklerini
    iki ayrı Arraylist(yani, harfler ve sayiları) oluşturarak belirleyen program.
    Örnek:
    sayac kelimesi için: [s, a, y, c]
                         [1, 2, 1, 1]
     */
    public static void main(String[] args) {
        String kelime = "Sivas Cumhuriyet Üniversitesi";
        kelime = kelime.toLowerCase();
        ArrayList<Character> harfler = new ArrayList<Character>();
        ArrayList<Integer> adet = new ArrayList<Integer>();

        for (int i = 0; i < kelime.length(); i++) {
            char karakter = kelime.charAt(i);
            if(!(karakter==' ')) {
                if (!harfler.contains(karakter)) {
                    harfler.add(karakter);
                    adet.add(1);
                } else {
                    int indeks = harfler.indexOf(karakter);
                    adet.set(indeks, adet.get(indeks) + 1);
                }
            }
        }

        System.out.println("Harfler: " + harfler);
        System.out.println("Sayıları: " + adet);

    }
}
