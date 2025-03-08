package OnlineCourses.MathExample;

import java.util.Scanner;

public class MukemmelSayi { //6,28,496,8128,...
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı: ");
        int num= input.nextInt(),total=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                total+=i;
            }
        }
        if (total==num){
            System.out.println(num+" sayısı mükemmel sayıdır");
        }else{
            System.out.println(num+" sayısı mükemmel sayı değildir");
        }
    }
}
