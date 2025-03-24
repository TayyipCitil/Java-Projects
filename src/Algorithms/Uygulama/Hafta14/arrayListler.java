package Algorithms.Uygulama.Hafta14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListler {
    public static void main(String[] args) {
        ArrayList<String> arabalar = new ArrayList<String>();
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        ArrayList<Character> karakterler = new ArrayList<Character>();
        sayilar.add(5);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(1);


        arabalar.clear();
        arabalar.add("BMW");
        arabalar.add("Opel");
        arabalar.add("Mercedes");

        arabalar.set(1, "Ford");
        System.out.println(arabalar.get(1));
        // arabalar.remove(1);
        System.out.println(arabalar.size());

        for (int i = 0; i < arabalar.size(); i++) {
            System.out.print(arabalar.get(i)+ " ");
        }

        for(String i : arabalar){
            System.out.print(i+ " ");
        }

        Collections.sort(sayilar);
        for(int i : sayilar){
            System.out.print(i+ " ");
        }

        String[] a ={"c","b","a"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
