package Collections_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}
// Write a Java program to compare two array lists. 

	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");
		/*
		 * ArrayList<String> NewList = (ArrayList<String>) MyArrayList.clone();
		 * Collections.sort(NewList);
		 */
		ArrayList<String> NewList = new ArrayList<>();
		NewList.add("Indigo");
		NewList.add("Purple");
		NewList.add("Safron");
		NewList.add("Black");
		NewList.add("White");

		boolean isEqual = MyArrayList.equals(NewList);
		System.out.println(isEqual);
		NewList = (ArrayList<String>) MyArrayList.clone();
		isEqual = MyArrayList.equals(NewList);
		System.out.println(isEqual);
	}
}
