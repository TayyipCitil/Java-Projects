package Algorithms.Hafta12;

public class Metotlar {
    public static void main(String[] args) {
        String[] dizi = {"dsadas"};
        Ornek1.main(dizi);// diziyi ister kullanırsın ister kullanmazsın.
        Merhaba();
        Merhaba2("Emre");
        System.out.println(Merhaba3());
        System.out.println(Merhaba4("Tayyip"));
    }

    static void Merhaba() {//parametre almıyan ve geriye değer döndürmeyen
        System.out.println("Merhabalar");
    }

    static void Merhaba2(String ad) {//parametre alan ama geriye değer döndürmeyen
        System.out.println("Merhaba" + ad);
    }

    static String Merhaba3() {//parametre almıyan ama geriye değer döndüren
        return "Merhba";
    }

    static String Merhaba4(String ad) {//parametre alan ve geriye değer döndüren
        return "Merhaba" + ad;
    }
    //---------------------------------------------------------------------------------OverLoding
    static int toplam(int a, int b){
        return a+b;
    }
    static int toplam(int a,int b,int c){
        return a+b+c;
    }
    static int toplam(String a,int b){
        return b;
    }



}
