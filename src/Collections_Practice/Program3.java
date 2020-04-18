package Collections_Practice;

import java.util.ArrayList;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

	// Write a Java program to insert an element into the array list at the first
	// position.
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		System.out.println("Before Updating at index 1, ArrayList is: " + MyArrayList);

		MyArrayList.set(1, "Pink");

		System.out.println("After Updating at index 1, ArrayList is: " + MyArrayList);
	}

}
