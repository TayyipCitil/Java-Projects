package OnlineCourses.MathExample;

import java.util.Scanner;

public class Hipotenus_Alan {
    public static void main(String[] args) {
        //Hipotenüs bulma
        Scanner input = new Scanner(System.in);
        System.out.print("Dik Kenar 1: ");
        double a = input.nextDouble();
        System.out.print("Dik Kenar 2: ");
        double b = input.nextDouble();
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Hipotenüs: " + c);

        Alan();
    }

    static void Alan() {
        //Kenarlarla alan bulma
        Scanner input = new Scanner(System.in);
        System.out.print("Kenar 1: ");
        double a = input.nextDouble();
        System.out.print("Kenar 2: ");
        double b = input.nextDouble();
        System.out.print("Kenar 3: ");
        double c = input.nextDouble();
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Alan: " + alan);

    }
}
