package Algorithms.UygulamaOrnek;

public class Ornek10 {
    public static void main(String[] args) {
        int vize = 59, fin = 76;
        float not = vize * 0.4f + fin * 0.6f;
        System.out.println(not);
        if (0 <= not && not < 50) {
            System.out.println("DD");
        } else if (not < 65) {
            System.out.println("CC");
        } else if (not < 80) {
            System.out.println("BB");
        } else {
            System.out.println("AA");
        }
    }
}
