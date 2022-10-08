import java.util.Scanner;
public class age {
 public static void main(String[] args) {
  int age;

  Scanner myAge = new Scanner(System.in);
  System.out.println("Enter your age:");
  age = Integer.parseInt(myAge.nextLine());

  if (age < 18) {
    System.out.println("You 're too young for this job"); 
  }
  else if (age > 50) {
    System.out.println("You 're too old for this job");
  }
  else {
    System.out.println("We're looking forward to seeing ypu next Monday");
  }
 }
}