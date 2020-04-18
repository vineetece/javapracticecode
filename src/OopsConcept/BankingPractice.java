package OopsConcept;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BankingPractice {

	static void loginToBankingAccount() {
		System.out.println("Please Open Bank Account with ICICI");
	}

	static void loginToBankingAccount(String username) {
		System.out.println("You have Login with Username Successfully.");
	}

	static void loginToBankingAccount(int i) {
		System.out.println("You have Login with OTP Successfully.");
	}

	static void loginToBankingAccount(double d) {
		System.out.println("You have Login with Passcode Successfully.");
	}

	static void AccessBankAccount() throws NumberFormatException, IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		System.out
				.println("Press 1 for accessing account with OTP" + "\n" + "Press 2 for accessing account with UserName"
						+ "\n" + "Press 3 for accessing account with Pass Code");
		int a = Integer.parseInt(sc.readLine());
int b;
String c;
double d;
		if (a == 1) {
			do {
			System.out.println("Enter OTP for accessing Account using OTP");
			}
			while(!Integer.parseInt(sc.readLine())) {
			b = Integer.parseInt(sc.readLine());
			loginToBankingAccount(b);
		}
		}
		else if (a == 2) {
			System.out.println("Enter User Name for accessing Account using UserName");
			c = sc.readLine();
			loginToBankingAccount(c);
		} else if (a == 3) {
			System.out.println("Enter Pass Code for accessing Account using Pass Code");
			d = Double.parseDouble(sc.readLine());
			loginToBankingAccount(d);
		} else {
			loginToBankingAccount();
		}
	}
}

class hdfc extends BankingPractice {
	static void loginToBankingAccount() {

		System.out.println("Please Open Bank Account with HDFC");
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		AccessBankAccount();
	}
}