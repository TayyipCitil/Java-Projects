package Algorithms.Hafta11;

public class Ornek1 {
    public static void main(String[] args) {
        int tek_top=0, cift_top=0;
        int sayi=1;

        /*while(sayi<=90){
            if(sayi%2==0)
                cift_top+=sayi;
            else
                tek_top+=sayi;
            sayi++;
        }*/

        for(sayi=1; sayi<=90; sayi++){
            if(sayi%2==0)
                cift_top+=sayi;
            else
                tek_top+=sayi;
        }

        System.out.println("tek toplam=" + tek_top);
        System.out.println("çit toplam=" + cift_top);
    }
}
