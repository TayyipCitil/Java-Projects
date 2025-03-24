package Algorithms.Hafta10;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
       /* int sayi = (int) (Math.random()*9+1);
        System.out.println("Üretilen sayı: "+sayi);
        for (int i = 0; i <sayi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

       // Scanner klayve= new Scanner(System.in);
      /*  System.out.println("Lütfen okulunuzu giriniz: ");
        String okul = klayve.nextLine();
        System.out.println(okul);*/

      /*  System.out.println("Lütfen adınızı yaşınızı ve cinsiyetinizi giriniz: ");
        String ad=klayve.next();
        String yas = klayve.next();
        String cinsiyet = klayve.next();
*/
     /*   System.out.println(ad);
        System.out.println(yas);
        System.out.println(cinsiyet);*/

       /* int yeniYas=Integer.parseInt(ad);
        yeniYas=yeniYas+5;
        System.out.println(yeniYas);*/
/*
        System.out.println("yaşınızı girin");
        int yas=klayve.nextInt();
        System.out.println("Pi sayısını giriniz");
        double pi = klayve.nextDouble();
        System.out.println("Erkek misin ?");
        boolean erkekMi=klayve.nextBoolean();

        System.out.println(yas + " "+ pi + " "+ erkekMi);*/

        // Scanner klayve= new Scanner("Sivas Cumhuriyet Üniversitesi");
/*       final double PI = 3.14;
        System.out.println("Çemberin yarıçapını giriniz: ");
        double yaricap = klayve.nextDouble();
        double cevre = 2*PI*yaricap;
        double alan = PI * Math.pow(yaricap,2);
        System.out.println("Çevre: "+ String.format("%.2f",cevre));
        System.out.println("Alan: "+ String.format("%.2f",alan));*/

      /*  System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        int sayi = klayve.nextInt();
        int carpim=1;
        for (int i = 1; i <= sayi; i++) {
            carpim=carpim*i;
        }
        System.out.println(sayi+"!="+carpim);*/



      /*  while(klayve.hasNext()){
            String metin = klayve.next();
            System.out.println(metin);
        }*/

        /*Scanner klayve= new Scanner(System.in);
        int sayi, toplam=0;
        do {
            System.out.println("Sayı gir");
            sayi=klayve.nextInt();
            toplam=toplam+sayi;
        } while (sayi!=0);

        System.out.println("Girilen sayıların toplamı: "+toplam);*/
        String asalSayilar="";
        for (int sayi = 20; sayi < 200 ; sayi++) {
            boolean asalMi=true;
            for (int i = 2; i < sayi; i++) {
                if(sayi%i==0){
                    asalMi=false;
                }
            }
            if(asalMi==true)
                asalSayilar=asalSayilar+sayi+", ";
        }
        asalSayilar=asalSayilar+"\b\b";
        System.out.println(asalSayilar);



    }
}
