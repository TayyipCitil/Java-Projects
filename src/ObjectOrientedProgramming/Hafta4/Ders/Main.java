package ObjectOrientedProgramming.Hafta4.Ders;

public class Main {
    public static void main(String[] args) {
        Time1 time =new Time1();
        displayTime("1. zaman ",time);
        time.setTime(12,0,0);
        displayTime("2. zaman ",time);
        time.setTime(4,0,0);
        displayTime("3. zaman ",time);
    }

    private static void displayTime(String header, Time1 time){
        System.out.printf("%s%n Universal Time: %s%n Standart Time: %s%n",header,time.toUniversalString(),time.toString());
    }
}