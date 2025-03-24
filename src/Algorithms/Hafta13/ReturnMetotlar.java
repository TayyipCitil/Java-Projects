package Algorithms.Hafta13;

public class ReturnMetotlar {
    public static void main(String[] args) {
        int[] dizi1 = {2,51,3,32};
        int[] dizi2 = {51,23,122,2};
        double dizi1ort = diziOrt(dizi1);
        double dizi2ort = diziOrt(dizi2);
        System.out.println("1. dizi ort: " + dizi1ort);
        System.out.println("2. dizi ort: " + dizi2ort);
        System.out.println(faktor(7));
    }

    // faktoriyel hesaplayan metot:
    static int faktor(int deger){
        int faktor = 1;
        for (int i = 1; i <= deger; i++) {
            faktor*=i;
        }
        return faktor;
    }

    static double diziOrt(int[] x){
        double ort = 0, toplam=0;
        for (int i = 0; i < x.length; i++) {
            toplam+=x[i];
        }
        ort = toplam/x.length;
        // System.out.println("Dizi ortalaması : " + ort);
        return ort;
    }
}
