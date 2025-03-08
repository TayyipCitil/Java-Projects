package Algorithms.UygulamaOrnek;

public class Odev {
    public static void main(String[] args) {
        int a = 123;
        int bir = a % 10;
        int on = (a % 100) / 10; //(a/10)%10 da olur
        int yuz = a / 100;
        System.out.println(bir + "," + on + "," + yuz);
        int sum =(int) (Math.pow(bir,3)+Math.pow(on,3)+Math.pow(yuz,3));
        System.out.println(sum);
        // veya System.out.println(bir*bir*bir+on*on*on+yuz*yuz*yuz)
    }
}
