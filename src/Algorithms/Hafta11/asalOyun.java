package Algorithms.Hafta11;

// Üretilen sayının asal olduğu duruma kadar sürekli sayı üretip bunları ekrana yazdıran program
public class asalOyun {
    public static void main(String[] args) {
        int uretilenSayi  = (int) (Math.random()*100+2);
        int adim = 1;
        System.out.println(adim + ". adimda üretilen sayı: " + uretilenSayi);
        boolean asalMi = true;
        int sayac = 2;
        while(sayac<uretilenSayi){
            if(uretilenSayi%sayac==0){
                asalMi=false;
                break;}
            sayac++;
        }

        if(asalMi){
            System.out.println("Üretilen sayi: " + uretilenSayi);
            System.out.println(adim + ". adimda bulundu");
        }
        else{
            while (!asalMi){
                asalMi = true;
                uretilenSayi  = (int) (Math.random()*100+2);
                adim++;
                System.out.println(adim + ". adimda üretilen sayı: " + uretilenSayi);
                sayac = 2;
                while(sayac<uretilenSayi){
                    if(uretilenSayi%sayac==0){
                        asalMi=false;
                        break;
                    }
                    sayac++;
                }
                if (asalMi)
                    System.out.println(" asaldır!");
            }

        }

    }
}