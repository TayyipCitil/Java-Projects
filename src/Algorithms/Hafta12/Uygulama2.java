package Algorithms.Hafta12;

public class Uygulama2 {
    public static void main(String[] args) {
        System.out.println(geometrikOrt(1,4));
        System.out.println(geometrikOrt(1,2,4));
    }
    static double geometrikOrt(int a,int b){
        return ((double) (Math.pow(a*b,(double) 1/2)));
    }
    static double geometrikOrt(int a,int b,int c){
        return ((double) (Math.pow(a*b*c,(double) 1/3)));
    }
}
