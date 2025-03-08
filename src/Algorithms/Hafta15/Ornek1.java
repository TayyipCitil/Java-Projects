package Algorithms.Hafta15;

public class Ornek1 {
    public static void main(String[] args) {
        System.out.println(tersCevir(1234));
    }

    static int tersCevir(int sayi) { //global değişken veya ikinci bir değişken kullanmadan tersini alsın
        if (sayi < 10) {
            return sayi;
        } else {
            return tersCevir(sayi / 10) + (sayi % 10) * (int) Math.pow(10, (int) Math.log10(sayi));
            //kalanı, 10 üzeri (sayının basamak sayısı-1) ile çarptık
        }
    }
}
