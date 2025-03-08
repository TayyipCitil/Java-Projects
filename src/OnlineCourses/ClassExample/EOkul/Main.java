package OnlineCourses.ClassExample.EOkul;

public class Main {
    public static void main(String[] args) {
        //öğretmen ekledik
        Teacher teacher1=new Teacher("Sümeyye","matematik");
        Teacher teacher2=new Teacher("Songül","tarih");
        //ders ekledik
        Course math=new Course("matematik",0.6,0);
        Course history=new Course("tarih",0.4,0);
        //derslere öğretmen ekledik
        math.addTeacher(teacher1);
        history.addTeacher(teacher2);
        System.out.println("======================");
        //derse branşı farklı olan bir öğretmen eklemeye çalıştık
        history.addTeacher(teacher1);
        math.addTeacher(teacher2);
        System.out.println("=======================");
        //öğrenci ekldeik
        Student student1=new Student("Asiye",58,0,math,history);
        Student student2=new Student("Ecrin",85,0,math,history);
        //öğrencilerin notlarını verdik ortalamayı ve geçti-kaldı durumunu hesapladık
        student1.addBulkExamNote(10,80);
        student1.calcAvarage();
        student2.addBulkExamNote(100,95);
        student2.calcAvarage();





    }
}
