package OnlineCourses.MathExample;

public class Fibonacci {
    public static void main(String[] args) {
        int numYeni=1,numSimdi=0,numEski;
        for (int i = 0; i < 30; i++) {
            System.out.print(numSimdi+",");
            numEski =numSimdi;
            numSimdi=numYeni;
            numYeni=numEski+numSimdi;
        }
    }
}
