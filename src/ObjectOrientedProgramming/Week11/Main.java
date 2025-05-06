package ObjectOrientedProgramming.Week11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone1= new Phone("Lenova",10000,"1234");
        Computer computer1=new Computer("Monster",150000,"Parrot Linux");

        phone1.open();
        computer1.open();

        Scanner scanner =new Scanner(System.in);
        System.out.print("Arayacağınız numara: ");
        String callNumber=scanner.nextLine();
        phone1.call(callNumber);

        System.out.print("Yeni işletim sistminiz: ");
        String newSystem=scanner.nextLine();
        computer1.updateOperatingSystem(newSystem);

        phone1.close();
        computer1.close();
    }
}
