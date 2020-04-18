package Collections_Practice;

import java.util.ArrayList;

public class ProgramFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

	// Write a Java program to retrieve an element (at a specified index) from a
	// given array list.

	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		System.out.println("COlor at Index 3 is: "+MyArrayList.get(3));
	}

}
