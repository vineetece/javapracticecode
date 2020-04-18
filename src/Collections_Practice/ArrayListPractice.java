package Collections_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethod();
	}

	// Scanner Method for User Input
	static int UserInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number:");
		int userinput = sc.nextInt();
		return userinput;
	}

	static boolean Confirmation() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Do you want to enter next iput? type true or false:");
		boolean a = sc1.nextBoolean();
		return a;
	}

	static void MyMethod() {
		boolean Check = true;
		ArrayList<Integer> Numbers = new ArrayList<>();

		do {
				Numbers.add(UserInput());
				Check = Confirmation();
		} while (Check == true);
		
			System.out.println("Size of Array List is: " + Numbers.size());
			for (Integer a : Numbers) {
				System.out.println(a);
			}
		}
	}
