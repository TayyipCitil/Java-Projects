package Algorithms.Uygulama.Hafta12;

import java.util.Arrays;
import java.util.Scanner;

public class AralarindaAsal {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Kaç elemanlı dizi istiyorsun: ");
        int diziBoyut = giris.nextInt();
        int[] dizi = new int[diziBoyut];
        for (int i = 0; i < diziBoyut; i++) {
            dizi[i] = (int) (Math.random()*100+1);
        }

        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < diziBoyut; i+=2) {
            int sayi1=dizi[i], sayi2=dizi[i+1];
            int min= Math.min(sayi1,sayi2);
            boolean asalMi=true;
            for (int j = min; j > 1 ; j--) {
                if(sayi1%j==0 && sayi2%j==0)
                    asalMi=false;
            }
            if (asalMi)
            System.out.println((i+1) +". ve "+(i+2)+". sayi aralarinda asal: "+sayi1 + "--"+sayi2);
            else System.out.println((i+1) +". ve "+(i+2)+". sayi aralarinda asal değildir!!!!: "+sayi1 + "--"+sayi2);

        }


    }
}
