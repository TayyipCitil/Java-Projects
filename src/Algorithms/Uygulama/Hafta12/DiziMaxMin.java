package Algorithms.Uygulama.Hafta12;

public class DiziMaxMin {
    public static void main(String[] args) {
        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int)(Math.random()*100+1);
        }
        for(int i:dizi)
            System.out.print(i+" ");
        System.out.println();
        int max = dizi[0], min = dizi[0];
        for(int sayi : dizi){
            if(sayi>max)
                max=sayi;
            if(sayi<min)
                min=sayi;
        }
        System.out.println("Max eleman: " + max);
        System.out.println("Min eleman: " + min);
    }
}
