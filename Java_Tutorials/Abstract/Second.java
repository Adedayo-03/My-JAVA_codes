package Abstract;
class Second {
 public static void main(String[] args) {
  Student myObj = new Student();// created an Object for the sub-class.

  System.out.println("Student ID of Prince");
  System.out.println("Name:" + " " + myObj.me);
  System.out.println("age:" + " " + myObj.age);
  System.out.println("Graduation Year:" + " " + myObj.gradYear);
  
  myObj.study();// The abstract method is called.
 }
}