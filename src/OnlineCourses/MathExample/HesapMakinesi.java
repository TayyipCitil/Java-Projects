package OnlineCourses.MathExample;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input_int_=new Scanner(System.in);
        Scanner input_str_=new Scanner(System.in);
        int num1,num2;
        System.out.print("Birinci sayı: ");
        num1=input_int_.nextInt();
        System.out.print("İkinci sayı: ");
        num2=input_int_.nextInt();
        System.out.println("Hangi işlem?\tToplama(+)\tÇıkarma(-)\tÇarpma(*)\tBölme(/)");
        String islem=input_str_.nextLine();
        switch (islem){
            case "+":
                System.out.println("Toplam: "+(num1+num2));
                break;
            case "-":
                System.out.println("Fark: "+(num1-num2));
                break;
            case "*":
                System.out.println("Çarpım: "+(num1*num2));
                break;
            case "/":
                if(num2==0){
                    System.out.println("Bir sayı sıfıra bölünemez!!!");
                }else {
                    System.out.println("Bölüm: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!!!");
        }
    }
}
