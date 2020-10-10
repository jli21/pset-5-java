
import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		String str;
		if(n == 0) { str = "Zero."; }
		else { str = (n > 0) ? "Positive." : "Negative"; }
		
		System.out.printf("%n%s%n", str);
		sc.close();
	}

}