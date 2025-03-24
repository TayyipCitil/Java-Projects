package OnlineCourses.BasicExample;

import java.util.Scanner;

public class swtichCaseYapisi { //11. ders switch case yapısı
    public static void main(String[] args) {

        Scanner num =new Scanner(System.in);
        System.out.print("[1,4] aralığında bir sayı gir =");
        int n = num.nextInt();

        //aynı şeyin if kullanarak yapılışı
        if (n==1){          System.out.println(n);
        } else if (n==2) {  System.out.println(n);
        } else if (n==3) {  System.out.println(n);
        } else if (n==4) {  System.out.println(n);
        } else           {  System.out.println("Tekarar Gir");
        }

        System.out.println("-----");
        //aynı şeyin switch case kullanarak yapılışı
        switch (n){
            case 1: System.out.println(n);break;
            case 2: System.out.println(n);break;
            case 3: System.out.println(n);break;
            case 4: System.out.println(n);break;
            default: System.out.println("tekrar gir");break;
        }
    }
}
