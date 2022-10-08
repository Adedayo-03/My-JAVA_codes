package Polymorphism;

class Main {
 public void techBro() {
  System.out.println("These are tech jobs:");
 }
}

class job1 extends Main{
 public void techBro() {
 final String j1 = "Software Engineering";
 System.out.println(j1);
 }
}

class job2 extends Main {
 public void techBro() {
 final String j2 = "Web Development";
 System.out.println(j2);
 }
}

class job3 extends Main {
 public void techBro() {
 final String j3 = "Data Analysts";
 System.out.println(j3);
 }
}

class OuterMain {
 public static void main(String[] args) {
  Main myJob = new Main();
  Main myJob1 = new job1();
  Main myJob2 = new job2();
  Main myJob3 = new job3();

  myJob.techBro();
  myJob1.techBro();
  myJob2.techBro();
  myJob3.techBro();
 }
}