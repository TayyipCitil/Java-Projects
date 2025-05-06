package ObjectOrientedProgramming.Week13.Uygulama;

public class Dergi implements Materyal{
    private String ad;

    public Dergi(String ad) {
        this.ad = ad;
    }

    @Override
    public void bilgiGoster(){
        System.out.println("Ad: "+ad);
    }

    public void oduncAl(){
        System.out.println(ad + " dergisi ödünç alındı");
    }
    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
}
