package Algorithms.Hafta11;

// Tau Sayısı Örneği
public class Tau {
    public static void main(String[] args) {
        int sayi = 28;
        int sayac = 1;
        int bolenAdedi = 0;
        while (sayac <= sayi){
            if(sayi % sayac == 0)
                bolenAdedi++;
            sayac++;
        }
        if (sayi % bolenAdedi == 0)
            System.out.println("Tau sayısıdır");
        else
            System.out.println("Tau sayısı değildir. ");
    }
}
