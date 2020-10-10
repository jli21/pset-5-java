import java.util.Scanner;

public class Exercise4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.print("Enter a letter grade: ");
		String grade = sc.nextLine().toUpperCase();
		
		String str;
		switch (grade) {
			case "A+":
				str = "Your GPA is a 4.00.";
				break;
			case "A":
				str = "Your GPA is a 4.00.";
				break;
			case "A-":
				str = "Your GPA is a 3.67.";
				break;
			case "B+":
				str = "Your GPA is a 3.33.";
				break;
			case "B":
				str = "Your GPA is a 3.00.";
				break;
			case "B-":
				str = "Your GPA is a 2.67.";
				break;
			case "C+":
				str = "Your GPA is a 2.33.";
				break;
			case "C":
				str = "Your GPA is a 2.00.";
				break;
			case "C-":
				str = "Your GPA is a 1.67.";
				break;
			case "D+":
				str = "Your GPA is a 1.33.";
				break;
			case "D":
				str = "Your GPA is a 1.00.";
				break;
			case "D-":
				str = "Your GPA is a 0.67.";
				break;
			case "F":
				str = "Your GPA is a 0.00.";
				break;
			default:
				str = "That's not a valid letter grade.";
				break;
		
		}
		
		System.out.printf("%n%s%n", str);
		sc.close();
	}

}