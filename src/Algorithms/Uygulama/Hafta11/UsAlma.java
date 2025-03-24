package Algorithms.Uygulama.Hafta11;

public class UsAlma {
    public static void main(String[] args) {
        // Girilen taban ve tavan değerlerine göre üs alma (döngü ile)
        int taban=2,tavan=7;
        int sonuc=1;
        for (int i = 0; i < tavan; i++) {
            sonuc *=taban;
        }
        System.out.println(taban + "^" + tavan +"=" + sonuc);
    }
}
