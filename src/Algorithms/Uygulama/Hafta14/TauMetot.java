package Algorithms.Uygulama.Hafta14;

public class TauMetot {
    public static void main(String[] args) {
        // Aldığı sayının tau olup olmadığını kontrol eden metot
        int x = 15;
        System.out.println(tauMu(x));
    }

    static boolean tauMu(int sayi){
        boolean tauMu=false;
        int sayac=0;
        for (int i = 1; i <= sayi; i++) {
            if(sayi%i==0)
                sayac++;
        }
        if(sayi%sayac==0)
            tauMu=true;
        return tauMu;
    }
}
