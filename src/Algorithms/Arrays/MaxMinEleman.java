package Algorithms.Arrays;

public class MaxMinEleman {
    public static void main(String[] args) {
        // Dizi içerisindeki en büyük ve en küçük elemanları bulma
        int[] dizi = {32, 4, 62, 12, 4, 23, 65, 4, 23, 2};
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk)
                enKucuk = dizi[i];
        }
        System.out.println("Dizinin en büyüğü: " + enBuyuk);
        System.out.println("Dizinin en küçüğü: " + enKucuk);
    }
}
