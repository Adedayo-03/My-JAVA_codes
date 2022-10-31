package Calculator;

import java.util.Scanner;

interface Calculator 
{
void add(double x, double y);
void subtract(double x, double y);
void divide(double x, double y);
void multiply(double x, double y);	
}

class math_func implements Calculator 
{
	public void add(double x, double y) 
	{
		System.out.println(x + y);
	}
	public void subtract(double x, double y) 
	{
		System.out.println(x - y);
	}
	public void divide(double x, double y) 
	{
		System.out.println(x / y);
	}
	public void multiply(double x, double y) 
	{
		System.out.println(x * y);
	} 
}

class calc 
{
	static void simple_calc() 
	{
		Scanner fig = new Scanner(System.in);
		int a, b;
		a = fig.nextInt();
		b = fig.nextInt();
		Calculator myObj = new math_func();

		Scanner request = new Scanner(System.in);
		System.out.print("Hello!"+" ");
		System.out.println("Do you want to calculate? Yes / No (Y / N):");
		String pick = request.nextLine();

		if (pick.equals("Y")) 
		{
			for (int i = 0; i <= 1; i++) 
			{
				System.out.println("Which mathimatical operators would you like to use?");
				System.out.println("If you want to ADD choose : A");
				System.out.println("If you want to SUBTRACT choose : B");
				System.out.println("If you want to DIVIDE choose : C");
				System.out.println("If you want to MULTIPLY choose : D");
				
				String option = request.nextLine();

				if (option.equals("A")) 
				{
					myObj.add(a, b);
				}
				else if (option.equals("B")) 
				{
					myObj.divide(a, b);
				} 
				else if (option.equals("C")) 
				{
					myObj.multiply(a, b);
				}
				else if (option.equals("D")) 
				{
					myObj.subtract(a, b);
				}
				else 
				{
					System.out.println("Please pick one of the above");
				}
			}
		}
		else 
		{
			System.out.println("Maybe next time I could be of help :(");
		}
	}
	/**
	 * @param args
	 */
	public static void main (String [] args) 
	{
		simple_calc();
	}
}
