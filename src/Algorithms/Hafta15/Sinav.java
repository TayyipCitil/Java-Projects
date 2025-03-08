package Algorithms.Hafta15;

public class Sinav {
    public static void main(String[] args) {
        int[] dizi = {4,8,15,16,23,42};
        System.out.println(ortalama(dizi, dizi.length));
    }
    static double ortalama(int[] dizi, int n) {
        if (n == 0) {
            return 0;
        }else{
            return (double) dizi[n-1]/dizi.length + ortalama(dizi, n - 1);
        }
    }
}
