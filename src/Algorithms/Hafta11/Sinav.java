package Algorithms.Hafta11;

public class Sinav {

    public static void main(String[] args) {

        int a = 1111, dec=0, i=0;

        while (a > 0) {
            dec +=  (a % 10) * (int) Math.pow(2, i);
            a /= 10;
            i++;
        }
        System.out.println(dec);
    }
}