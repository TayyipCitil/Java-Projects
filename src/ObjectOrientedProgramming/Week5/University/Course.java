package ObjectOrientedProgramming.Week5.University;

public class Course {
    private final String courseName;
    private Instructor instructor;
    private int credit;

    public Course(Instructor instructor, int credit,String courseName) {
        this.instructor = instructor;
        this.credit = credit;
        this.courseName=courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getCredit() {
        return credit;
    }

    public void printCourseInfo() {
        System.out.println("Course{" +
                "courseName='" + courseName + '\'' +
                ", instructor=" + instructor.getName() +
                ", credit=" + credit +
                '}');
    }
}
