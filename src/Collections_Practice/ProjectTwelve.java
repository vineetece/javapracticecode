package Collections_Practice;

import java.util.ArrayList;
import java.util.List;

public class ProjectTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterate();
	}

	// Write a Java program to extract a portion of a array list.

	static void Iterate() {
		ArrayList<String> MyArrayList = new ArrayList<>();
		MyArrayList.add("Yellow");
		MyArrayList.add("Red");
		MyArrayList.add("Green");
		MyArrayList.add("Blue");
		MyArrayList.add("Orange");

		List<String> SubList = MyArrayList.subList(1, 3);
		System.out.println(SubList);
	}
}