package ObjectOrientedProgramming.Week5.University;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentNumber;
    private List<Course> courses;


    public Student(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.courses=new ArrayList<>();
    }
    public void printStudentInfo() {
        String stringCourse="";
        for(int i=0;i<courses.size();i++){
            stringCourse+=courses.get(i).getCourseName()+",";
        }
        stringCourse=stringCourse+"\b";
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", studentNumber=" + studentNumber +
                ", courses=" + stringCourse+
                '}');
    }
    public void addCourse(Course course){
        this.courses.add(course);
    }
}
