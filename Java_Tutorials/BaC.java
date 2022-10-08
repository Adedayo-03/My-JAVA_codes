
public class BaC{
	public static void main(String[] args){
		// Break and Continue...
		// using in for loop
		// Break...
		System.out.println("Set of numbers from 0 - 10");
		for (int i = 0; i < 11; i++) {
			if (i == 5){
				break;
			}
			System.out.println("Num :"+" "+ i);
		}
		// Continue...
		System.out.println("Set of numbers from 0 - 20");
		for (int i = 0; i <= 20; i = i + 2){
			if (i == 10){
				continue;
			}
			System.out.println("Num ="+" "+ i);
		}
		// Using in While loop
		// Break...
		int i = 0;
		while (i < 11){
		System.out.println("Number :"+" "+ i);
		i++;
		if (i == 5){
			break;
		}
	}
	// Continue...
	int j = 0;
	while (j < 20){
		if (j == 10){
			j = j + 2;
			continue;
		}
		System.out.println("Number ="+" "+ j);
		j = j + 2;
	 }
	}
}