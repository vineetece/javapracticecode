package LinkedListPractice;

import java.util.LinkedList;
import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method();
	}

// 
	static void Method() {
LinkedList<String> MyLinkedList = new LinkedList<>();

for (int i=0; i<10; i++) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter number for index "+ i+": ");
	String Input = sc.nextLine();
	MyLinkedList.add(Input);
}

System.out.println("This is your first Value : "+MyLinkedList.getFirst());
System.out.println("This is your last Value : "+MyLinkedList.getLast());

	}

}

