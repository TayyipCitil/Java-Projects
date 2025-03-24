package Algorithms.Uygulama.Hafta14;

import java.util.Scanner;

public class Ex1 {
    public static boolean ciftMi(int sayi) {
        while (sayi != 0) {
            int basamak = sayi % 10;
            if (basamak % 2 != 0) {
                return false;
            }
            sayi /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        System.out.println("Tüm basamaklar çift mi? " + ciftMi(sayi));
    }
}

