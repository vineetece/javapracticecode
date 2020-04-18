package Collections_Practice;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colors();
	}

	// Write a Java program to create a new array list, add some colors (string) and
	// print out the collection.

	static void Colors() {
		ArrayList<String> ColorsList = new ArrayList<>();
		ColorsList.add("Yellow");
		ColorsList.add("Red");
		ColorsList.add("Green");
		ColorsList.add("Blue");
		ColorsList.add("Orange");

		System.out.println(ColorsList);
	}

}
