package Algorithms.Hafta15;

public class Uygulama1 {
    public static void main(String[] args) {
        tamBolenler(60,1);
    }
    static void tamBolenler(int sayi,int i){
        if(i==sayi){
            System.out.print(i +" ");
        }else if(sayi%i==0) {
            System.out.print(i+" ");
            tamBolenler(sayi,i+1);
        }else{
            tamBolenler(sayi,i+1);
        }
    }
}
