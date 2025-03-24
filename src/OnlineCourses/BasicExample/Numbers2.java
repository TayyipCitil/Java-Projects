package OnlineCourses.BasicExample;

public class Numbers2 {
    public static void main(String[] args) {
        // java da değişkenler şöyle tanımlanır "değişkenTipi değişkenAdı = değişkenDeğeri"

        int age = 5;
        System.out.println(age);

        age =21;
        System.out.println(age);

        final int mybirthyear = 2002;
        //mybirthyear = 2003; //burası hata verir çünkü "final" anahtar kelimesi değişkenimizi sabite çevirdi
        System.out.println(mybirthyear);

        long no = 2023141314L;
        //long değerleri "L" ile bitirmeliyiz
        System.out.println(no);


        final float pi = 3.14f;
        //float tipindeki değişkenlerin değerleri "f veya F" ile bitirilmelidir.
        System.out.println(pi);

        double euler = 2.71d;
        System.out.println(euler);

        char firstLetter = 'A';
        /* char tek bir karakteri saklayan değişkenlerin tipidir.
        char veri tipleri bireleşerek string sınıfından bir yapıya dönüşür*/
        System.out.println(firstLetter);

        String name = "Tayyip";
        System.out.println(name);

        final String country = "Turkiye";
        System.out.println(country);

        boolean answer1 = true;
        // mantıksal ifadeleri için kullanılır "true veya false" değerlerini alabilir
        System.out.println(answer1);

        System.out.println( "year= " + 2024 + ", my name= " + name + ", my age= " + age );
        // değişkenleri ve metinleri birleştirmek için "+" operatörü kullanılır
    }
}
