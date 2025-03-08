package OnlineCourses.ClassExample.EOkul;

public class Student {
    Course math;
    Course history;
    String name;
    int stdNo;
    double avarage;

    Student(String name,int stdNo,double avarage, Course math,Course history){
        this.name=name;
        this.stdNo=stdNo;
        this.math=math;
        this.history=history;
        this.avarage=avarage;
    }

    public void addBulkExamNote(int mathNote,int historyNote){
        //tüm derslerin notları eklenicek toplu işselm olduğu için isimlendirmede "Bulk" kullandım
        this.math.note=mathNote;
        this.history.note=historyNote;
    }

    public void calcAvarage(){
        this.avarage=(this.math.note* this.math.matter + this.history.note*this.history.matter);
        System.out.println(this.name+" 'in ortalaması: "+this.avarage);
        isPass();
    }

    public void isPass(){
        if(this.avarage>=50){
            System.out.println("Geçti");
        }else {
            System.out.println("Kaldı");
        }
    }
}
