package Algorithms.Hafta12;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Metin gir");
        int toplam = 0;
        while (giris.hasNext()){
            String sayi = giris.next();
            //System.out.println(sayi);
            if (sayi.equals("exit"))
                break;
            int gercekSayi = Integer.parseInt(sayi);
            toplam = toplam + (int) (Math.pow(gercekSayi,2));
        }
        giris.close();
        System.out.println("Sayıların karelerinin toplamı: " + toplam);


    }
}
