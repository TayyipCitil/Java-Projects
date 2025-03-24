package Algorithms.Uygulama.Hafta8;

public class Example6 {
    public static void main(String[] args) {
        int sayi1 = (int) (Math.random()*100+1);
        int sayi2 = (int) (Math.random()*100+1);

        System.out.println("Sayi1: " + sayi1 + " " + "Sayi2: " + sayi2);

        char islem = '/';

        switch (islem){
            case '+':
                System.out.println(sayi2+sayi1);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.printf("%.3f" , (double) sayi1 / (double) sayi2);
                break;
        }
    }
}
