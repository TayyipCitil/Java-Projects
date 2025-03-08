package OnlineCourses.MathExample;

import java.util.Scanner;

public class NotOrtalamasiHesap {
    public static void main(String[] args) {
        int mat,ing,biy,kim,fiz;
        Scanner input=new Scanner(System.in);
        System.out.print("matematik notu: ");
        mat=input.nextInt();
        System.out.print("İngilizce notu: ");
        ing=input.nextInt();
        System.out.print("Biyoloji notu: ");
        biy=input.nextInt();
        System.out.print("Kimmya notu: ");
        kim=input.nextInt();
        System.out.print("Fizik notu: ");
        fiz=input.nextInt();
        double ort=(mat+ing+biy+kim+fiz)/5.0;
        System.out.println("Ortalama: " + ort);
        String sonuc= ort>60 ? "Geçti" : "Kaldı";
        System.out.println(sonuc);
    }
}
