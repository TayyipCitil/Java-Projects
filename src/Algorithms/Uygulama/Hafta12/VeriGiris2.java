package Algorithms.Uygulama.Hafta12;

import java.util.Scanner;
import java.util.Arrays;

public class VeriGiris2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kaç elemanlı dizi istiyorsun: ");
        int diziboyut = giris.nextInt();
        int[] dizi = new int[diziboyut];

        for (int i = 1; i < diziboyut+1; i++) {
            System.out.println(i + ". elemanı giriniz: ");
            dizi[i-1] = giris.nextInt();
        }
        System.out.println("Oluşturduğunuz dizi: " + Arrays.toString(dizi));
    }
}
