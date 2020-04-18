package practiceArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice();
	}

	static int UserInput() throws NumberFormatException, IOException {
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		int input = Integer.parseInt(br.readLine());
		return input;
	}// UserInput method closed

	static void practice() {
		int a[][][] = { { { 11, 21, 31 }, { 41, 51, 61 }, { 22, 23, 24 } },
				{ { 34, 35, 36 }, { 71, 81, 91 }, { 10, 11, 12 } },
				{ { 32, 33, 45 }, { 65, 66, 67 }, { 76, 77, 78 } } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++)
					System.out.print(a[i][j][k] + " ");
				System.out.println();
			}
			System.out.println();
		}
	}
}
