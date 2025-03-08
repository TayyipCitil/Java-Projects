package Algorithms.Hafta12;

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        boolean devam=true;
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> ogrenciler=new ArrayList<String>();
        ArrayList<Integer> notlar=new ArrayList<Integer>();
        while (devam){
            System.out.print("(Seç) Öğrenci EKle(1),Notları Görüntüle(2),Çıkış(3): ");
            int secim=scanner.nextInt();
            scanner.nextLine();
            switch (secim){
                case 1:
                    System.out.print("Öğrenci Adı: ");
                    String ad=scanner.nextLine();
                    ogrenciler.add(ad);
                    System.out.print("Not: ");
                    int not= scanner.nextInt();
                    scanner.nextLine();//hata olamsın diye boş bir tane çalıştırıcaz "buffer" enterdan kaynaklanan bir şey
                    notlar.add(not);
                    break;
                case 2:
                    System.out.print("Hangi Öğrenci: ");
                    String ogrenci=scanner.nextLine();
                    int index=ogrenciler.indexOf(ogrenci);
                    System.out.println("Notu: "+notlar.get(index));
                    break;
                case 3:
                    devam=false;
                    break;
            }
        }
    }
}
