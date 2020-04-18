package Collections_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyMethod();
	}

// Take User Input	
	static void MyMethod() throws IOException {
		HashSet<String> h = new HashSet<>();
		boolean flag = false;
		String b;
		while (flag == false) {
			InputStreamReader r = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(r);
			System.out.println("Please enter Value: ");
			String a = br.readLine();

			if (h.contains(a)) {
				System.out.println("You have entered duplicate value.");
				System.out.println("Dou you want to enter next value? Enter Yes / No:");
				InputStreamReader r1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(r1);
				b = br1.readLine();
				if (b.equals("No")) {
					flag = true;
				} else {
					flag = false;
				}
			} else {
				h.add(a);
			}
		}
	}
}
