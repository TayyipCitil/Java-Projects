package Algorithms.Uygulama.Hafta11;

public class Faktorler {
    public static void main(String[] args) {
        // 1'den n'e kadar olan tüm sayıların faktoriyellerini bul:
        int n = 7;
        for (int sayi = 1; sayi <=n ; sayi++) {
            int faktor = 1;
            for (int i = 1; i <=sayi ; i++) {
                faktor*=i;
            }
            System.out.println(sayi + "! = " + faktor);
        }
    }
}
