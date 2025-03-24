package Algorithms.Hafta9;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*int sayi=(int)(Math.random()*100+1);
        System.out.println("Üretilen sayımız: "+sayi);
        if (sayi>50 || sayi%2==0){
            System.out.println("Sayımız 50'den büyük ya da çift bir sayıdır");
        }

        int sayac=1;
        while (sayac<6){
            System.out.println(sayac);
            // sayac=sayac+1;
            // sayac++;
            // sayac+=1;
            // ++sayac;
        }

        int sayi=2;
        while (sayi<101){
            System.out.print(sayi+ " ");
            sayi=sayi+2;
        }

       int sayac=1;
        while (sayac<11){
            double sayi=Math.random()*50+1;
            System.out.print(String.format("%.2f",sayi) + "\t");
            sayac++;
        }

        int i=1,toplam=0;
        while(i<6){
            toplam=toplam+i;
            i++;
        }
        System.out.println("Toplam: "+ toplam);

        int sayi=(int) (Math.random()*100+1);
        System.out.println("Üretilen sayı: " + sayi);
        int sayac=1,toplam=0;
        while (sayac<=sayi){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println(sayac);
        System.out.println("Toplam: "+toplam);

        int sayi=(int)(Math.random()*20+1);
        System.out.println("Üretilen  sayı: "+sayi);
        int sayac=1,faktor=1;
        while (sayac<=sayi){
            faktor=faktor*sayac;
            sayac++;
        }
        System.out.println("Üretilen sayının faktoriyeli: "+faktor);

        int i=0;
        do {
            System.out.println("Merhaba dünya");
            i++;
        } while (i<2);
        double sayi=0;
        do {
            sayi=Math.random();
            System.out.println(String.format("%.3f",sayi));
        }while (sayi<0.5);

       for (int i = 2; i < 101; i=i+2) {
            System.out.println(i);
        }

        int sayi=(int) (Math.random()*100+1);
        // int sayi=28;
        int toplam=0;
        System.out.println("Üretilen sayı: "+sayi);
        for (int i = 1; i < sayi; i++) {
            if (sayi % i ==0) {
                System.out.print(i+" ");
                toplam=toplam+i;
            }
        }
        System.out.println();
        if (toplam == sayi) {
            System.out.println("Üretilen sayı mükemmel sayıdır");
        }
        else
            System.out.println("Üretilen sayı mükemmel sayı değildir");

        int sayi=(int) (Math.random()*100+1);
        // int sayi=28;
        int sayac=0;
        System.out.println("Üretilen sayı: "+sayi);
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i ==0) {
                System.out.print(i+" ");
                sayac++;
            }
        }
        System.out.println();
        if (sayi%sayac==0) {
            System.out.println("Üretilen sayı tau sayısıdır");
        }
        else
            System.out.println("Üretilen sayı tau sayısı değildir");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        int sayac=1;
        while (sayac<10){
            if (sayac==5){
                // sayac++;
                continue;
            }
            System.out.println(sayac);
            sayac++;
        }*/
        int sayac=1;
        while (sayac<=100){
            if(sayac%2==0){
                if(sayac%3==0){
                    sayac++;
                    continue;
                }
                System.out.println(sayac);
            }
            sayac++;
        }

    }
}
