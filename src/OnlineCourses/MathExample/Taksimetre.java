package OnlineCourses.MathExample;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinde gir: ");
        int km=input.nextInt();
        double perKm=2.20,price=10;
        price += km*perKm;
        price = price<20 ? 20:price;
        System.out.println("Ücret: "+price);
    }
}
