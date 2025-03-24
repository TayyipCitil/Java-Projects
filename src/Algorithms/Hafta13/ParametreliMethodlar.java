package Algorithms.Hafta13;

import java.util.Scanner;

public class ParametreliMethodlar {
    public static void main(String[] args) {
       // ToplamHesapYaz(3,5);
       // ToplamHesapYaz(5,6);
       // ToplamHesapYaz(8,11);
       // ilkKarakter("has");
       // ilkKarakter("kal");
        // int toplam = ToplamHesaplama(3,5);
        // System.out.println("3 ile 5'in toplamı : " + toplam);
       // System.out.println("15 ile 15'in toplamı: " + ToplamHesaplama(15,15));
      //  System.out.println("3^5 = " + UsAlma(3,5));
        // System.out.println("2^6 = " + UsAlma(2,6));
        for (int i = 0; i < 5; i++) {
            UsAlmaKullanici();
        }

    }
    public static void ToplamHesapYaz(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        System.out.println("Toplamları: " + toplam);
    }
    public static void ilkKarakter(String kelime){
        System.out.println("İlk harfi: " + kelime.charAt(0));
    }
    public static int ToplamHesaplama(int sayi1, int sayi2){
        int toplam = sayi1 + sayi2;
        System.out.println("Deneme");
        return toplam;
        // return sayi1+sayi2;
    }
    // Us alma methodu:
    public static int UsAlma(int alt, int ust){
        int carpim = 1;
        for (int i = 0; i < ust; i++) {
            carpim=carpim*alt;
        }
        return carpim;
    }

    public static void UsAlmaKullanici(){
        Scanner giris = new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int alt = giris.nextInt();
        System.out.println("Üst değerini giriniz: ");
        int ust = giris.nextInt();
        int carpim = 1;
        for (int i = 0; i < ust; i++) {
            carpim=carpim*alt;
        }
        System.out.println(alt + "^" + ust + " = " + carpim);
    }

}
