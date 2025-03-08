package OnlineCourses.MathExample;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        //kaç sayı gireceğimizi ve girdiğimiz sayıların en büyük ve en küçüğünü bulan algoritma
        Scanner input = new Scanner(System.in);
        int n, num, max = 0, min = 0;
        System.out.print("Kaç sayı girilecek: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i+". sayı: ");
            num = input.nextInt();
            if (i == 1) {
                max = num;
                min = n;
            }
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }
        System.out.println("Max: "+max+", Min: "+min);
    }
}

