package Algorithms.Hafta11;

// Sayı tahmin oyunu
public class SayiTahmin {
    public static void main(String[] args) {
        int uretilenSayi = (int) (Math.random()*100);
        System.out.println("Üretilen sayi: " + uretilenSayi);
        int tahminSayi = (int) (Math.random()*100);
        int adim = 1;
        System.out.println(adim + ". adimda tahmin edilen sayi: " + tahminSayi);

        if (uretilenSayi == tahminSayi){
            System.out.println(adim + ". adimda bulundu");}
        else {
            while(uretilenSayi != tahminSayi){
                tahminSayi = (int) (Math.random()*100);
                adim++;
                System.out.println(adim + ". adimda tahmin edilen sayi: " + tahminSayi);
            }
            System.out.println(adim + ". adimda bulundu!");
        }

    }
}
