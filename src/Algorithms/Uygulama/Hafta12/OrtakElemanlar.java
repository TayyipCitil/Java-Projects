package Algorithms.Uygulama.Hafta12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OrtakElemanlar {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kaç elemanlı diziler istiyorsun: ");
        int diziBoyut = giris.nextInt();
        int[] dizi1 = new int[diziBoyut];
        int[] dizi2 = new int[diziBoyut];
        ArrayList<Integer> ortaklar = new ArrayList<Integer>();
        for (int i = 0; i < diziBoyut; i++) {
            dizi1[i] = (int) (Math.random()*10+1);
            dizi2[i] = (int) (Math.random()*10+1);
        }

        for (int i = 0; i < diziBoyut; i++) {
            for (int j = 0; j < diziBoyut; j++) {
                if(dizi1[i] == dizi2[j]){
                    boolean varMi=false;
                    for (int k = 0; k < ortaklar.size(); k++) {
                        if(ortaklar.get(k)==dizi1[i])
                            varMi=true;
                    }
                    if (!varMi)
                        ortaklar.add(dizi1[i]);
                }
            }
        }
        System.out.println("1. dizi: " + Arrays.toString(dizi1));
        System.out.println("2. dizi: " + Arrays.toString(dizi2));
        System.out.println("Ortak elemanlar: " + ortaklar.toString());

    }
}
