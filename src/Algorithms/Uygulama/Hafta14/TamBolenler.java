package Algorithms.Uygulama.Hafta14;

import java.util.ArrayList;

public class TamBolenler {
    public static void main(String[] args) {
        // Aldığı sayının tam bölenlerini arraylist olarak geri dönderen
        System.out.println(bolenler(12));
        System.out.println(bolenler(80));
    }
    static ArrayList bolenler(int sayi){
        ArrayList<Integer> bolenler = new ArrayList<Integer>();
        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0)
                bolenler.add(i);
        }
        return bolenler;
    }
}
