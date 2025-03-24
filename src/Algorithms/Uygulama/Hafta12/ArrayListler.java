package Algorithms.Uygulama.Hafta12;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListler {
    public static void main(String[] args) {
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        dizi.add(1);
        dizi.add(2);
        dizi.add(3);
        System.out.println(dizi.toString());
        System.out.println(dizi.get(2));
        dizi.set(1,5);
        System.out.println(dizi.toString());
        dizi.remove(1);
        System.out.println(dizi.toString());
        dizi.add(9);
        dizi.add(12);
        System.out.println(dizi.toString());
        System.out.println(dizi.size());
        ArrayList<Integer> dizi2= new ArrayList<Integer>();
        dizi2.add(10);
        dizi2.add(9);
        dizi2.add(8);
        Collections.sort(dizi2);
        System.out.println(dizi2.toString());

    }
}
