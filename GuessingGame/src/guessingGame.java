import java.util.Scanner;
import java.util.InputMismatchException;

public class guessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = input.nextLine();
		System.out.println("Ice to meet you " + name);
		/*
		System.out.println("How old are you?");
		int age = input.nextInt();
		if (age < 18) {
			System.out.println(name + ",you're young");
		}
		else {
			System.out.println(name + ",you're old");
		}
		*/
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
		}
	}
}
}
