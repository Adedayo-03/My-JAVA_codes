public class oMethods {
	static  int plusMethod(int x, int y) {
		return x * y;
	}
	static double plusMethod(double c, double d, double e) {
		return c + d / e;
	}
	public static void main(String[] args) {

		int a = plusMethod(8, 3);
		double p = plusMethod(15 , 3, 7);

		System.out.println(a);
		System.out.println(p);
	}
}