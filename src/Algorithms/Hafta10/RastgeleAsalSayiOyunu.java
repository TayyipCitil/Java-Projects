package Algorithms.Hafta10;

public class RastgeleAsalSayiOyunu {
    public static void main(String[] args) {
        boolean asalMi=false;
        int donguSayisi=0;
        int sayi=0;
        System.out.print("Üretilen sayi: ");
        while (asalMi==false){
            sayi = (int) (Math.random()*100+1);
            System.out.print(sayi+ ",");
            int sayac=0;
            donguSayisi++;
            for (int i = 2; i <= sayi/2; i++) {
                if(sayi%i==0)
                    sayac++;
            }
            if(sayac==0)
                asalMi=true;
        }
        System.out.println("Üretilen asal sayi: " + sayi);
        System.out.println("Bulunan adım sayisi ise: " + donguSayisi);
    }
}
