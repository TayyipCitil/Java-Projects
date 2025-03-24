package Algorithms.Hafta11;

// Asal kontrolü
public class Asal {
    public static void main(String[] args) {
        boolean asalMi = true;  //bayrak değişkeni: başlangıçta sayının asal olduğu varsayımı var.
        int sayi = 68;
        int sayac = 2;
        while(sayac < sayi){
            if(sayi % sayac == 0){
                asalMi = false;
                break;
            }
            sayac++;
        }
            if (asalMi)
                System.out.println("Sayı asaldır.");
            else
                System.out.println("Sayı asal değildir.");
    }
}
