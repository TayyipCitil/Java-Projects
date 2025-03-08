package OnlineCourses.MathExample;

import java.util.Scanner;

public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        //girilen  sayıya kadar olan 4 ve 5 in kuvvetleri
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı gir: ");
        int sayi= input.nextInt();
        for (int i=1;i<=sayi;i*=4){
            System.out.print(i+",");
        }
        System.out.println("");
        for (int i=1;i<=sayi;i*=5){
            System.out.print(i+",");
        }
        System.out.println("");
    }
}
