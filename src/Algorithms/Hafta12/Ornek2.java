package Algorithms.Hafta12;

import java.util.Arrays;
import java.util.Scanner;
public class Ornek2 {// n değerine göre fibonnacci dizisini bulma
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n: ");
        int n= scanner.nextInt();
        int[] dizi=new int[n];
        dizi[0]=1;
        dizi[1]=1;
        for(int i=2;i< dizi.length;i++){
            dizi[i]=dizi[i-1]+dizi[i-2];
        }
        System.out.println(Arrays.toString(dizi));
    }
}
