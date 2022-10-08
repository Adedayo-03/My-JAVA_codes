package Constructors;

public class Main {
	int x;
	public Main (int y) {
		// x = 19;
		x = y;
	}
	public static void main(String[] args) {
		Main myObj = new Main(18);
		System.out.println(myObj.x);
	}
}
