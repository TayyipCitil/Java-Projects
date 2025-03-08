package OnlineCourses.MathExample;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı: ");
        int num= input.nextInt();
        for(int i=num;i>=1;i--){
            for(int k=i*2-1;k>=1;k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
