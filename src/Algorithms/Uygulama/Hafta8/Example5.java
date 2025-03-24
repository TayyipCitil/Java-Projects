package Algorithms.Uygulama.Hafta8;

public class Example5 {
    public static void main(String[] args) {
        String a = "Firat";
        String b = "fiRaT";

        if (a.equals(b))
        //if (a.equalsIgnoreCase(b))
            System.out.println("metinler aynıdır");
        else
            System.out.println("metinler farklıdır");
    }
}
