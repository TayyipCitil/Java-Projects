package Algorithms.Uygulama.Hafta11;

public class StringTersYazma {
    public static void main(String[] args) {
        // Önceden tanımlanmış String bir ifadeyi tersten ekrana yazdıran program
        String kelime = "Cumhuriyet";
        String tersKelime="";
        /* for (int i = kelime.length()-1; i >= 0; i--) {
            System.out.print(kelime.charAt(i));
            tersKelime=tersKelime + kelime.charAt(i);
        }
        System.out.println();
        System.out.println(tersKelime);
*/
        int sayac = kelime.length()-1;
        while (sayac>=0){
            tersKelime = tersKelime + kelime.charAt(sayac);
            sayac--;
        }
        System.out.println(tersKelime);

    }
}
