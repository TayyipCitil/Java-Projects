package OnlineCourses.MathExample;

import java.util.Scanner;

// 1 1 2 3 5 8 13 21 34 ...
public class Recursive_Fibonacci {
    static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MatematikselOrnekler.Fibonacci dizisinin kaçıncı elemanı ?(ilk eleman = 1. eleman): ");
        int num = input.nextInt();
        System.out.println("MatematikselOrnekler.Fibonacci dizisinin " + num + ". elamanı: " + fibonacci(num));

    }
}
