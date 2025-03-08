package OnlineCourses.MathExample;

import java.util.Scanner;

public class BoyKiloIndeksi {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input=new Scanner(System.in);
        System.out.print("Boyunuzu m cinsinden giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden girinzi: ");
        kilo=input.nextDouble();
        indeks=kilo/(boy*boy);
        System.out.println("Vücüt kitle indeksiniz:"+indeks);
    }
}
