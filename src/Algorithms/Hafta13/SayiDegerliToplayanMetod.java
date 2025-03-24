package Algorithms.Hafta13;// Ödev: kullanıcının sayı dışında bir karakter girmesi durumunu da kontrol edecek şekilde modifiye edin.


import java.util.Scanner;

public class SayiDegerliToplayanMetod {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        String sayim = giris.nextLine();
        System.out.println("Sayı değerleri toplamı : " + DegerToplam(sayim));

    }

    public static int DegerToplam(String sayi){
        int toplam = 0;
        for (int i = 0; i < sayi.length(); i++) {
            char karakter = sayi.charAt(i);
            toplam += Character.getNumericValue(karakter);
        }
        return toplam;
    }
}
