package Algorithms.Uygulama.Hafta14;

import java.util.Arrays;

public class Ornek2 {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5};
        System.out.println(Arrays.toString(dizi));
        tersCevir(dizi);
    }

    static void tersCevir(int[] dizi){
        for (int i = 0; i < dizi.length/2; i++) {
            int temp= dizi[i];
            dizi[i] = dizi[dizi.length-1-i];
            dizi[dizi.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(dizi));
    }
}
