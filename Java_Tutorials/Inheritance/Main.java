package Inheritance;
class Main {
 protected String fName = "Adedayo";

 public void greetings () {
  System.out.println("How are you today?");
 }
}

class Main1 extends Main {
 private String lName = "Adejare";

 public static void main(String[] args) {
  Main1 Fname = new Main1();

  Fname.greetings();

  System.out.println(Fname.fName + " " + Fname.lName);
  
 }
}
