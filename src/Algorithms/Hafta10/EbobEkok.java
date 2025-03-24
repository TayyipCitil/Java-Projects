package Algorithms.Hafta10;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        // Klavyeden girilen iki sayının ebob ve ekok değerlerinin hesaplanması:
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayıları giriniz: ");
        int sayi1=klavye.nextInt();
        int sayi2=klavye.nextInt();
        int ebob=0,ekok=0;
        if (sayi1>sayi2){
            ekok=sayi1;
            ebob=sayi2;
        }
        else {
            ekok=sayi2;
            ebob=sayi1;
        }

        while (ebob>1){
            if (sayi1 % ebob==0 && sayi2%ebob==0) {
                break;
            }
            else
                ebob--;
        }

        while (ekok>0){
            if (ekok%sayi1==0 && ekok%sayi2==0) {
                break;
            }
            else
                ekok++;
        }

        System.out.println("ebob: "+ebob);
        System.out.println("ekok: "+ekok);
    }
}
