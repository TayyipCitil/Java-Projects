package Algorithms.Hafta10;

public class TauSayisi7 {
    public static void main(String[] args) {
        int sayi = 45;
        int bolenSayisi = 0;
       /* for (int i = 1; i <= sayi ; i++) {
            if(sayi%i==0)
                bolenSayisi++;
        }
        */
        int sayac =1;
        while (sayac<=sayi){
            if(sayi%sayac==0)
                bolenSayisi++;
            sayac++;
        }

        if(sayi%bolenSayisi==0)
            System.out.println("Tau sayısıdır");
        else
            System.out.println("Değildir");
    }
}
