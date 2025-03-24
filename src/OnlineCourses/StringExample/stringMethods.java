package OnlineCourses.StringExample;

public class stringMethods {
    public static void main(String[] args) {

        String Deneme = "Selam", ad ="Tayyip", surname ="Çitil",isim="Tayyip",text="";
        String text2 ="Her an yeni bir başlangıçtır";

        //lenght()
        System.out.println(Deneme.length());

        //charAt()
        char result = Deneme.charAt(0);
        System.out.println(result);
        System.out.println(Deneme.charAt(1));
        System.out.println(Deneme.charAt(2));
        System.out.println(Deneme.charAt(3));
        System.out.println(Deneme.charAt(4));

        //contains()
        System.out.println(Deneme.contains("Sel")); //true
        System.out.println(Deneme.contains("e")); //true
        System.out.println(Deneme.contains("hi")); //false

        //concat()
        System.out.println(ad.concat(surname));

        //starsWith()
        System.out.println(ad.startsWith("Ta")); //true
        System.out.println(surname.startsWith("ya")); //false

        //endsWith()
        System.out.println(ad.endsWith("ip")); //true
        System.out.println(ad.endsWith("iP")); //false

        //equals()
        System.out.println(isim.equals(ad)); //true
        System.out.println(surname.equals("Çitil")); //true

        //indexOf()
        System.out.println(text2.indexOf("yeni")); // 7
        System.out.println(text2.indexOf("Her")); // 0 olur çünkü öncesinde karakter yok
        System.out.println(text2.indexOf("Ali")); // -1 olur çünki metinde yok

        //isEmpty()
        System.out.println(text.isEmpty()); //true
        System.out.println(ad.isEmpty()); //false

        //replace()
        System.out.println(ad.replace("yy","rr"));
        System.out.println(ad.replace('T','N'));

        //toLowerCase()
        //toUpperCase()
        System.out.println(Deneme.toLowerCase());
        System.out.println(Deneme.toUpperCase());







    }
}

