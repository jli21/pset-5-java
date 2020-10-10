
import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		String str = (n % 2 == 0) ? "Even." : "Odd"; 
		
		System.out.printf("%n%s%n", str);
		sc.close();
	}
	
}