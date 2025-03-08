package OnlineCourses.MathExample;

import java.util.Scanner;

public class HermonikSeri {
    public static void main(String[] args) {
        //girilen sayıya kadar 1+1/2+1/3+...+1/n toplamını bulan algoritma
        Scanner input=new Scanner(System.in);
        System.out.print("sayı gir: ");
        int n= input.nextInt();
        double total=0;
        for(int i=1;i<=n;i++){
            total+=1.0/i;
        }
        System.out.println(total);
    }
}
