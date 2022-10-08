import java.util.Scanner;
public class welcome {
	
	static void fName(String name1, String name2) {
		System.out.println("Welcome"+" "+name1.toUpperCase()+" "+name2.toUpperCase());
	}
	public static void main(String[] args) {
		String Lname, Fname;

		Scanner me1 = new Scanner (System.in);
		System.out.println("Enter 'ur First Name:");
		Fname = me1.nextLine();

		Scanner me2 = new Scanner(System.in);
		System.out.println("Enter 'ur Last Name:");
		Lname = me2.nextLine();

		fName(Fname, Lname);
	}
}