package NumericalAnalysis.Bireysel;

public class Yuvarlama {
    public static void main(String[] args) {
        System.out.println(yuvarla(3.1415999999999999,2));
    }
    public static double yuvarla(double sayi, int basamak) {
        double kat = Math.pow(10, basamak);
        return Math.round(sayi * kat) / kat;
    }
}
