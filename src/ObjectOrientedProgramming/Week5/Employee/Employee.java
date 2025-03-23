package ObjectOrientedProgramming.Week5.Employee;

public class Employee {
    private String name;
    private String lastname;
    private Date hiredDate;
    private  Date birthDate;
    private static  int count=0;

    public Employee(String name, String lastname, Date hiredDate, Date birthDate) {
        this.name = name;
        this.lastname = lastname;
        this.hiredDate = hiredDate;
        this.birthDate = birthDate;
    }
    public String toString(){
        return String.format("Employee:%s %s%n Hired:%s%n Birthday:%s%n",name,lastname,hiredDate,birthDate);
    }
}
