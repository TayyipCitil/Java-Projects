package Algorithms.Hafta14;

public class RekursifToplam {
    public static void main(String[] args) {
        // 1'den n'e kadar olan sayıların toplamı rekürsif
        System.out.println(rekursifToplam(5));
    }

    static int iteratifToplam(int n){
        int toplam =0;
        for (int i = 0; i<=n ; i++) {
            toplam+=i;
        }
        return toplam;
    }

    static int rekursifToplam(int n){
        if(n==1) // Base case: Temel Durum
            return 1;
        else return n + rekursifToplam(n-1); // Yineleme durumu
    }


}
