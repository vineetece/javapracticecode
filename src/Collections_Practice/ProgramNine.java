package Collections_Practice;

import java.util.ArrayList;

public class ProgramNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

// Write a Java program to copy one array list into another
	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");
ArrayList<String> CloneArrayList = (ArrayList<String>) MyArrayList.clone() ;
System.out.println("Cloned Array List is : "+CloneArrayList);
	}
}