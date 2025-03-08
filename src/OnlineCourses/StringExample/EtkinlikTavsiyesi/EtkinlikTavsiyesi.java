package OnlineCourses.StringExample.EtkinlikTavsiyesi;

import java.util.Scanner;

public class EtkinlikTavsiyesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sıcaklık kaç derece? : ");
        int heat=input.nextInt();
        if(heat<5){
            System.out.print("Kayak");
        } else if (heat<=25) {
            if (heat<=15) {
                System.out.print("Sinema\t");
            }
            if (heat>=10) {
                System.out.print("Piknik");
            }
        } else {
            System.out.println("Yüzme");
        }
    }
}
