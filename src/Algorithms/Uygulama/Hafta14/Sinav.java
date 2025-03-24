package Algorithms.Uygulama.Hafta14;

import java.util.Arrays;

public class Sinav {

    public static int[] diziDondur(int[] dizi, int miktar) {
        int n = dizi.length;
        int[] sonuc = new int[n];
        miktar = miktar % n;

        for (int i = 0; i < n; i++) {
            int yeni = (i + miktar) % n;
            sonuc[yeni] = dizi[i];
        }
        return sonuc;
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int miktar = 3;

        System.out.println("Döndürülmüş Dizi: " + Arrays.toString(diziDondur(dizi, miktar)));
    }
}
