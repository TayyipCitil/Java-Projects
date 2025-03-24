package Algorithms.Hafta11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Sınav soruları çözümü:
        // b)
        /*int s=1, k=13;
        while (k>1){
            if (k%3 ==0) {
                s=s+k;
            }
            k--;
        }
        System.out.println(s);*/

       /* boolean x=false, y=true;
        int i=0;
        if(x){
            i=1;
            x=false;
        }
        else{
            i=2;
            if(y){
                y=false;
                i++;
            }
            else {
                i=i+2;
            }
        }
        System.out.println(i);*/

        /*int sayi=1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(sayi);
            }
            sayi++;
            System.out.println();*/

       /* Scanner klavye = new Scanner(System.in);
        boolean otomorfikMi = true;
        System.out.println("Lütfen sayıyı giriniz: ");
        int sayi = klavye.nextInt();
        int kare = sayi*sayi;
        while (sayi>0){
            if (sayi%10 != kare%10){
                otomorfikMi=false;
                break;
            }
            else{
                sayi=sayi/10;
                kare=kare/10;
            }
        }

        if (otomorfikMi)
            System.out.println("Girilen sayı otomorfiktir");
        else
            System.out.println("Girilen sayı otomorfik değildir");*/
/*

		// Klavyeden girilen iki sayının ebob ve ekok değerlerinin hesaplanması:
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayıları giriniz: ");
        int sayi1=klavye.nextInt();
        int sayi2=klavye.nextInt();
        int ebob=0,ekok=0;
        if (sayi1>sayi2){
            ekok=sayi1;
            ebob=sayi2;
        }
        else {
            ekok=sayi2;
            ebob=sayi1;
        }

        while (ebob>1){
            if (sayi1 % ebob==0 && sayi2%ebob==0) {
                break;
            }
            else
                ebob--;
        }

        while (ekok>0){
            if (ekok%sayi1==0 && ekok%sayi2==0) {
                break;
            }
            else
                ekok++;
        }

        System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+ekok);
*/
        
		// Dizi tanımlama ve elemanlarını tanımlama
       /* int sayi = 4;
        int[] sayiDizimiz = {1,2,3,4,5};
        String[] metinDizimiz= {"adem","mehmet","metin"};
        boolean[] dogruMuDizimiz = {true, false,true};*/

   /*     int[] sayiDizimiz;
        sayiDizimiz = new int[3];
        sayiDizimiz[0]=1;*/

		// Oluşturulan dizinin elemanlarını ekrana yazdırma
      /*  Scanner klavye = new Scanner(System.in);
        int [] dizi = new int[3];
        System.out.println("Sayilari gir: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=klavye.nextInt();
        }
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
*/
      // Klavyeden elemanları girilen dizi oluşturma ve yazma
	  /* int[] dizi;
        dizi = new int[3];*/
         /*   dizi[0]=(int) (Math.random()*10);
        System.out.println(dizi[0]);
        System.out.println(dizi[1]);
        System.out.println(dizi[2]);*/
       /* Scanner klavye= new Scanner(System.in);
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = klavye.nextInt();
        }

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+ " ");
        }*/

		// [1,10) aralğında rastgele sayılardan oluşan dizinin ortalaması
        

       /* int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*9+1);
        }
        double toplam = 0, ortalama =0;
        System.out.print("Dizinin elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            // toplam=toplam+dizi[i];
            toplam+=dizi[i];
            System.out.print(dizi[i]+" ");
        }
        ortalama=toplam/ dizi.length;
        System.out.println();
        System.out.println("Üretilen sayıların ortalaması: "+ String.format("%.2f",ortalama));*/

       // Dizinin ikinci elemanının harflerini bulma
	  
        /*String[] dizi = {"Ahmet","Mehmet"};
        for (int i = 0; i < dizi[0].length(); i++) {
            System.out.println(dizi[0].charAt(i));
        }*/

	// Dizi içerisindeki en büyük ve en küçük elemanları bulma
   

        int[] dizi = {32,4,62,12,4,23,65,4,23,2};
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk=dizi[i];
            }
            if (dizi[i]<enKucuk)
                enKucuk=dizi[i];
        }
        System.out.println("Dizinin en büyüğü: " + enBuyuk);
        System.out.println("Dizinin en küçüğü: "+enKucuk);

    }
}
