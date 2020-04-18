package Collections_Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}
// Write a Java program to update specific array element by given element.  

	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		System.out.println("MyArrayList Before Updating: " + MyArrayList);

		System.out.println("ArrayList has Index from 1 to "+MyArrayList.size());
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Index at which you want to Update the Color");
		int a =  sc.nextInt();
		System.out.println("Please enter the color which you want to enter: ");
		Scanner sc1 = new Scanner(System.in);
		String color = sc1.nextLine();
		
		MyArrayList.set(a, color);
		
		System.out.println("Updated Array List is: "+MyArrayList);
	}
}
