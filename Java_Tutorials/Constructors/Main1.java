package Constructors;

public class Main1 {
	int modelYear;
	String Brand;
	public Main1(int Year, String carName) {
		modelYear = Year;
		Brand = carName;
	}
	public static void main(String[] args) {
		Main1 myCar = new Main1(2003, "Toyota");
		System.out.println(myCar.modelYear + " " + myCar.Brand);
	}
}
