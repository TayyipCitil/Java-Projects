package OnlineCourses.MathExample;
import java.util.Arrays;

public class ToSort {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 21, 34, 0, -92, 23, 1, 3, 5, 11};
        soort(array);
        System.out.println(Arrays.toString(array));
    }


    static int[] soort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && array[j] < array[i]) {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        return array;
    }
}
