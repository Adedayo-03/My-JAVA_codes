package Abtraction;

abstract class name {
	public abstract void lname();
	public void fname() {
		System.out.println("Adedayo");
	}
}
class name1 extends name {
	public void lname() {
		System.out.println("Adejare");
	}
}
public class main {
	public static void main(String[] args) {
		name1 myObj = new name1();
		myObj.fname();
		myObj.lname();
	}
}
