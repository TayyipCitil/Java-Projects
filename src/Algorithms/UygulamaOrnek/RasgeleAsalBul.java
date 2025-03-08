package Algorithms.UygulamaOrnek;

public class RasgeleAsalBul {
    public static void main(String[] args) {
        boolean asalMi=false;
        int sefer=0;
        int sayi=0;
        while (!asalMi){
            sayi = (int) (Math.random() * 100 + 1);
            sefer++;
            if(sayi==2){
                System.out.println(sefer+")"+sayi);
                break;
            }
            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi%i==0){
                    i=sayi;
                }
                //Hatalı:  i!=sayi
                if(i==sayi/2){
                    asalMi=true;
                }
            }
            System.out.println(sefer+")"+sayi);
        }
        System.out.println("asal");
    }
}