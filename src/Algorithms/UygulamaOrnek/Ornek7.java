package Algorithms.UygulamaOrnek;

public class Ornek7 {
    public static void main(String[] args) {
        int rnd = (int)(Math.random()*100+1);
        System.out.println(rnd);
        if(rnd%2==0){
            System.out.println("çift");
        }else{
            System.out.println("tek");
        }
    }
}
