import java.util.Scanner;

public class Exercise7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		String str;
		str = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "" : " not";
		
		System.out.printf("%n%d%s%n", year, " is not a leap year.");
		sc.close();
	}
}