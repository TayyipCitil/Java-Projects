package OnlineCourses.ClassExample.Inheritance;

public class Student extends Person { //extends komutu ile Person classını kalıtım aldık(ordaki bilgileri burda kullanabilyoruz)
    String stdNo;
    String classNo;

    @Override
    public void show() {
        //super.show();
        System.out.println("stdNo= "+this.stdNo);
        System.out.println("classNo= "+this.classNo);
    }

    public Student() {
    }

    public Student(String tcNo, String name, String surname, String stdNo, String classNo) {
        super(tcNo, name, surname); // super anahtar kelimesi bu bilgileri kalıtım ile aldığımızı ifade eder
        this.stdNo = stdNo;
        this.classNo = classNo;
    }
}
