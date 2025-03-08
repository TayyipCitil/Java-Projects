package OnlineCourses.MathExample;
public class AverageOfArray {
    public static void main(String[] args) {
        int[] list={1,2,3,4,5,6,7,8,9};
        int sum=0,average;
        for(int i:list){
            sum+=i;
        }
        average=sum/ list.length;
        System.out.println(average);

    }
}
