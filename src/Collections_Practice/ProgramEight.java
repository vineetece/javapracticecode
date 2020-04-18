package Collections_Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ProgramEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}
// Write a Java program to sort a given array list.
	
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");
		
		Collections.sort(MyArrayList);
		for (String s : MyArrayList) System.out.println(s);
	}
}
