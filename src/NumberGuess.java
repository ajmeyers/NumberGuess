
import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	
	public NumberGuess() {
		
		/* Variables for Numbers, Guess, and Scanner */
		
		Random r = new Random();
		int randomInt = r.nextInt(10) + 1;		// Random Integer between 1 and 10
		int guess = 0; 							// Maximum guesses is 3
		int guessedNumber;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Enter a guess! ");
			
			// Reading an integer from the User
			
			guessedNumber = sc.nextInt();
			
				
			if (guessedNumber == randomInt) {
					
				System.out.println("\tCongratulations! You guessed right!");
				System.exit(1); // Exit Program
			}
				
	
			
			System.out.println("\tUh-oh! You guessed wrong!\n");
			guess++;
				
			if (guess == 3) {
					
				System.out.println("\n\t3 Strikes! Game Over!");
				System.out.println("\nThe correct number was " + randomInt + "!");
				break;
			}
		}
		
		sc.close();
	}
	
}
