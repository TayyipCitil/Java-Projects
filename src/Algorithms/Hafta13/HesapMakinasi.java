package Algorithms.Hafta13;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner giris  = new Scanner(System.in);
        System.out.println("İlk sayıyı gir: ");
        int a = giris.nextInt();
        System.out.println("İkinci sayıyı gir: ");
        int b = giris.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz: +, -, /, *");
        String metin = giris.next();
        char islem = metin.charAt(0);

        if(islem == '+')
            System.out.println("İki sayının toplamı: " + toplam(a,b));
        else if (islem == '-')
            System.out.println("İki sayının farkı: " + fark(a,b));
        else if (islem == '/')
            System.out.println("İki sayının bölümü: " + bolme(a,b));
        else if (islem == '*')
            System.out.println("İki sayının çarpımı: " + carpim(a,b));
        else
            System.out.println("Hatalı bir islem yaptınız. Tekrar çalıştırınız.");

    }
    public static int toplam(int a, int b){
        return a+b;
    }

    public static int fark (int a, int b){
        return a-b;
    }

    public static int carpim (int a, int b){
        return a*b;
    }

    public static double bolme (int a, int b) {
        return a/b;
    }
}
