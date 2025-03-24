package Algorithms.Uygulama.Hafta11;

public class Sinav {
    public static void main(String[] args) {//binary to decimal
        int binary=10111;
        int decimal=0;
        int basamak=0;
        while(binary>0){
            int rakam=binary%10;
            binary=binary/10;
            decimal+=rakam*((int)Math.pow(2,basamak));
            basamak++;
        }
        System.out.println(decimal);
    }
}
