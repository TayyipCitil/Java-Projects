package ObjectOrientedProgramming.Labs.Lab1;

public class Main {
	public static void main (String[]args) {
	    int[] array = {56,35,14,2,89,68,75,90,0,67,57,74,100};
		GradeBook myGradeBook = new GradeBook("Algoritma", array);
		myGradeBook.dispslayMessage();
		myGradeBook.processGrades();
		
	}

}
