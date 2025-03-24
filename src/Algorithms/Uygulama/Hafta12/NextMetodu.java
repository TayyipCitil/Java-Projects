package Algorithms.Uygulama.Hafta12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextMetodu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        ArrayList<Integer> dizi = new ArrayList<Integer>();
        System.out.println("Diziyi giriniz: ");
        while (giris.hasNext()){
            String a = giris.next();
            if(a.equals("exit"))
               break;
            int sayi = Integer.parseInt(a);
            dizi.add(sayi);
        }
        System.out.println("Oluşturduğunuz dizi: " + dizi.toString());
    }
}
