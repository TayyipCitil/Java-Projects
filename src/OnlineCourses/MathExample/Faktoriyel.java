package OnlineCourses.MathExample;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("sayi gir: ");
        int sayi=input.nextInt(),fac=1;

        for (int i=1;i<=sayi;i++){
            fac*=i;
        }
        System.out.println("faktöriyel: "+fac);
    }
}
