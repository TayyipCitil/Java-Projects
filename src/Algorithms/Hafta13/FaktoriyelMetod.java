package Algorithms.Hafta13;

public class FaktoriyelMetod {
    public static void main(String[] args) {
        System.out.println("6!: " + faktor(6));
        System.out.println("4!: " + faktor(4));
    }

    public static int faktor(int n){
        int sonuc = 1;
        for (int i = 1; i <= n; i++) {
            sonuc= sonuc * i;
        }
        return sonuc;
    }
}
