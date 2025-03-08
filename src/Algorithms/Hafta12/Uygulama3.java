package Algorithms.Hafta12;

public class Uygulama3 {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3};
        aritmetikOrt(dizi);
    }
    static void aritmetikOrt(int[] dizi) {
        int max=dizi[0];
        int min=dizi[0];
        int ort = 0;
        for (int eleman : dizi) {
            ort += eleman;
            if(eleman>max){
                max=eleman;
            }else if(eleman<min){
                min=eleman;
            }
        }
        System.out.print("Ort: "+(double) ort / dizi.length+" Max: "+max+" Min: "+min);
    }
}
