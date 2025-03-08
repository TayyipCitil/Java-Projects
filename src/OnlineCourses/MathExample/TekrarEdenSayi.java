package OnlineCourses.MathExample;
import java.util.Arrays;

public class TekrarEdenSayi {
    public static void main(String[] args) {
        int[] list = {1, 5, 4, 6, 7, 3, 4, 2, 1, 7, 8, 20, 10,10,10,20,20,1,7,7};
        repeatingNum(list);
    }

    static void repeatingNum(int[] list) {
        Arrays.sort(list);
        for (int i = 0; i < list.length-1; i++) {
            if (i == 0) {
                if (list[i] == list[i + 1]) {
                    System.out.print(list[i] + ",");
                }
            } else {
                if (list[i] == list[i - 1]) {
                } else if (list[i] == list[i + 1]) {
                    System.out.print(list[i] + ",");
                }
            }
        }
    }
}