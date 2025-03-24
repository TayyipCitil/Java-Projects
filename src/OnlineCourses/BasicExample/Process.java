package OnlineCourses.BasicExample;

public class Process {
    public static void main(String[] args) {
        int sum1 = 100 + 50; // "+" operatörü int değerler için toplam, string değerler için birleştime yapar
        int sum2 = sum1 + 250;
        int sum3 = sum1 + sum2;
        System.out.println(sum1);//int + int = int
        System.out.println(sum2);
        System.out.println(sum3);

        String num1 =  "10", num2= "20";
        String sum4 = num1 + num2;
        String sum5 = sum1 + num1;
        System.out.println(sum4); //string + string = string
        System.out.println(sum5); // int + string = string

    }
}
