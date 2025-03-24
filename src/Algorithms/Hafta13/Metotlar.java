package Algorithms.Hafta13;

public class Metotlar {
    public static void main(String[] args) {
     // Merhaba3("Emre");
    // Merhaba3("Tayyip");
    // int yaricap = 4;
    //  CemberAlan(yaricap);
    // CemberCevre(yaricap);
       // usAlma(2,6);
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        diziOrt(x);

    }
    static void diziOrt(int[] x){
        double ort = 0, toplam=0;
        for (int i = 0; i < x.length; i++) {
            toplam+=x[i];
        }
        ort = toplam/x.length;
        System.out.println("Dizi ortalaması : " + ort);
    }

    static void usAlma(int taban, int ust){
        int deger = 1;
        for (int i = 0; i < ust; i++) {
            deger*=taban;
        }
        System.out.println(deger);
    }

    static void CemberAlan(double yaricap){
        double alan = Math.PI * yaricap*yaricap;
        System.out.println("Çemberin alanı: " + alan);
    }

    static void CemberCevre(double yaricap){
        double cevre = 2*Math.PI*yaricap;
        System.out.println("Çemberin çevresi: " + cevre);
    }

    static void Merhaba3 (String x){
        System.out.println("Merhaba " + x);

    }

    static void Merhaba(){
        System.out.println("Merhaba sınıf!'");
        Merhaba2();
    }

    static void Merhaba2(){
        System.out.println("Merhaba asker");
    }


}
