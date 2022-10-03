package Log_in_page;
import java.util.Scanner;

class main {

 String myName;

	public void Full_name() {
	String fname, lname, Fname;


	Scanner name1 = new Scanner(System.in);
	System.out.println("Enter your first name :"+" ");
	fname = name1.nextLine();

	Scanner name2 = new Scanner(System.in);
	System.out.println("Enter your last name :"+" ");
	lname = name2.nextLine();

	Fname = fname + " " + lname;

	myName = Fname;
	}

	static void password() {
	String p_Word = "Prince";
	String P_word;

		Scanner myP = new Scanner(System.in);
		System.out.println("Enter your password :"+ " ");
		P_word = myP.nextLine();

	if (P_word.equals(p_Word)) {
		main myobj = new main();
		System.out.println("Welcome" + myobj.myName);
	}
	else {
		System.out.println("Wrong details. Try Again");
	}
	}
	
	public static void main(String[] args) {
		main myobj = new main();
		myobj.Full_name();

		password();
	}
}