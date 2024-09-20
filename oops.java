class Pen {
  String color;
  String type;

  public void write() {
    System.out.println("Writing Something");
  }

  public void printColor() {
    System.out.println(this.color);
  }
}

class Student {
  String name;
  int age;

  // Polymorphism
  public void printInfo(String name) {
    System.out.println(this.name);
  }

  public void printInfo(int age) {
    System.out.println(this.age);
  }

  public void printInfo(String name, int age) {
    System.out.println(this.name + " " + this.age);
  }

  // parameter Constructer

  // Student(String name, int age) {
  // this.name = name;
  // this.age = age;
  // System.out.println("Constructer Call");
  // }

  // Copy Constructer
  // Student(Student s2) {
  // this.name = s2.name;
  // this.age = s2.age;
  // }

  // Student() {

  // }
}

public class oops {

  public static void main(String[] args) {
    // Pen pen1 = new Pen();
    // pen1.color = "blue";
    // pen1.type = "gel";
    // Pen pen2 = new Pen();
    // pen2.color = "black";
    // pen2.type = "ballpen";
    // pen1.write();
    // pen1.printColor();
    // pen2.printColor();

    // Constructer Call
    // Student std = new Student("Banti Singh Rajput", 19);
    // std.printInfo();

    // Copy Constructer
    Student s1 = new Student();
    s1.name = "Sony";
    s1.age = 24;

    // Student s2 = new Student(s1);
    // s2.printInfo();

    // Polymorphism
    s1.printInfo(s1.name, s1.age);
  }
}