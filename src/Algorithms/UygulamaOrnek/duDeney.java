package Algorithms.UygulamaOrnek;

public class duDeney {
    public static void main(String[] args) {
        int sayi=356;
        int C=sayi%10;
        int B=(sayi/10)%10;
        int A=sayi/100;
        System.out.println(A+","+B+","+C);
        int sonuc=(int)(Math.pow(C,3)+Math.pow(B,3)+Math.pow(A,3));
        // int sonuc=c*c*c+b*b*b+a*a*a;
        if(sayi==sonuc){
            System.out.println("Dudeneydir");
        }else{
            System.out.println("Dudeney değildir");
        }
    }
}
