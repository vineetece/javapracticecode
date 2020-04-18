package Collections_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyHashMap();
	}

	static void MyHashMap() throws IOException {
		HashMap h = new HashMap();
		int i = 1;
		while (i <= 4) {
			h.put(UserInput("Please enter Student Roll Number: "), UserInput("Please enter Marks for Mathematic: "));
			i++;
		}
		Set s = h.entrySet();

		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry h1 = (Map.Entry) it.next();
			System.out.println("Roll Number " + h1.getKey() + " got Marks in Mathematics " + h1.getValue());
		}
	}

	static int UserInput(String b) throws IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.println(b);
		int a = Integer.parseInt(br.readLine());
		return a;
	}
}
