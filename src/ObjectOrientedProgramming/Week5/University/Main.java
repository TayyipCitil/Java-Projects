package ObjectOrientedProgramming.Week5.University;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1=new Instructor("Saliha ","OOP");
        Course course1=new Course(instructor1,2,"OOP");
        Course course2=new Course(instructor1,3,"Math");
        course1.printCourseInfo();
        Student student1=new Student("Tayyip",314);
        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.printStudentInfo();

    }

}
