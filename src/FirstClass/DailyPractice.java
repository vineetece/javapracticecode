package FirstClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class DailyPractice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		int b = RandomNumber();
		GuessChecking(b);
	}

//Generating Random Number

	static int RandomNumber() throws NumberFormatException, IOException {
		Random rand = new Random();
		// return random number
		int a = rand.nextInt(100);
		return a;
	}

//Taking User Input from BufferedReader

	static int UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Guess the number between 1 to 100.");
		int guess = Integer.parseInt(br.readLine());
		return guess;
	}
// GuessChecking Method

	static void GuessChecking(int a) throws NumberFormatException, IOException {
		boolean win = false;
		while (win == false) {
			int guess = UserInput();
			if (guess == a) {
				System.out.println("Congratulations !!! You have guessed it right.");
				win = true;
			} else if (guess < a) {
				System.out.println("You have guessed smaller number. Enter bigger number.");
			} else if (guess > a) {
				System.out.println("You have guessed bigger number. Enter smaller number.");
			} // else statement closed
		} // While Loop Closed
	} // GuessChecking method closed
} // Main method closed
