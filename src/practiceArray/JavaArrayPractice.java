package practiceArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaArrayPractice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		myArray();
	}

	// Take 10 Integer Inputs from User then store them in an Array. Print the array

	static int UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int input = Integer.parseInt(br.readLine());
		return input;
	}// UserInput method closed

	static void myArray() throws NumberFormatException, IOException {
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter Value for index" + i);
			a[i] = UserInput();
		}
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}// myArray closed

	static int numberPresent() throws NumberFormatException, IOException {
		System.out.println("Enter any number to check if it is present in Array: ");
		int checkNumber = UserInput();

		boolean present = false;
		while (present == false) {
			for (int i = 0; i < 10; i++) {
				if (a[i] == checkNumber) {
			}

		}
		return 0;
	}// numberPresent closed
}// Class CLosed