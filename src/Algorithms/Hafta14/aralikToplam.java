package Algorithms.Hafta14;

public class aralikToplam {
    public static void main(String[] args) {
        // Belirtilen bir aralıktaki değerlerin toplamını hesaplayan rekursif metot
        System.out.println(rekursifAralikToplam(5,10));
    }
    static int iteratifAralikToplam(int alt, int ust){
        int toplam = 0;
        for (int i = alt; i <= ust ; i++) {
            toplam+=i;
        }
        return toplam;
    }
    static int rekursifAralikToplam (int alt, int ust){
        // Base durum nedir:
        if(alt==ust) return alt;
        else return ust + rekursifAralikToplam(alt, ust-1);
        // else return alt + rekursifAralikToplam(alt+1, ust);
    }
}
