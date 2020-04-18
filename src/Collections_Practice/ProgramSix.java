package Collections_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

	// Write a Java program to remove the third element from a array list.
	
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");
		System.out.println("MyArrayList Before removing any element: " + MyArrayList);
		System.out.println("ArrayList has Index from 1 to " + MyArrayList.size());
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Index at which you want to remove the Color");
		int a = sc.nextInt();
		MyArrayList.remove(a);
		System.out.println("Updated Array List is: " + MyArrayList);
	}
}
