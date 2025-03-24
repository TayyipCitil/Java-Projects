package Algorithms.Hafta13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BenzersizKelimeler {
    /*
    Arraylistler aracılığıyla bir metin içerisindeki benzersiz kelimeleri bulun
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Cümleyi gir: ");
        String cumle = giris.nextLine();

        String[] kelimeler = cumle.split(" ");
        ArrayList<String> tekilKelimeler = new ArrayList<String>();
        for (int i = 0; i < kelimeler.length; i++) {
            if(!(tekilKelimeler.contains(kelimeler[i])))
                tekilKelimeler.add(kelimeler[i]);
        }
        System.out.println("Tekil kelimeler: " + tekilKelimeler);
    }
}
