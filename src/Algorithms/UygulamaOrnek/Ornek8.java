package Algorithms.UygulamaOrnek;

public class Ornek8 {
    public static void main(String[] args) {
        int rnd = (int) (Math.random()*101-50);
        System.out.println(rnd);
        if(rnd<0){
            System.out.println("Negatif");
        }else if(rnd>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Sıfır");
        }
    }
}
