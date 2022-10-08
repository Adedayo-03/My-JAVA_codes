package Welcome;
import java.util.Scanner;
public class welcome {
	public static void main(String[] args) {
		String Fname, Lname, Full_name, Oname;

		Scanner Me1 = new Scanner(System.in);
		System.out.println("Enter your First Name:");
		Fname = Me1.nextLine();

		Scanner Me2 = new Scanner(System.in);
		System.out.println("Enter your Last Name:");
		Lname = Me2.nextLine();

		Full_name = Fname+" "+Lname;
		Oname = Full_name;

		System.out.println("Welcome"+" "+Oname.toUpperCase());
	}
}