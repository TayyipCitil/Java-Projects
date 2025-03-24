package Algorithms.Uygulama.Hafta14;

import java.util.Arrays;

public class uygulamaSinav {// dizinin elemanlarını miktar kadar sağa öteliycez
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        diziDondur(dizi, 100);
    }
    public static int[] kaydir(int[] dizi, int miktar) {
        int[] sonHal = new int[dizi.length];
        if (miktar >= dizi.length) {
            miktar = miktar - dizi.length;
        }
        for (int i = 0; i < dizi.length; i++) {//dizi.length-1 yapmadık çünkü eleaman sayısı kadar dönücek döngü
            if (miktar + i < sonHal.length) {
                sonHal[i + miktar] = dizi[i];
            }else{
                sonHal[(miktar+i)-sonHal.length]=dizi[i];
            }
        }
        System.out.println(Arrays.toString(sonHal));
        return dizi;
    }
    public static int[] diziDondur(int[] dizi, int miktar) {
        int n = dizi.length;
        int[] sonuc = new int[n];
        miktar = miktar % n;

        for (int i = 0; i < n; i++) {
            int yeni = (i + miktar) % n;
            sonuc[yeni] = dizi[i];
        }
        System.out.println(Arrays.toString(sonuc));
        return sonuc;
    }
}
