package Algorithms.Uygulama.Hafta8;

public class Example2 {
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*101+ -50);
        System.out.println(sayi);

        if (sayi==0)
            System.out.println("sayı sifirdir.");
        else if (sayi>0)
            System.out.println("pozitiftir.");
        else
            System.out.println("negatiftir.");
    }
}
