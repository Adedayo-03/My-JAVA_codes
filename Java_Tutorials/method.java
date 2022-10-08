public class method {
	static void myName(String Names) {
		System.out.println("I am Prince"+" "+ Names);
	}
	// for multipul paremeters
	static void aboutMe(String fname, int age) {
		System.out.println("I Prince" +" "+ fname +", "+ "am " + age +" "+ "yrs old");
	}
	// to return a value
	static int numbers(int x) {
		return 10 + x;
	}
	// to return the sum of two parameters in the same method 
	static int num1(int y, int z) {
		return y + z;
	}
	// to store the results in a variable
	static int num2(int a, int b) {
		return a * b;
	}
	// if...else in a method
	static void checkAge(int age) {
		if (age < 18) {
			System.out.println("Access Denied - You 're too young for this job");
		}
		else {
			System.out.println("Access Granted - You 're old enough for this job");
		}
	}
	public static void main(String[] args) {
		// myName();
		myName("Adedayo");
		myName("Adejare");
		myName("Adekunle");

		aboutMe("Adedayo", 19);

		System.out.println(numbers(9));

		System.out.println(num1(10, 9));

		int c = num2(10, 2);
		System.out.println("I will be"+" "+c+" "+"next year");

		checkAge(19);
	}
}