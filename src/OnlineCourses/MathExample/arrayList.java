package OnlineCourses.MathExample;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayList { //17. ders arrayList ler
    public static void main(String[] args) {

        //ArraayList lerde başlangıçta elemanları veya eleman sayısını vermek zorunda değiliz ama istersek verebiliriz
        ArrayList<Integer> dizi = new ArrayList<>(Arrays.asList(3,4,34,46));
        System.out.println(dizi);

        //ArrayList in sonuna yeni eleman ekleme
        dizi.add(51);
        System.out.println(dizi);

        //ArrayList in herhnagi bir yerine yeni bir eleman ekleme
        dizi.add(3,70);
        System.out.println(dizi);

        //ArrayList lerde bir elemanı değiştirme
        dizi.set(0,22);
        System.out.println(dizi);

        //ArrayListte bir elemanı silme
        dizi.remove(2);
        System.out.println(dizi);

        //arrayList lerin eleman sayısı "size" komutuyla bulunur.
        System.out.println(dizi.size());

        //ArrayList in herhangi bir elemanını yazdırma
        System.out.println(dizi.get(4));


    }
}
