package Algorithms.Uygulama.Hafta8;

public class Example1 {

    public static void main(String[] args) {
        int sayi = (int) (Math.random()*100+1);
        System.out.println(sayi);

        if (sayi%2==0){
            System.out.println("sayi çifttir.");
        }
        else
            System.out.println("sayi tektir");
    }

}
