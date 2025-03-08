package Algorithms.Hafta14;

public class rekursifFaktor {
    public static void main(String[] args) {
        // içerisine aldığı n sayısının faktoriyelini hesaplayan dönderecek metot
        System.out.println(rekursifFaktor(5));
        System.out.println(rekursifFaktor(7));
    }

    static int iteratifFaktor(int n) {
        int faktor = 1;
        for (int i = 1; i < n-1 ; i++) {
            faktor*=i;
        }
        return faktor;
    }

    static int rekursifFaktor(int n){
        if(n==0) return 1;
        else return n * rekursifFaktor(n-1);

    }
}
