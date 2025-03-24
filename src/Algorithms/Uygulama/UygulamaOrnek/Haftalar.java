package Algorithms.Uygulama.UygulamaOrnek;

public class Haftalar {
    public static void main(String[] args) {
        // Tek satır için yorum satırı yazmamızı sağlar
        /*
      Çoklu satır için yorum satırı yazmamızı sağlar
        * */
        // Tamsayılar: byte (1 byte) (-128 ile 127 arasında),
        // short (2 byte) (-32.768 ile 32.767),
        // int (4 byte) (+-2.147.1483.647),
        // long (8 byte),
        // byte sayi1=25;
        // short sayi2=31500;
        // int sayi3=56646546;
        //long sayi4=1231231231231L;

        //Ondalıklı sayılar: float ve double:
        // float (4 byte): virgülden sonra 6-7 digit
        // double (8 byte): virgülden sonra 15-16 digit
        // float sayi5=0.12312F;
        //double sayi6=0.12312312;

        // boolean (1 bitlik bir alan)
        //boolean dogruMu=true;

        //char (2 byte)
        //https://www.w3schools.com/charsets/ref_html_ascii.asp
        // char harfNotu='A';
        //char buyukA=65;

        // final: program boyunca sabit bir değer tanımlamak için kullanılır
        //final int x=5;

        // 1- Harfler, rakamlar, _ $, harf ile başlaması gerekiyor. adSoyad
        // sayi1, Sayi1


        // String
        // String ad = "Emre";
        //String soyad = "YALÇIN";
        // Casting (Dönüşüm):
        // Widening Casting (): byte --> short --> char --> int --> long --> float --> double
        // Narrowing Casting (): double --> float --> long --> int --> short--byte;

        //System.out.println(x*y);
        // double sayi=9.78;
        // int sayiInt=(int) sayi;
        // System.out.println(sayi);
        // System.out.println(sayiInt);
        // int x= 100+50;

        // int toplam1=100+50;
        //int toplam2=toplam1+250;
        // int toplam3=toplam1+toplam2;
        //int i=1;
        //i=i+5;
        // i+=5;
        // System.out.println(i);
        // Karşılaştırma operatörleri:
        // == --> Eşittir
        // != --> Eşit Değil
        // >, <, >=, <=

        // Mantıksal Operatorler:
        // && ve operator
        // || veya operatoru
        // ! değil operatoru

        // int y=5;
        // System.out.println(!(y==4));
        // String txt= "asdasdasdasdasdasdas";
        // System.out.println("Girilen metinin boyutu: " + txt.length());

        // String txt="Merhaba Dünya";
        // System.out.println(txt.toUpperCase());
        // System.out.println(txt.toLowerCase());

        // String txt="Sivas Cumhuriyet Üniversitesi";
        //System.out.println(txt.indexOf("Ün"));
        //  System.out.println(txt.charAt(0));
        // String ad = "Emre";
        // String soyad = "Yalcin";
        // System.out.println(ad.concat(soyad));
        //String txt= "Benim adım \\Emre\\ ";
        //System.out.println(txt);
        //int x=5;
        //int y=6;
        //System.out.println(x + "\n"+ y);
        // System.out.println("emre\byalcin");
        //System.out.println(Math.max(5,10));
        // System.out.println(Math.min(5,10));
        //System.out.println(Math.sqrt(64));
        // System.out.println(Math.abs(-6));
        // System.out.println(Math.random());
        // int rastgeleSayi=(int) (Math.random()*101);
        // System.out.println(rastgeleSayi);
        //  System.out.println(10==10 && 10==9);
        /*if (3==3) {
            System.out.println("Dogru döndü");
            System.out.println("Yanlıs dondu");
        }*/
        /*int x=30, y=30;
        if (x>y) {
            System.out.println("x, y'den büyüktür.");
        }
        else if (x==y){
        System.out.println("x ile y birbirine eşittir");
    }
        else {
        System.out.println("y, x'den büyüktür");
    }*/

        /* int x=20, y=30;
        String sonuc = (x>y) ? "x, y'den büyüktür." : "x, y'den küçüktür.";
        System.out.println(sonuc);
        */
        System.out.println("------------------------------------------");
        // write your code here
/*
        int sayi=(int)(Math.random()*100+1);
        System.out.println("Üretilen sayımız: "+sayi);
        if (sayi>50 || sayi%2==0){
            System.out.println("Sayımız 50'den büyük ya da çift bir sayıdır");
        }
*/
       /* int sayac=1;
        while (sayac<6){
            System.out.println(sayac);
            // sayac=sayac+1;
            // sayac++;
            // sayac+=1;
            // ++sayac;
        }*/

      /*  int sayi=2;
        while (sayi<101){
            System.out.print(sayi+ " ");
            sayi=sayi+2;
        }*/

 /*       int sayac=1;
        while (sayac<11){
            double sayi=Math.random()*50+1;
            System.out.print(String.format("%.2f",sayi) + "\t");
            sayac++;
        }*/
/*
        int i=1,toplam=0;
        while(i<6){
            toplam=toplam+i;
            i++;
        }
        System.out.println("Toplam: "+ toplam);
*/
       /* int sayi=(int) (Math.random()*100+1);
        System.out.println("Üretilen sayı: " + sayi);
        int sayac=1,toplam=0;
        while (sayac<=sayi){
            toplam=toplam+sayac;
            sayac++;
        }
        System.out.println(sayac);
        System.out.println("Toplam: "+toplam);*/

       /* int sayi=(int)(Math.random()*20+1);
        System.out.println("Üretilen  sayı: "+sayi);
        int sayac=1,faktor=1;
        while (sayac<=sayi){
            faktor=faktor*sayac;
            sayac++;
        }
        System.out.println("Üretilen sayının faktoriyeli: "+faktor);*/
/*
        int i=0;
        do {
            System.out.println("Merhaba dünya");
            i++;
        } while (i<2);*/
        /*double sayi=0;
        do {
            sayi=Math.random();
            System.out.println(String.format("%.3f",sayi));
        }while (sayi<0.5);*/

/*        for (int i = 2; i < 101; i=i+2) {
            System.out.println(i);
        }*/

        /*int sayi=(int) (Math.random()*100+1);
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
            System.out.println("Üretilen sayı mükemmel sayı değildir");*/

      /*  int sayi=(int) (Math.random()*100+1);
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
            System.out.println("Üretilen sayı tau sayısı değildir");*/

       /* for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }*/
       /* int sayac=1;
        while (sayac<10){
            if (sayac==5){
                // sayac++;
                continue;
            }
            System.out.println(sayac);
            sayac++;
        }*/
        int sayac = 1;
        while (sayac <= 100) {
            if (sayac % 2 == 0) {
                if (sayac % 3 == 0) {
                    sayac++;
                    continue;
                }
                System.out.println(sayac);
            }
            sayac++;
        }
        System.out.println("------------------------------------------");
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


        int[] dizi = {32, 4, 62, 12, 4, 23, 65, 4, 23, 2};
        int enBuyuk = dizi[0];
        int enKucuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk)
                enKucuk = dizi[i];
        }
        System.out.println("Dizinin en büyüğü: " + enBuyuk);
        System.out.println("Dizinin en küçüğü: " + enKucuk);


    }
}
