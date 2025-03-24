package Algorithms.Hafta11;

public class ContinueOrnek {
    public static void main(String[] args) {
        int sayac = 0;
        while (sayac < 10){
            if(sayac == 3){
                System.out.println("s");
                continue;
            }
            sayac++;
            System.out.print(sayac + " ");
        }
    }
}
