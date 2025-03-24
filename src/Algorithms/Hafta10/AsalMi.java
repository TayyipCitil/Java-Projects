package Algorithms.Hafta10;

// bir sayının asal olup olmadığını kontrol eden program
public class AsalMi {
    public static void main(String[] args) {
        int sayi=97;
        boolean asalMi=true;
        for (int i = 2; i <= sayi/2; i++) {
            if(sayi%i==0){
                asalMi=false;
                break;
            }
        }
        if (asalMi)
            System.out.println("Sayı asaldır");
        else
            System.out.println("Sayı asal değildir.");

    }

}
