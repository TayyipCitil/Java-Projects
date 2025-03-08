package OnlineCourses.StringExample.AddUser;

import java.util.Scanner;

public class youtube {
    //Kullanıcıdan veri alma
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("What is your name?");
        String n;
        n = name.nextLine();
        System.out.println(n);

    }
}
