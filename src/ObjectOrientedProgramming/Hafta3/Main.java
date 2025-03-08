package ObjectOrientedProgramming.Hafta3;

public class Main {
    public static void main(String[] args){
        Employee employee1=new Employee("Tayyip",314,5000,"Brain");
        Employee employee2=new Employee("Mesut",58,1000,"IT");
        Employee employee3=new Employee("Sefa",44,6000,"President");

        System.out.printf("%-15s%-10s%-10s%-15s\n","Name","ID","Salary","Department");
        System.out.println("--------------------------------------------------------");
        employee3.setName("Saliha");
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
        employee3.displayEmployeeInfo();



    }
}