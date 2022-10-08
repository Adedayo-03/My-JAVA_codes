import java.util.Scanner;
public class math{
 public static void main (String[] args){
   int RandomNum = (int)(Math.random()*101);
   int a, b, c;

   Scanner myObj = new Scanner(System.in);
   System.out.println("Enter a  Number For a :");
    a = Integer.parseInt(myObj.nextLine());

   Scanner MyObj = new Scanner(System.in);
   System.out.println("Enter a  Number For b :");
   b = Integer.parseInt(MyObj.nextLine());

    
    Scanner Me = new Scanner(System.in);
    System.out.println("Enter a negative number:");
    c = Integer.parseInt(Me.nextLine());
    
   System.out.println("The positive Number for c is:"+" "+ Math.abs(c));
   System.out.println("The numbers you entered are:"+" "+ a +","+" "+ b +" "+"and"+ c);
   System.out.println("A random number from 1 - 100 :"+" "+RandomNum);
   System.out.println("The Largest:"+" "+Math.max(a, b));
   System.out.println("The smallest:"+" "+Math.min(a, b));
   System.out.println("The square root of a:"+" "+Math.sqrt(a));
   System.out.println("The square root of b:"+" "+Math.sqrt(b));
   System.out.println("The square root of c:"+" "+Math.sqrt(Math.abs(c))); 
 }
}