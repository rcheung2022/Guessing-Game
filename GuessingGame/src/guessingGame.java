/*
* <h1> Guessing Game </h1>
* A guessing game that prompts the user to guess a random number between 1 and 10.
* <p>
* @author  Raymond Cheung
* @since   2017-09-26 
*/



import java.util.Scanner;
import java.util.InputMismatchException;

public class guessingGame {
	public static void main(String[] args) {
		//Introduction, asks for name and greets
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Ice to meet you " + name);
		
<<<<<<< HEAD
		//Generate random number from 1 to 10 to be guessed (3)
=======
		//Generate random number from 1 to 10 to be guessed (2)
>>>>>>> branch 'master' of https://github.com/rcheung2022/Guessing-Game
		int answer = (int) ((Math.random() * 10) + 1);
		//Number of guesses
		int counter = 0;
		
		boolean isNumber = false; //True if the scanner reads a number, otherwise false
		while (!isNumber) {
			//Breaks when a number is read
			counter++;
			try {
				System.out.println("Guess a number");
				int guess = input.nextInt();
				
				//Test cases for matching the guess to the actual number
				if (guess == answer) {
					isNumber = true;
					System.out.println("Congratulations! " + name + " it took you " + counter + " tries");
				}
				else if (guess > answer) {
					System.out.println("Guess is too large");
				}
				else if (guess < answer) {
					System.out.println("Guess is too small");
				}
			}
			
			catch(InputMismatchException e) {
				System.out.println("Please enter a number");
				input.next();
			}
		}
		input.close();
	}
	//Hi. Commit 1
	//Hi. I'm Alex
}