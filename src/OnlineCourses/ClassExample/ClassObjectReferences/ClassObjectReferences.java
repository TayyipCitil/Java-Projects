package OnlineCourses.ClassExample.ClassObjectReferences;

public class ClassObjectReferences { //Class lara büyük harfle başlanır
    public static void main(String[] args) {
        Adres adr = new Adres(); // "adres" class'ından "adr" object"ini ürettik
        Ogrenci ogr = new Ogrenci();
        adr.cadde   = "İstiklal";
        adr.blok    = "C";
        adr.no      = "5";
        adr.sehir   = "Istanbul";
        adr.ulke    = "Türkiye";
        ogr.adi     = "Tayyip";
        ogr.soyadi  = "Çitil";
        ogr.oAdres  = adr; //Ogrenci de oluşturduğumuz reference "oAdres"e object "adr" değerimizi atadık

        System.out.println(adr.ulke);
        System.out.println(ogr.oAdres);

    }
}
