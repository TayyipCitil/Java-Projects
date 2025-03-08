package Algorithms;

import java.util.Scanner;

public class OtomorfikMi {
    public static void main(String[] args) {
        // b)
        int s = 1, k = 13;
        while (k > 1) {
            if (k % 3 == 0) {
                s = s + k;
            }
            k--;
        }
        System.out.println(s);

        boolean x = false, y = true;
        int i = 0;
        if (x) {
            i = 1;
            x = false;
        } else {
            i = 2;
            if (y) {
                y = false;
                i++;
            } else {
                i = i + 2;
            }
        }
        System.out.println(i);

        int sayi = 1;
        for (i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(sayi);
            }
            sayi++;
            System.out.println();

            Scanner klavye = new Scanner(System.in);
            boolean otomorfikMi = true;
            System.out.println("Lütfen sayıyı giriniz: ");
            int say = klavye.nextInt();
            int kare = say * say;
            while (say > 0) {
                if (say % 10 != kare % 10) {
                    otomorfikMi = false;
                    break;
                } else {
                    say = say / 10;
                    kare = kare / 10;
                }
            }

            if (otomorfikMi)
                System.out.println("Girilen sayı otomorfiktir");
            else
                System.out.println("Girilen sayı otomorfik değildir");

        }
    }
}