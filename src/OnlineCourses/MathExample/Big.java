package OnlineCourses.MathExample;

import java.util.Scanner;

public class Big {
    public static void main(String[] args) {
        //koşullu ifadeler (ders 6)
        int a,b;
        Scanner num = new Scanner(System.in); //kullanıcıdan alın veriyi saklıyan değişkeni oluşturduk
        System.out.print("a yı gir= ");
        a=num.nextInt(); // kullanıcıdan veriyi burada aldık ve değişkene atadık
        System.out.print("b yi gir= ");
        b=num.nextInt();

        if (a>b) {//if den sonra ; koyma
            System.out.println("a , b den büyük");
        } else if(a<b) {
            System.out.println("a , b den küçük");
        }else {
            System.out.println("a ve b eşit");
        }
    }
}
