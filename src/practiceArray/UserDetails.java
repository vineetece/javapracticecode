package practiceArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserDetails {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		getName();
	}

	static String UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		String input = br.readLine();
		return input;
	}// UserInput method closed

	public static void getName() throws NumberFormatException, IOException {
		String Emp[][][] = new String[1][3][3];
		for (int i = 0; i < Emp.length; i++) {
			for (int j = 0; j < Emp[i].length; j++) {
				for (int k = 0; k < Emp[i][j].length; k++) {
					if (k == 0) {
						System.out.println("Enter Employee Name:");
						String name = UserInput();
						Emp[i][j][k] = name;
					} else if (k == 1) {
						System.out.println("Enter Employee DOB:");
						String dob = UserInput();
						Emp[i][j][k] = dob;
					} else if (k == 2) {
						System.out.println("Enter Employee Place of Birth:");
						String place = UserInput();
						Emp[i][j][k] = place;
					}
				} // For Closed
			} // For Closed
		} // For Closed

		for (String[][] s : Emp) {
			for (String[] d : s) {
				for (String e : d) {
					System.out.println(e);
				}
			}
		}
		/*
		 * for (int i = 0; i < Emp.length; i++) { for (int j = 0; j < Emp[i].length;
		 * j++) { for (int k = 0; k < Emp[i][j].length; k++) {
		 * System.out.print(Emp[i][j][k]); } } System.out.println(" "); }
		 * System.out.println();
		 */
	} // getName Closed
} // Main CLosed
