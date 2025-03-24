package OnlineCourses.ClassExample.ConstructorPublicPriviateStaticEncapsulation;

public class Adres {
    private String cadde; //cadde değişkeni artık özel olduğu için diğer class larda kullanmak için getter-setter yapcaz.
    static String blok; //blok değişkeni static olduğu için herhangi bir reference (adr gibi) kullanmadan erişebilirim Adres.blok komutu ile
    private String no;
    String sehir;
    String ulke;


    //boş Constructor
    public Adres(){

    }

    //Constructor
    public Adres(String cadde,String blok,String no,String sehir,String ulke){
        this.cadde =cadde;
        this.blok=blok;
        this.no=no;
        this.sehir=sehir;
        this.ulke=ulke;
    }

    // cadde değişkenini set ettik
    public void setCadde(String cadde){
        this.cadde=cadde;
    }
    //cadde değişkenini get ettik
    public String getCadde(){
        return cadde;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
}
