package Algorithms.Uygulama.Hafta12;

import java.util.Scanner;

public class VeriGiris3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("Metin gir: ");
        String metin = giris.nextLine();
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if(karakter == ' '){
                System.out.println();
                continue;
            }
            else
                System.out.print(karakter);
        }
        char a = ' ';
        int b = a;
        System.out.println(b);
    }
}
