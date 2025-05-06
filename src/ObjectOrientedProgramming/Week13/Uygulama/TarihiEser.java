package ObjectOrientedProgramming.Week13.Uygulama;

public class TarihiEser implements Materyal{
    private String ad;

    public TarihiEser(String ad) {
        this.ad = ad;
    }

    @Override
    public void bilgiGoster(){
        System.out.println("Ad: "+ad);
    }

    public String getAd() {return ad;}
    public void setAd(String ad) {this.ad = ad;}
}
