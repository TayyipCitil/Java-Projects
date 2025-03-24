package Algorithms.Hafta12;

public class Diziler {
    public static void main(String[] args) {
        //  int[] dizim = new int[10];
        // int[] dizim = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
        /*
        dizim[0]= 10;
        dizim[5] = 4;
        System.out.println(dizim[0]);
        System.out.println(dizim[5]);
        System.out.println(dizim[9]);*/
        // String[] dizi = new String[10];
        // String[] dizi =  {"merve", "Ahmet", "mehmet", "akif"};
        /*System.out.println(dizi[0]);
        System.out.println(dizi[3]);
        System.out.println(dizi.length);*/
        int[] dizi = new int[5];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random()*100);
        }

      /*  for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+ " ");
        }*/
        // foreach döngüsü
        for (int sayi: dizi) {
            System.out.print(sayi+ " ");
        }
    }
}
