package Algorithms.UygulamaOrnek;

public class Ornek12 {
    public static void main(String[] args) {
        char islem='/';
        int rnd1=(int) (Math.random()*100+1);
        int rnd2=(int) (Math.random()*100+1);
        System.out.println(rnd1+","+rnd2);
        switch(islem) {
            case '+':
                System.out.println(rnd1 + rnd2);
                break;
            case '-':
                System.out.println(rnd1 - rnd2);
                break;
            case '*':
                System.out.println(rnd1 * rnd2);
                break;
            case '/':
                System.out.println((float) rnd1 / rnd2);
                break;
        }
    }
}
