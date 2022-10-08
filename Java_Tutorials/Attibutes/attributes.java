package Attibutes;

public class attributes {
	int a;
	int b = 20;
	int c = 30;
	final int d = 40;
	String fName = "Adedayo";
	String lName = "Adejare";
	public static void main(String[] args) {
		attributes myObj1 = new attributes();
		myObj1.a = 10;
		System.out.println("We assigned 10 as the first number is:" + " " + myObj1.a);

		attributes myObj2 = new attributes();
		myObj2.b = 25;
		System.out.println("The second number was changed to:" + " " + myObj2.b);

		attributes myObj3 = new attributes();
		System.out.println("The third number is:" + " " + myObj3.c);

		attributes myObj4 = new attributes();
		System.out.println("The fourth number can not be changed, it was left as:" + " " + myObj4.d);
		
		attributes myObj5 = new attributes();
		System.out.println("Hello" + " " + myObj5.fName.toUpperCase() + " " + myObj5.lName.toUpperCase());

	}
}
