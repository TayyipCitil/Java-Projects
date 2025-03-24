package Algorithms.Uygulama.Hafta12;

public class DiziOrtalama {
    public static void main(String[] args) {
        int[] dizi = {4,5,3,6,8,12};
        double toplam =0;
        /*for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }*/

        for(int i : dizi)
            toplam+=i;

        double ort = toplam/dizi.length;
        System.out.println(ort);
    }
}
