package Algorithms.Arrays;

import java.util.Scanner;

public class ElemanYazdirma {
    public static void main(String[] args) {
        // Oluşturulan dizinin elemanlarını ekrana yazdırma
        Scanner klavye = new Scanner(System.in);
        int[] dizi = new int[3];
        System.out.println("Sayilari gir: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
