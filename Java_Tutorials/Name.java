public class Name {
	public static void main(String[] args) {
		String Name = "Prince";
		int i = 0;

		// While loop.
		while (i < 1){
			System.out.println(Name);
			i++;
		}
		// Do While loop.
		do {
			System.out.println("I am "+ Name);
		}
		while (i < 1);
		// For loop.
		for (int j = 0; j < 1; j++){
			System.out.println(Name+" "+"is my Name");
		}
		// For loop with number.
		System.out.println("Numbers from 0 - 9");
		for (int j = 0; j < 10; j++){
			System.out.println(j);	
		}
		System.out.println("Numbers from 0 - 10");
		for (int j = 0; j <= 10; j++){
			System.out.println(j);
		}
		System.out.println("Multipules of 2 from 0 - 9");
		for (int j = 0; j < 20; j = j + 2){
			System.out.println(j);
		}
		System.out.println("Multipules of 2 from 0 - 10");
		for (int j = 0; j <= 20; j = j + 2){	
			System.out.println(j);
		}
		// For each loop with an Array
		String [] hobbies = {"Football Games", "Football", "Coding", "Swimming", "Music"};
		for (String a : hobbies){
			System.out.println("I like"+" "+a);
		}

		
	}
} 