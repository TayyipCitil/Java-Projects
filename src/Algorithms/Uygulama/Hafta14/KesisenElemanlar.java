package Algorithms.Uygulama.Hafta14;

import java.util.ArrayList;

public class KesisenElemanlar {
    public static void main(String[] args) {
        // Aldığı iki adet Integer tipindeki arraylistlerde gözüken ortak elemanları,
        // yeni bir arrayliste atıp bunu geri dönderen metot
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        a.add(2);a.add(5);a.add(7);a.add(2);a.add(3);
        b.add(2);b.add(5);b.add(8);b.add(9);b.add(3);b.add(2);
        System.out.println(kesisenElemanlar(a,b));
    }

    static ArrayList<Integer> kesisenElemanlar(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> ortaklar = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
                int deger = a.get(i);
                if(b.contains(deger)){
                    if (!ortaklar.contains(deger))
                        ortaklar.add(deger);
                }
        }
        return ortaklar;
    }
}
