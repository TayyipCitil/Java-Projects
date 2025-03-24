package OnlineCourses.ClassExample.Inheritance;

public class Inheritance { //24,26,27.leesons inheritance(kalıtım)
    public static void main(String[] args) {
        Person prs= new Person("12345678900","Tayyip","Çitil");
        Student stud = new Student("12345678900","Tayyip","Çitil","141314","13-A"); //Student is class,stud is reference
        prs.show();
        System.out.println("-----");
        stud.show();
    }
}
