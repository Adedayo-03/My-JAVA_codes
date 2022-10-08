package Class_Methods;

class method {
	// Static Method.
	static void myStaticMethod ()	 {
		System.out.println("I am Prince.");
	}
	// Static Method can be called without an OBJECT

	// Public Method.
	public void myPublicMethod () {
		System.out.println("I am Prince..");
	}
	//Public void method can not be called without an object
// therefore; A Public Method can only accessed by an OBJECT.
	public static void main(String[] args) {
		myStaticMethod(); // Static Mehtod.

		method myObj = new method(); // Created an OBJECT for the Class method.
		myObj.myPublicMethod(); // Called the Public Method with OBJECT created.
		
	}
}