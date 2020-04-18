package Collections_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

// Write a Java program to search an element in a array list. 
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		System.out.println("Please enter the color which you want to Search: ");
		Scanner sc = new Scanner(System.in);
		String color = sc.nextLine();
		System.out.println("Does ArrayList has " + color + ": "+MyArrayList.contains(color));
		

	}
}
