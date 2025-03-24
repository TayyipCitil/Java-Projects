package OnlineCourses.StringExample;

public class Strings2 { //12. ders
    public static void main(String[] args) {

        String fullname="songül çitil",name="",surname="";

        System.out.println(fullname.length());

        int i = fullname.indexOf(" ");
        surname=fullname.substring(i);
        name=fullname.substring(0,i);

        surname=surname.toUpperCase();
        String s=name.substring(0,1);
        s=s.toUpperCase();
        name=s+name.substring(1);

        name=name.replaceAll("ü","u");
        surname=surname.replaceAll("İ","I");

        System.out.println("Your name is "+ name);
        System.out.println("Your surname is "+ surname);
    }
}
