package OnlineCourses.StringExample;
import java.util.Scanner;

public class Backwards {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Word: ");
        String word=input.nextLine();
        System.out.println(reverse(word));
    }

    static String reverse(String word){
        int length=word.length();
        String reverse="";
        for(int i=0;i<length;i++){
            String letter= String.valueOf(word.charAt(length-1-i));
            reverse=reverse.concat(letter);
        }
        return reverse;
    }
}
