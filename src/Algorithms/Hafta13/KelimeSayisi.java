package Algorithms.Hafta13;// Tüm ekstrem senaryolar için modifiye edin.

public class KelimeSayisi {
    public static void main(String[] args) {
    String kelime = "asd";
        System.out.println( kelimeSayisi(kelime) + " adet kelime vardır.");
    }

    public static int kelimeSayisi(String metin){
        int sayac = 1;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i)==' ')
                sayac++;
        }
        return sayac;
    }

}
