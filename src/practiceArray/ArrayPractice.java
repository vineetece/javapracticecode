package practiceArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayPractice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		// Test();
		 TableCreate();
		//ArrayTwoD();

	}

	static void Test() {
		int EmpID[] = { 1, 2, 3, 4, 5 };

		String EmpName[] = { "Raj", "Pallavi", "Vineet", "Raju", "Hari" };
		for (int i = 0; i < 5; i++) {
			System.out.println(EmpID[i] + "=" + EmpName[i]);
		}

	}// Test Method Closed

	// User Input Method

	static int UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		System.out.println("Enetr any integer Value ");
		BufferedReader br = new BufferedReader(r);
		int a = Integer.parseInt(br.readLine());
		return a;

	}// UserInput Method Closed

	// Table Generation Logic Method

	static void TableCreate() throws NumberFormatException, IOException {
		int g[][] = new int[2][11];

		int a = UserInput();
		int b = UserInput();
		for (int j = 0; j <= 10; j++) {
			g[0][j] = j * a;
		}
		for (int k = 0; k <= 10; k++) {
			g[1][k] = k * b;
		}
		
		for(int l=0; l<g.length;l++) {
			for(int m =0; m<g[l].length; m++) {
				System.out.println(g[l][m]);
			}
			
		}
		
	}
/*
// Creating a 2D array
	static void ArrayTwoD() throws NumberFormatException, IOException {
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) // getting values like b[1], b[2], b[3]
			{
				System.out.println(b[i][j]);
			} // for closed
			System.out.println(); // for new line space
		} // for closed
	}// ArrayTwoD closed
*/
}// Main Closed