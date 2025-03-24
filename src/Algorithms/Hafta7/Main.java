package Algorithms.Hafta7;
public class Main {

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
    }
}