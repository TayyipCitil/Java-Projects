package Algorithms.Hafta11;

public class Ornek2 {
    public static void main(String[] args) {
        int n=12;
        for(int i=1;i<=n;i++) {
            int sayi =i;
            int fac = 1;
            while (sayi >= 1) {
                fac *= sayi;
                sayi--;
            }
            System.out.println(fac);
        }

    }
}
