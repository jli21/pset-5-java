import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a playing card: ");
		String card = sc.nextLine().toUpperCase();
		String suit, rank;
		boolean display = true;
		
		switch(Character.toString(card.charAt(0))) {
			case "2":
				rank = "Two";
				break;
			case "3":
				rank = "Three";
				break;
			case "4":
				rank = "Four";
				break;
			case "5":
				rank = "Five";
				break;
			case "6":
				rank = "Six";
				break;
			case "7":
				rank = "Seven";
				break;
			case "8":
				rank = "Eight";
				break;
			case "9":
				rank = "Nine";
				break;
			case "T":
				rank = "Ten";
				break;
			case "J":
				rank = "Jack";
				break;
			case "Q":
				rank = "Queen";
				break;
			case "K":
				rank = "King";
				break;
			case "A":
				rank = "Ace";
				break;
			default:
				rank = "That's not a valid rank";
				display = false;
				break;
		}
		
		switch(Character.toString(card.charAt(1))) {
			case "C":
				suit = "Clubs";
				break;
			case "D":
				suit = "Diamonds";
				break;
			case "H":
				suit = "Hearts";
				break;
			case "S":
				suit = "Spades";
				break;
			default:
				suit = "That's not a valid suit.";
		}
		
		if(rank.length() > 10) { System.out.printf("%n%s%n",rank); }
		else if(suit.length() > 10) {System.out.printf("%n%s%n", suit); }
		else { System.out.printf("%n%s of %s.%n", rank, suit); }
		sc.close();
	}

}