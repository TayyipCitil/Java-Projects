package Algorithms.Uygulama.Hafta12;

public class Arrays2 {
    public static void main(String[] args) {
        int[] sayilar = new int[5];
        int[] numbers = {1,2,3,4,5,6};
        String[] isimler = {"Emre","Tayyip","Mesut"};
        sayilar[0]=35;
        sayilar[1] = 36;
       /* for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");
        }
*/
        for (int x : sayilar){
            System.out.print(x+ " ");
        }


    }
}