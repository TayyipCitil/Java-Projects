package Algorithms.Hafta13;

import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("1. sayıyı gir: " );
        int sayi1 = giris.nextInt();
        System.out.println("2. sayıyı gir");
        int sayi2 = giris.nextInt();

        System.out.println("Toplamları : " + toplam(sayi1,sayi2));
        System.out.println("Farkları: " + fark(sayi1,sayi2));
        System.out.println("Çarpımları : " + carpim(sayi1,sayi2));
        System.out.println("Bolümleri: " + bolum(sayi1,sayi2));
    }

    static int toplam(int x, int y){
        return x+y;
    }

    static int fark(int x, int y){
        return x-y;
    }

    static int carpim(int x, int y){
        return x*y;
    }

    static double bolum(double x, double y){
        return x/y;
    }
}
