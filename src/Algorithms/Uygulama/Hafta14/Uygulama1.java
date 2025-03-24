package Algorithms.Uygulama.Hafta14;

public class Uygulama1 {
    public static void main(String[] args) {
        System.out.println(basamaklarCiftMi(2223));
    }
    static boolean basamaklarCiftMi(int sayi){
        while(sayi>0){
            if((sayi%10)%2!=0){
                return false;
            }
            sayi=sayi/10;
        }
        return true;
    }
}
