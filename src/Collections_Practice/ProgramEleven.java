package Collections_Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ProgramEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}
// Write a Java program to reverse elements in a array list. 

	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");
		Collections.reverse(MyArrayList);
		for (String s : MyArrayList)
			System.out.println(s);
	}
}
