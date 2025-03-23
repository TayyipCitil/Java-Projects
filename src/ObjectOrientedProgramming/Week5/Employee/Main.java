package ObjectOrientedProgramming.Week5.Employee;

public class Main {
    public static void main(String[] args) {
        Date hiredDate=new Date(12, 10,2010);
        Date birthDate=new Date(10,12,1980);
        Employee employee1=new Employee("Sefa","Kaya",hiredDate,birthDate);

        System.out.println(employee1);



    }
}
