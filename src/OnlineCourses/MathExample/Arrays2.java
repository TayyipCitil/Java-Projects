package OnlineCourses.MathExample;

public class Arrays2 {//16.ders arrays, matrisler ve forEach döngüsü

    public static void main(String[] args) {

        //dizi
        int[] d = new int[5]; //veya elemanları tek tek yaza bilirsin süslü parantez ile {23,45,23,2} gibi
        int[] d2 = new int[]{20, 22, 24, 26, 28};
        System.out.println("eleman sayısıs= " + d.length);

        //for döngüsü ile dizi elemanları toplamı
        int sum =0;
        for (int i=0;i<5;i++){
            sum = sum+d2[i];
        }
        System.out.println("toplam= "+sum);

        //forEach döngüsü ile dizi elemanları toplamı
        sum=0;
        for (int deger:d2) { // her bir değeri saydırıyor
            sum =sum + deger;
        }
        System.out.println("Toplam= "+sum);

        //matris (birden çok elemanlı dizi)
        int[][] m = new int[10][10];


        for (int i = 0; i < 5; i++) {
            d[i] = i;
            System.out.print(i + ".eleman= " + d[i]);
            System.out.printf("          eleman= %d \n ", d2[i]);
        }

        //matris (birden çok elemanlı dizi)
        int[][] b = new int[][]{{1,5},{2,4},{3,3},{4,2},{5,1}};
        System.out.println(b[0][1]); //ilk boşluğa kaçıncı kümeyi istediğini ikinci boşluğa kaçıncı karakterini istediğini yaz

        //matrisin bir elemanını değiştirme
        b[0][1]=10;
        System.out.println(b[0][1]);

        int[][] c = new int[][]{{10,11,12},{20,21,22},{30,31,32},{40,41,42},{50,51,52}};
        System.out.println(c[4][2]);


    }
}