package Algorithms.Uygulama.Hafta11;

public class Faktoriyel {
    public static void main(String[] args) {
        // Önceden tanımlanmış bir sayının faktoriyelini bulup ekrana yazdırın.
        int sayi = 5;
        int faktor = 1;

        for (int i = 1; i <= sayi; i++) {
            faktor *=i;
        }
        System.out.println(sayi+"!="+faktor);
    }
}
