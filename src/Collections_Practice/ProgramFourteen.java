package Collections_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

	// Write a Java program of swap two elements in an array list.
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		Collections.swap(MyArrayList, 1, 2);
		System.out.println(MyArrayList);
	}

}
