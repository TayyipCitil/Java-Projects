package ObjectOrientedProgramming.Week13.Uygulama;

public class Kitap implements Materyal{
    private String ad;

    public Kitap(String ad) {
        this.ad = ad;
    }

    @Override
    public void bilgiGoster(){
        System.out.println("Ad: "+ad);
    }
    public void oduncAl(){
        System.out.println(ad + " kitabı ödünç alındı");
    }

    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
}
