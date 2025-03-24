package Algorithms.Hafta8;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println(Math.pow(2,3));
        // System.out.println(Math.max(3,5));
        //System.out.println(Math.min(3,5));
        // System.out.println(Math.abs(-7));
        // System.out.println(Math.sqrt(15));
        //int rastgeleSayi=(int)(Math.random()*100+1);
        //System.out.println(rastgeleSayi);
        //System.out.println(Math.log10(100));
        // double aci=Math.cos(Math.toRadians(60));
        // System.out.println(String.format("%.2f",aci));
        // Daha çok Math metodu için: https://www.w3schools.com/java/java_ref_math.asp
        /*String metin ="Bu bizim ikinci java dersimiz";
        String metin1=""
        System.out.println(metin.length());
        System.out.println(metin.charAt(0));*/
        // Daha çok String methodu için --> https://www.w3schools.com/java/java_ref_string.asp
        /*int x=3;
        if (x > 3) {
            System.out.println("Verdiğimiz sayı 3'den büyüktür.");
        }
        else if (x < 3) {
            System.out.println("Verdiğimiz sayı 3'den küçüktür.");
        }
        else
            System.out.println("Verdiğimiz sayı 3e eşittir.");*/

        /*int sayimiz=(int) (Math.random()*10+1);
        System.out.println("Üretilen sayımız: "+sayimiz);
        if (sayimiz >5) {
            System.out.println("Üretilen sayı 5'den büyüktür.");
        }
        else if (sayimiz <5) {
            System.out.println("Üretilen sayı 5'den küçüktür.");
        }
        else
            System.out.println("Üretilen sayı 5'e eşittir.");
*/
  /*      int x=2;
        String metin= (x>3) ? "x 3'den büyüktür": "x 3'den küçüktür";
        System.out.println(metin);*/
        // int rastgeleSayi=(int)(Math.random()*100+1);
        //int kalan=rastgeleSayi%2;
        /*System.out.println(rastgeleSayi);
        if (rastgeleSayi%2 == 1) {
            System.out.println("Sayımız tektir.");
        }
        else
            System.out.println("Sayımız çifttir.");*/
/*

        int rastgeleSayi=(int)(Math.random()*100-50);
        System.out.println(rastgeleSayi);
        if (rastgeleSayi>0)
            System.out.println("Sayı pozitiftir");
        else if (rastgeleSayi<0)
            System.out.println("Sayı negatiftir.");
        else
            System.out.println("Sayı sıfırdır");
*/
/*        final double sayi=3.15;
        sayi=4.0;*/
       /* int vizeNotu=80, finalNotu=70;
        int dersNotu=(int) ((vizeNotu*0.4)+(finalNotu*0.6));
        String harfNotu="";
        if (dersNotu>90)
            harfNotu="AA";
        else if(dersNotu>80)
            harfNotu="BA";
        else if (dersNotu>70)
            harfNotu="BB";
        else if (dersNotu>60)
            harfNotu="CB";
        else
            harfNotu="FF";

        if (harfNotu!="FF")
            System.out.println("Bravo! Geçtiniz. Ders Notunuz: "+dersNotu+ " Harf Notunuz: "+harfNotu);
        else
            System.out.println("Eyvah! Kaldınız. Harf Notunuz: "+harfNotu);*/
/*
        int gun=6;
        switch (gun){
            case 1:
                System.out.println("Bugün günlerden Ptesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden Perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            default:
                System.out.println("Bugün haftasonu, yani yatışşş.");
                break;
        }*/
/*
        int sayi=87;
        int kalan=sayi%2;
        switch (kalan){
            case 0:
                System.out.println("Çifttir");
                break;
            case 1:
                System.out.println("Tektir");
                break;
        }
        */

        String harfNotu="Emre";
        switch (harfNotu){
            case "AA":
                System.out.println("Öğrencinin notu 90'dan büyüktür");
                break;
            case "BA":
                System.out.println("Öğrencinin notu 80 ile 90 arasındandır");
                break;
            case "BB":
                System.out.println("Öğrencinin notu 70 ile 80 arasındadır.");
                break;
            case "CB":
                System.out.println("Öğrencinin notu 60 ile 70 arasındadır");
                break;
            default:
                System.out.println("Öğrencinin notu 60'dan küçüktür.");
                break;
        }



    }
}
