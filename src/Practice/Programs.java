package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Programs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
// Calling Comparison Method
		int a = RandomNumber();
		Comparison(a);
	}

// Table for User Input
	static void GenerateTable(int k) {
		for (int j = 1; j <= 10; j++) {
			System.out.println(j + " X " + k + "= " + j * k);
		}
	}

//Generate Random Number
	static int RandomNumber() {
		Random rand = new Random();
		int a = rand.nextInt(100);
		return a;
	}

// UserInput from BufferedReader
	static int UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println("Guess the number:");
		int guess = Integer.parseInt(br.readLine());
		return guess;
	}// UserInput Method Closed
// Comparison

	static void Comparison(int a) throws NumberFormatException, IOException {
		boolean win = false;
		int i = 0;
		while (win == false) {
			int guess = UserInput();
			i++;
			if (guess == a) {
				System.out.println("Congratulations !!! You have guessed correct number");
				win = true;
				System.out.println("You have guessed correct number in " + i + " attempts.");
				int k = guess;
				System.out.println("-----Printing Table for " + k + "-----");
				GenerateTable(k);
			} else if (guess < a) {
				System.out.println("You have guessed smaller number.");
			} else if (guess > a) {
				System.out.println("You have guessed bigger number.");
			} // else if closed
		} // While loop closed
	}// Method Comparison closed
}// main closed