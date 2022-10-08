package Login_In;
import java.util.Scanner;
public class logIn {
	 static void Welcome(String fname, String lName) {
		String Fname = fname + " " + lName;
		System.out.println("Welcome" + " " + Fname);
	}

	static void Password() {
		int Mpin, Pin;
		Pin = 1970; // int only accepts 10 characters.

		Scanner myPin = new Scanner(System.in);
		System.out.print("Enter Your Pin:" + " ");
		Mpin = myPin.nextInt();

		if (Pin != Mpin) {
			System.out.println("Error: The password you have entered is INCORRECT. Try Again");
		} else {
			Welcome("Adedayo", "Adejare");
		}
	}

	public static void main(String[] args) {
		Password();
	}
}