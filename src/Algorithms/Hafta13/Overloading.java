package Algorithms.Hafta13;

public class Overloading {
    public static void main(String[] args) {

    }
    static int toplam (int x, int y){
        return x+y;
    }
    int toplam(int x, int y, int z){
        return x+y+z;
    }
    static int toplam (String x, int y){
        return y;
    }
}
