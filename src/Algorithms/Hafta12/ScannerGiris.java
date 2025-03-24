package Algorithms.Hafta12;

import java.util.Scanner;

public class ScannerGiris {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz: ");
        String isim = giris.nextLine();

        System.out.println("Lütfen soyadınızı giriniz: ");
        String soyisim = giris.nextLine();

        System.out.println("Yaşınızı giriniz: ");
        // String yas = giris.nextLine();
        //  int yas = giris.nextInt();
        // yas +=2;
        String yas = giris.nextLine();
        int yas1 = Integer.parseInt(yas);
        yas1 +=2;

        System.out.println("Adınız: " + isim);
        System.out.println("Soyadınız: " + soyisim);
        System.out.println("Yaşınız: "+ yas1);
    }
}
