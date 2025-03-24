package OnlineCourses.ClassExample.ConstructorPublicPriviateStaticEncapsulation;

public class ConstructorPublicPriviateStaticEncapsulation {//22,23,24. dersler
    public static void main(String[] args) {
        //Constructor
        Adres adr = new Adres("İstiklal","C","5","Istanbul","Türkiye");
        //Constructor
        Ogrenci ogr = new Ogrenci("Tayyip","Çitil",adr);
        System.out.println(adr.ulke);          //ulke değişkeni public olduğu için adr refence'sını kullanarak aldık
        System.out.println(Adres.blok);        //blok değişkeni static olduğu için drekt cllas adı ile aldık
        System.out.println(adr.getNo());       //no değişkeni private olduğu için geter-setter methodları ile aldık
        System.out.println(ogr.oAdres.sehir);  /*Bu classımızdan Ogrenci class'ına ogr adlı bir referance oluşturduk ve
                                                Ogrenci class'ından Adres class'ına oAdres diye bir referance oluşturduk*/
    }
}
