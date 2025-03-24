package Algorithms.Hafta13;

public class DiziOrtalaması {
    public static void main(String[] args) {
        int[] dizim1 = {1,2,3,4,5,6};
        int[] dizim2 = {12,32,43,54,65,78,9};
        System.out.println("İlk dizinin ortalaması: " + diziOrt(dizim1));
        System.out.println("İkinci dizinin ortalaması: " + diziOrt(dizim2));
    }

    public static double diziOrt(int[] dizi){
        double toplam = 0;
        double ort = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }
        ort = toplam / dizi.length;
        return ort;
    }
}
