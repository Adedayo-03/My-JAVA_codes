// Outer class
class Outermain {
	int x = 10; // attribute of the Outer class
	// Inner class
	// class Innermain {
	// 	int y = 5; // attribute of the Inner class
	// }	

	// using static class
	// static class
	static class Innermain{
		int y = 9;
	}
}
// The main class
/* Every other class and it's attribute(s) will be call inside it */
public class main {
 // Main method
	public static void main(String[] args) {
		// The object myOuter is used to call the attributes of the Outer class
		Outermain myOuter = new Outermain();
		// The object mtInner is used to call the attribute of the inner class
		// Outermain.Innermain myInner = myOuter.new Innermain();
		Outermain.Innermain myInner1 = new Outermain.Innermain();// the static inner class can be accessed without the creating an object of the outer class
/* The inner class is called through the outer class */
		// System.out.println(myOuter.x * myInner.y);
		System.out.println(myInner1.y * myOuter.x); 

	}
}