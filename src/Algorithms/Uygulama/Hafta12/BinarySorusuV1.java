package Algorithms.Uygulama.Hafta12;

public class BinarySorusuV1 {
    public static void main(String[] args) {
        int sayi = 111;
        int toplam=0, sayac=0, basamakDegeri=0;
        while (sayi>0){
            basamakDegeri = sayi%10;
            if (basamakDegeri==1)
                 toplam = toplam + (int) (Math.pow(2,sayac));
            sayi = (sayi-basamakDegeri)/10;
            sayac++;
        }
        System.out.println("Decimal karşılığı: " + toplam);
    }
}
