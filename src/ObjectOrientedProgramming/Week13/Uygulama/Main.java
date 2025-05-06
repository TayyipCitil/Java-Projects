package ObjectOrientedProgramming.Week13.Uygulama;

public class Main {
    public static void main(String[] args) {
        Kitap kitap1=new Kitap("Divan-ı Lügati Türk");
        Dergi dergi1=new Dergi("Aylık Yazılımın Gündemi");
        TarihiEser eser1=new TarihiEser("Fatih Sultan Mehmet Han Hazretleri'nin Mührü");

        Materyal[] materyals=new Materyal[3];
        materyals[0]=kitap1;
        materyals[1]=dergi1;
        materyals[2]=eser1;

        for(Materyal materyal:materyals){
            materyal.bilgiGoster();
            if(materyal instanceof Kitap){
                ((Kitap) materyal).oduncAl();
            } else if (materyal instanceof Dergi) {
                ((Dergi) materyal).oduncAl();
            }
        }
    }
}
