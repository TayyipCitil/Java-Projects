package Algorithms.Hafta11;

public class Ornek2 {
    public static void main(String[] args) {
        int sayi = 29;
        boolean asal = true;

        if (sayi <= 1) {
            asal = false;
        }
        for (int i = 2; i < Math.sqrt(sayi) ; i++) {
            if(sayi%i == 0 ){
                asal=false;
                break;
            }
        }
        if(!asal)
            System.out.println("asal değil");
        else
            System.out.println("asaldır");
    }
}
