package Algorithms.Hafta13;

import java.util.Arrays;

public class DiziSiralama {
    public static void main(String[] args) {
        int[] dizi = {5, 4, 3};
        // DiziElemanDegistirme(dizi);
        // System.out.println(Arrays.toString(dizi));
        // DiziSiralama1(dizi);
        // System.out.println(Arrays.toString(dizi));
        int[] siralanmisDizi = DiziSiralama2(dizi);
        System.out.println(Arrays.toString(siralanmisDizi));
        System.out.println(Arrays.toString(DiziSiralama2(dizi)));

    }

    public static void DiziElemanDegistirme(int[] c) {
        c[0] = 5;
        //System.out.println(dizi[0]);
    }

    public static void DiziSiralama1(int[] dizi) {
        if (dizi[0] > dizi[1]) {
            int temp = dizi[0];
            dizi[0] = dizi[1];
            dizi[1] = temp;
        }
        if (dizi[1] > dizi[2]) {
            int temp = dizi[1];
            dizi[1] = dizi[2];
            dizi[2] = temp;
        }
        if (dizi[0] > dizi[1]) {
            int temp = dizi[0];
            dizi[0] = dizi[1];
            dizi[1] = temp;
        }


    }

    public static int[] DiziSiralama2(int[] dizi) {
        if (dizi[0] > dizi[1]) {
            int temp = dizi[0];
            dizi[0] = dizi[1];
            dizi[1] = temp;
        }
        if (dizi[1] > dizi[2]) {
            int temp = dizi[1];
            dizi[1] = dizi[2];
            dizi[2] = temp;
        }
        if (dizi[0] > dizi[1]) {
            int temp = dizi[0];
            dizi[0] = dizi[1];
            dizi[1] = temp;
        }
        return dizi;
    }
}
