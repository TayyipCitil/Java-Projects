package Algorithms.Hafta12;

public class TersDizi {
    public static void main(String[] args) {
    int[] dizi = {1,2,3,4,5,6,7};
    // bu dizinin elemanlarını tersten şekilde sıralayın
        for (int i = 0; i < dizi.length/2; i++) {
            int temp = dizi[i];
            dizi[i] = dizi[dizi.length-1-i];
            dizi[dizi.length-1-i] = temp;
        }
        for (int i : dizi) {
            System.out.print(i + " ");
        }
    }
}
