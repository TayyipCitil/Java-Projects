package Algorithms.Uygulama.Hafta11;

public class EbobEkok {
    // İki sayının eboblarını ve ekoklarını 2 ayrı döngü ile ayrı ayrı hesaplayın
    public static void main(String[] args) {
        int sayi1=5, sayi2=16;
        int ebob = 0, ekok=0;
        // ebob
        int kucuk = Math.min(sayi1,sayi2);
        for (int i = kucuk; i >=1 ; i--) {
            if(sayi1%i==0 && sayi2%i==0){
                ebob=i;
                break;
            }
        }
        //ekok
        int buyuk = Math.max(sayi1,sayi2);
        for (int i = buyuk; i <= sayi1*sayi2; i+=buyuk) {
            if(i%sayi1==0 && i%sayi2==0){
                ekok=i;
                break;
            }
        }
        System.out.println("Sayılar: "+sayi1 + ","+sayi2);
        System.out.println("Ebobları: "+ ebob);
        System.out.println("Ekoklar: "+ekok);
    }
}
