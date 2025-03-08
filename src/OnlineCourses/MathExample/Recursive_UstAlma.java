package OnlineCourses.MathExample;

import java.util.Scanner;

public class Recursive_UstAlma {

    static double power(int base, int pow) {
        double result;
        if (pow < 0) {
            result = 1/(power(base, -pow ));
        } else {
            if (pow == 0) {
                result = 1.0;
            } else {
                result = base * power(base, pow - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban: ");
        int base = input.nextInt();
        System.out.print("Kuvvet: ");
        int pow = input.nextInt();
        System.out.println("Üst: " + power(base, pow));
    }
}
