package OnlineCourses.StringExample;
import java.util.Scanner;

public class PolindromicWords {
    public static void main(String[] args) {// tersten de aynı olan kelimeler ana,adda,kabak,...
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.nextLine();
        System.out.println(isPolindromic(word));
    }


    static boolean isPolindromic(String word) {
        int length = word.length();
        boolean isPolindrom = true;
        for (int i = 0; i <= length / 2; i++) {
            if (word.charAt(i) != word.charAt((length - 1) - i)) {
                isPolindrom = false;
                break;
            }
        }
        return isPolindrom;
    }
}
