import java.util.Scanner;

public class Exercise3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter three integers%n%n");
		System.out.print("Enter integer: ");
		int n1 = sc.nextInt();
		System.out.print("Enter integer: ");
		int n2 = sc.nextInt();
		System.out.print("Enter integer: ");
		int n3 = sc.nextInt();
		
		String str;
		
		if(n1 == n2 && n2 == n3) {
			str = "Same.";
		}
		else if(n1 < n2 && n2 < n3) {
			str = "Strictly increasing.";
		}
		else if(n1 > n2 && n2 > n3) {
			str = "Strictly Decreasing.";
		}
		else if(n1 <= n2 && n2 <= n3) {
			str = "Increasing.";
		}
		else if(n1 >= n2 && n2 >= n3) {
			str = "Decreasing.";
		}
		else {
			str = "Unordered.";
		}
		
		System.out.printf("%n%s%n", str);
		sc.close();
	}
	
}
