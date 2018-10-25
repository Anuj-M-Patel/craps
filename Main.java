import java.util.Scanner;

/**
 * 
 * @author Anuj Patel
 * 10/25/18
 * Period 6
 *
 */
public class Main {

	public static void main(String[] args) {
		//String one = "_______\n|     |\n|  *  |\n|_____|";
		//String two = "_______\n|*    |\n|     |\n|____*|";
		//String three = "_______\n|*    |\n|  *  |\n|____*|";
		//String four = "_______\n|*   *|\n|     |\n|*___*|";
		//String five = "_______\n|*   *|\n|  *  |\n|*___*|";
		//String six = "_______\n|*   *|\n|*   *|\n|*___*|";
		
		boolean playAgain = true;
		
		System.out.println("Welcome to the Craps Game!");
		
		while (playAgain) {
			Dice die1 = new Dice();
			Dice die2 = new Dice();
		
			Scanner input = new Scanner(System.in);
			System.out.print("Press ENTER to begin...");
			input.nextLine();
			
			boolean afterFirst = false;
			String request;
			int point = 0;
			
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			
			System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of " + (roll1+roll2) + ".");
			if (roll1 + roll2 == 7 || roll1 + roll2 == 11) {
				System.out.println("You have won!");
				System.out.print("Enter \"y\" if you would like to play again. ");
				request = input.next();
				if(!(request.toLowerCase().equals("y") || request.toLowerCase().equals("yes"))) {
					playAgain = false;
				}
			}
			else if (roll1 + roll2 == 2 || roll1 + roll2 == 12) {
				System.out.println("You have lost.");
				System.out.print("Enter \"y\" if you would like to play again. ");
				request = input.next();
				if(!(request.toLowerCase().equals("y") || request.toLowerCase().equals("yes"))) {
					playAgain = false;
				}
			}
			else {
				point = roll1 + roll2;
				System.out.println("The new point is " + point + ".");
				afterFirst = true;
			}
			
			while (afterFirst) {
				System.out.print("Press ENTER to continue...");
				input.nextLine();
				roll1 = die1.roll();
				roll2 = die2.roll();
				System.out.println("You rolled a " + roll1 + " and a " + roll2 + " for a total of " + (roll1+roll2) + ".");
				if(roll1 + roll2 == point) {
					System.out.println("You have won!");
					System.out.print("Enter \"y\" if you would like to play again. ");
					request = input.next();
					if(!(request.toLowerCase().equals("y") || request.toLowerCase().equals("yes"))) {
						playAgain = false;
					}
					afterFirst = false;
				}
				else if(roll1 + roll2 == 7) {
					System.out.println("You have lost.");
					System.out.print("Enter \"y\" if you would like to play again. ");
					request = input.next();
					if(!(request.toLowerCase().equals("y") || request.toLowerCase().equals("yes"))) {
						playAgain = false;
					}
					afterFirst = false;
				}
			}
		}
	}
}
