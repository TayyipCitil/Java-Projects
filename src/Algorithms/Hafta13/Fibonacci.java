package Algorithms.Hafta13;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
   // Fibonacci sayıları: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ....
   /* Kullanıcıdan aldığınız n değerine göre ilk n adet fibonacci sayısını
   oluşturan bir dizi/arraylist tasarlayıp, bu diziyi/arraylisti ekrana yazdırın
    */
   public static void main(String[] args) {
       Scanner giris = new Scanner(System.in);
       System.out.println("Kaç adet fibonacci istiyorsun kral?");
       int n = giris.nextInt();
       int[] dizi = new int[n];
       dizi[0]=1; dizi[1]=1;

       for (int i = 2; i < dizi.length; i++) {
           dizi[i] = dizi[i-1] + dizi[i-2];
       }

       System.out.println(n + " adet fibonacci sayısı: " + Arrays.toString(dizi));
   }
}
