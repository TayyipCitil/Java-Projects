package Algorithms.Hafta11;// Mükemmel sayı örneği

public class Mukemmel {
    public static void main(String[] args) {
        int sayi = 500;
        int toplam = 0;
        int i  = 1;
        while(i<sayi){
            if (sayi % i ==0)
                toplam = toplam +i ;
            i++;
        }

        if (toplam == sayi)
            System.out.println("Mükemmel sayıdır");
        else
            System.out.println("Mükemmel sayı değildir.");

    }
}