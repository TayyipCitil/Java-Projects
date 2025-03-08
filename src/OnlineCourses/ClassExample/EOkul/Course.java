package OnlineCourses.ClassExample.EOkul;

public class Course {
    Teacher teacher;
    String name;
    int note;
    double matter; // 100 üzerinden ortalamayı ne kadar etkiliyor

    Course(String name,double matter,int note) {
        this.name=name;
        this.matter=matter;
        this.note=note;
    }

    public void addTeacher(Teacher teacher) {
        //branşlara öğretmen eklemek için kullanılır

        if(this.name.equals(teacher.branch)){
            this.teacher = teacher;
            System.out.println("Öğretmen başarıyla eklendi");
            printTeacher();
        }else{
            System.out.println(teacher.name+" Öğretmenin branşı "+this.name+" değil");
        }
    }

    public void printTeacher() {
        System.out.println("Adı: "+this.teacher.name+"\tBranşı: "+this.teacher.branch);
    }

}
