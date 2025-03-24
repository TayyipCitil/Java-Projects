package Algorithms.Hafta13;

public class EnBuyukKucuk {
    public static void main(String[] args) {
        MaxMin((int)(Math.random()*100),(int)(Math.random()*100),(int)(Math.random()*100));
    }

    public static void MaxMin(int a, int b, int c){
        System.out.println("Üretilen sayılar: " + a + ", " + b + ", "+ c);
        // int enKucuk = Math.min(a, Math.min(b,c));
       // int enBuyuk = Math.max(a, Math.max(b,c));
        int enKucuk =a;
        if(b<enKucuk) enKucuk=b;
        if(c<enKucuk) enKucuk=c;

        int enBuyuk =a;
        if(b>enBuyuk) enBuyuk=b;
        if(c>enBuyuk) enBuyuk=c;

        System.out.println("Bu sayıların en büyüğü: " + enBuyuk);
        System.out.println("Bu sayıların en küçüğü: " + enKucuk);
    }
}
