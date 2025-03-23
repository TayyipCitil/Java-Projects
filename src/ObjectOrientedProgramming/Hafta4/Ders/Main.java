package ObjectOrientedProgramming.Hafta4.Ders;

public class Main {
    public static void main(String[] args) {
        Time1 time =new Time1();
        displayTime("1. zaman ",time);
        time.setTime(12,0,0);
        displayTime("2. zaman ",time);
        time.setTime(4,0,0);
        displayTime("3. zaman ",time);
        System.out.println("-------------------------------------------------");
        Time2 t1=new Time2();
        Time2 t2=new Time2(12);
        Time2 t3=new Time2(23,34);
        Time2 t4=new Time2(0,10,10);
        Time2 t5=new Time2(t1);
        t5.setHour(5);
        t5.setMinute(5);
        t5.setSecond(20);
        t5.setTime(20,13,45);
        displayTime(t1);
        displayTime(t2);
        displayTime(t3);
        displayTime(t4);
        displayTime(t5);
        try {
            Time2 t6=new Time2(25,60,40);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private static void displayTime(String header, Time1 time){
        System.out.printf("%S%n Universal Time: %s%n Standart Time: %s%n",header,time.toUniversalString(),time);//time = time.toString
    }
    private static void displayTime(Time2 time){
        System.out.printf(" Universal Time: %s%n Standart Time: %s%n",time.toUniversalString(),time);//time = time.toString
    }
}