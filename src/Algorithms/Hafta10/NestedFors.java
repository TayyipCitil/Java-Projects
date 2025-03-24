package Algorithms.Hafta10;

public class NestedFors {
    public static void main(String[] args) {
        int k = 6;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
