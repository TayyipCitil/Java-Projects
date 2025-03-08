package OnlineCourses.StringExample;
import java.util.Arrays;
import java.util.Scanner;

public class MetniKelimelereAyirma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.split("\\s+");
        System.out.println(Arrays.toString(words));
    }
}
