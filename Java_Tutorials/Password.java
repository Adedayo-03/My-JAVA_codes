import java.util.Scanner;
public class Password {
 public static void main(String[] args) {
  int Lpin = 1970, Pin;

  Scanner MyPin = new Scanner(System.in);
  System.out.println("Enter your pin");
  Pin = Integer.parseInt(MyPin.nextLine());

  if(Lpin == Pin){
    System.out.println("Welcome");
  }
  else{
    System.out.println("Error: Incorrect Pin");
  }
 }
}