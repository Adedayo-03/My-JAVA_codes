import java.util.Scanner;
public class main {
	// The Name Method
	static void Welcome(String fname, String lName) {
		String Fname = fname + " " + lName;
		System.out.println("Welcome" + " " + Fname);
	}
// The Main deal 
// The password Method
	static void Password() {
		int Mpin, Pin;
		Pin = 1970; // int only accepts 10 characters.

		Scanner myPin = new Scanner(System.in);
		System.out.print("Enter Your Pin:" + " ");
		Mpin = myPin.nextInt();
			// Password Checker
		if (Pin != Mpin) {
			System.out.println("Error: The password you have entered is INCORRECT. Try Again");
		} 
		else {
			Welcome("Adedayo", "Adejare");
		}
	}
	public static void main(String[] args) {
		Password();
	}
}