package Algorithms.Uygulama.Hafta12;

import java.util.Scanner;

public class VeriGiris {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Adını gir: ");
        String ad = giris.nextLine();
        System.out.println("Soyadı gir: ");
        String soyad = giris.nextLine();
        System.out.println("Yaşınızı giriniz : ");
        int yas = giris.nextInt();

        System.out.println("Adınız: " + ad +", Soyadınız: " + soyad + ", Yaşınız: " + yas);
    }
}
