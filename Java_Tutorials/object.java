public class object {
	int x = 19;
	public static void main(String[] args) {
		object myObj = new object();
		System.out.println(myObj.x);

		// multiple objects
		object me1 = new object();
		object me2 = new object();
		System.out.println(me1.x);
		System.out.println(me2.x);
	}
}
// object in line 4, 8 and 9 is the class name 
// myObj, me1 and me2 are the names of d objects created
//