package Algorithms.Hafta10;

public class AralikAsalKontrol {
    public static void main(String[] args) {
        int baslangic=2, bitis=200;
        for (int sayi = baslangic; sayi <=  bitis; sayi++) {
            boolean asalMi=true;
            for (int i = 2; i <= sayi/2; i++) {
                if(sayi%i==0){
                    asalMi=false;
                    break;
                }

            }
            if (asalMi)
                System.out.print(sayi+" ");
        }

    }
}
