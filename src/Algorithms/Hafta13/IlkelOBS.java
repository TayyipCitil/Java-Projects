package Algorithms.Hafta13;

import java.util.ArrayList;
import java.util.Scanner;

public class IlkelOBS {
    /*
    1. Öğrenci ekle
    2. Notları görüntüle
    3. Çıkış
    2 tane ayrı arraylist oluşturup ilkinde öğrencilerin adı soyadı ve ikincisinde
    notlarını tutun.
     */
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        ArrayList<String> ogrenci = new ArrayList<String>();
        ArrayList<String> notlar = new ArrayList<String>();

        while (true){
            System.out.println("Seçim yapınız: ");
            System.out.println("1- Öğrenci ekle");
            System.out.println("2- Notları görüntüle");
            System.out.println("3- Çıkış");
            int secim = giris.nextInt();
            giris.nextLine();

            if(secim==1){
                System.out.println("Öğrenciyi Ad-soyad ?: ");
                String adsoyad= giris.nextLine();
                System.out.println("Notunu gir : ");
                String not = giris.nextLine();
                ogrenci.add(adsoyad);
                notlar.add(not);
            }
            else if(secim==2){
                for (int i = 0; i < ogrenci.size(); i++) {
                    System.out.println(ogrenci.get(i) + "-->" + notlar.get(i));
                }
            }
            else if (secim==3)
                break;
            else
                System.out.println("Geçersiz seçim:!! Tekrar seçiniz.");
        }



    }
}
