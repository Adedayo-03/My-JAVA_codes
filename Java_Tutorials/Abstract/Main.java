package Abstract;

//Super class (Parent Class) 
abstract class Main {
 public String me = "Prince";
 public int age = 19;
 public abstract void study () ; // abstract method
 // The body of an abstract method is in a sub-class 
}

// Sub-class (Child Class)
// This inherits from the Main.
class Student extends Main {
 public int gradYear = 2024;
 public void study() {
  System.out.println("Studied a 4 years course");
 } // body of the abstract method.
 // The Child class is used to inherit the parent class.
 // All attributes in the parent class can be called using the child class.
}
