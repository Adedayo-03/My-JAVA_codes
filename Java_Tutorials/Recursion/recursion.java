package Recursion;

public class recursion {
	public static void main(String[] args) {
		int result = sum(19);
		System.out.println(result);

		int product = Sum(19, 21);
		System.out.println(product);
	}

	static int sum (int x) {
		if (x > 0) {	
			return x + sum(x - 1);
		}
		else{
			return 0;
		}	
	}
	// halting condition
	// the condition where the function stops calling itself.
	public static int Sum (int y, int z) {
		if (z > y) {
			return z + Sum(y, z - 1);
		}
		else {
			return z;
		}
	}
	
}
