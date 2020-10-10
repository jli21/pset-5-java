import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a temperature: ");
		String input = sc.nextLine();

		double temp = Double.parseDouble(input.substring(0, input.length() - 2).trim());
		String scale = Character.toString(input.charAt(input.length() - 1)).toLowerCase();
		
		String str;
		if(scale.equals("f")) {
			if(temp >= 212) { str = "Gas"; }
			else if(temp >= 32) { str = "Liquid"; }
			else { str = "Solid"; }
		}
		else if(scale.equals("c")) {
			if(temp >= 100) { str = "Gas"; }
			else if(temp >= 0) { str = "Liquid"; }
			else { str = "Solid"; }
		}
		else { str = "That's not a valid scale."; }
		
		System.out.printf("%n%s.%n", str);
		sc.close();
	}	
}