package OnlineCourses.MathExample;

import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int taban,ust,sonuc=1;
        System.out.print("taban: ");
        taban= input.nextInt();
        System.out.print("üst(negatif girme): ");
        ust=input.nextInt();
        for(int sayac=1;sayac<=ust;sayac++){
            sonuc*=taban;
        }
        System.out.println(sonuc);
    }
}
