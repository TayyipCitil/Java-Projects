package Algorithms.Uygulama.Hafta12;

import java.util.Scanner;

public class Uygulama1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("n: ");
        int n=scanner.nextInt();
        ikiliMatris(n);
    }
    public static void ikiliMatris(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print((int)(Math.random()*2)+" ");
            }
            System.out.println();
        }
    }
}
