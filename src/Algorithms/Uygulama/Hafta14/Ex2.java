package Algorithms.Uygulama.Hafta14;

import java.util.Arrays;

public class Ex2 {
    public static void tersDizi(int[] dizi) {
        int ilk = 0, son = dizi.length - 1;
        while (ilk < son) {

            int temp = dizi[ilk];
            dizi[ilk] = dizi[son];
            dizi[son] = temp;
            ilk++;
            son--;
        }

        System.out.println("Tersine Çevrilmiş Dizi: " + Arrays.toString(dizi));
    }

    public static void main(String[] args) {
        int[] dizi = {3, 9, 1, 2, 6, 5, 2, 9, 5, 2};
        System.out.println("Orijinal Dizi: " + Arrays.toString(dizi));
        tersDizi(dizi);
    }
}
