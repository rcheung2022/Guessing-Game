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
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Ice to meet you " + name);
		int answer = (int) ((Math.random() * 10) + 1);
		boolean isNumber = false;
		int counter = 0;
		
		while (!isNumber) {
			counter++;
		try {
			System.out.println("Guess a number");
			int guess = input.nextInt();
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
	}
}