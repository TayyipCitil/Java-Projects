package Algorithms.Arrays;

public class RastgeleDizi {
    public static void main(String[] args) {
        // [1,10) aralğında rastgele sayılardan oluşan dizinin ortalaması


        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 9 + 1);
        }
        double toplam = 0, ortalama = 0;
        System.out.print("Dizinin elemanları: ");
        for (int i = 0; i < dizi.length; i++) {
            // toplam=toplam+dizi[i];
            toplam += dizi[i];
            System.out.print(dizi[i] + " ");
        }
        ortalama = toplam / dizi.length;
        System.out.println();
        System.out.println("Üretilen sayıların ortalaması: " + String.format("%.2f", ortalama));

    }
}
