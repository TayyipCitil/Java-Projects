package OnlineCourses.StringExample;

public class kacisDizini {
    public static void main(String[] args) {
        String txt1 ="we are the so-called \"Vikings\" from the north.";
        String txt2 ="It\'s alright";
        String txt3 ="The character \\ is called \"backslash\"";
        String txt4 ="Hello\nWorld!";
        String txt5 ="Hello\rWorld!";
        String txt6 ="Hello\tWorld!";
        String txt7 ="Hel\blo World!";

        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);
        System.out.println(txt4);
        System.out.println(txt5);
        System.out.println(txt6);
        System.out.println(txt7);

        String hi = "Selam";
        System.out.println( "\"" + hi + "\"" + " kelimesinin string karakterlerinin sayısı: " + hi.length() );
        System.out.println("Tayyip".length());

    }
}
