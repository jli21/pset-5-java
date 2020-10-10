import java.util.Scanner;

public class Exercise5 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a grade: ");
		double grade = sc.nextDouble();
		
		grade = Math.round(grade);
		String str;

		if(grade > 100) {
			str = "Grades above 100 are invalid.";
		}
		else if(grade < 0) {
			str = "Grades below 0 are invalid.";
		}
		else if(grade >= 90) {
			str = "You received an A.";
		}
		else if(grade >= 80) {
			str = "You received a B.";
		}
		else if(grade >= 70) {
			str = "You received a C.";
		}
		else if(grade >= 60) {
			str = "You received a D.";
		}
		else {
			str = "You received an F.";
		}	
		System.out.printf("%n%s%n",str);
		sc.close();	
	}

}