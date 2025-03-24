package Algorithms.Hafta10;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*100+1);
        // int sayi = 6;
        System.out.println("Üretilen sayi: " + sayi);
        int toplam =0;
        /*for (int i = 1; i <= sayi/2; i++) {
            if(sayi%i==0)
                toplam+=i;
        }
        */
         int i = 1;
         while (i<=sayi/2){
             if(sayi%i==0)
                 toplam+=i;
             i++;
         }
        if (toplam==sayi)
            System.out.println("Mükemmel sayidir.");
        else System.out.println("Mukemmel sayi değildir.");
    }
}
