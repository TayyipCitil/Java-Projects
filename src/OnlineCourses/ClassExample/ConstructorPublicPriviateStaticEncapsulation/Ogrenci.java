package OnlineCourses.ClassExample.ConstructorPublicPriviateStaticEncapsulation;

public class Ogrenci {
    String adi;
    String soyadi;
    Adres oAdres; //Adres sınıfından bir refernce oluşturduk

    //boş Constructor
    public Ogrenci() {
    }

    //Constructor
    public Ogrenci(String adi, String soyadi, Adres oAdres) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.oAdres = oAdres;
    }
}
