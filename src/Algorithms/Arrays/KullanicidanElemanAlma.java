package Algorithms.Arrays;

import java.util.Scanner;

public class KullanicidanElemanAlma {
    public static void main(String[] args) {
        // Klavyeden elemanları girilen dizi oluşturma ve yazma
        int[] dizi;
        dizi = new int[3];
        dizi[0]=(int) (Math.random()*10);
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(dizi[2]);
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
}
