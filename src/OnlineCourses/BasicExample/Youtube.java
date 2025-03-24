package OnlineCourses.BasicExample;

import java.util.Scanner;

public class Youtube {
    //Kullanıcıdan veri alma (5.ders)
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("What is your name?   ");
        String n;
        n = name.nextLine();
        System.out.println("your name is " + n);

        int sene;
        Scanner age = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz =  ");
        sene = age.nextInt();
        System.out.println(sene);


    }
}
