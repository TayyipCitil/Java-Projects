package OnlineCourses.MathExample;
import java.util.Scanner;
public class IntOrDouble {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı: ");
        double num= input.nextDouble();

        if(num==(int)num){
            System.out.println("Tam sayı");
        }else{
            System.out.println("Ondalıklı sayı");
        }
        //komut satırında ondalıklı sayı virgül(12,3) ile ayrılır
        //kod satırında nokta(12.3) ile
    }
}
