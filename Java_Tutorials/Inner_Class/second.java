// accessing outer class for inner class
class Outersecond {
	int x = 10;
	class Innersecond {
		public int myInnerMethod() {
				return x;
		}
	}
}
public class second {
public static void main(String[] args) {
	Outersecond myOut = new Outersecond();
	Outersecond.Innersecond myIn = myOut.new Innersecond();

	System.out.println(myIn.myInnerMethod());
}
}
