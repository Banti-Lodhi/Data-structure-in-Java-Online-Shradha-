// // class Student {
// //     String name;
// //     int age;

// // public void getInfo() {
// // System.out.println("Name of student is " + this.name);
// // System.out.println("Age of the student is " +this.age);
// // }

// // class Pen {
// // String color;
// // public void printColor() {
// // System.out.println("The color of this pen is "+this.color);
// // }
// // }

// // Non parameterized costurcter
// // Student() {
// // System.out.println("Constucter called");
// // }

// // parameterized costeructer

// // copy constructer
// // Student (Student s2) {
// // this.name = s2.name;
// // this.age = s2.age;
// // }

// // Student () {

// // }
// // }

// // polymorphism

// //     public void printInfo(String name) {
// //         System.out.println(name);
// //     }

// //     public void printInfo(int age) {
// //         System.out.println(age);
// //     }

// //     public void printInfo(String name, int age) {
// //         System.out.println(name +" "+ age);
// //     }
// // }

// //Inheritense
// class shpae {
//     public void area() {
//         System.out.println("Displays Area");
//     }

//     class Tringle extends Shape {
//         public void area(int h, int b) {
//             System.out.println((1 / 2) * b * h);
//         }

//         @Override
//         public boolean equals(Object obj) {
//             // TODO Auto-generated method stub
//             return super.equals(obj);
//         }

//     }

//     // Heirachical instance
//     class Circle extends Shpae {
//         /**
//          * @param r
//          */
//         public void area(int r) {
//             System.out.println((3.14) * r * r);
//         }

//     }
// }


//package in java
// package newPackage;
class Account {
    public String name;
    protected String email;
    private String password;

    //getters & setters password
    public String getpassword() {
        return this.password;
    }

    public void setpassword(String pass) {
        this.password = pass;
    }
}


public class Oops {
    public static void main(String[] args) {

        Account account1 = new Account();
        account1.name = "prathma bank";
        account1.email = "bsk@gmail.com";
        account1.setpassword("abcd");
    System.out.println(account1.getpassword());
        // Student s1 = new Student();
        // s1.name = "Preetam bhaiya";
        // s1.age = 20;
        // s1.printInfo(s1.name, s1.age);

        // Student s2 = new Student(s1);
        // s2.name = "Sanjay bhaiya";
        // s2.age = 19;
        // s2.getInfo();

        // Pen p1 = new Pen();
        // p1.color = "Red";
        // Pen p2 = new Pen();
        // p2.color = "blue";
        // Pen p3 = new Pen();
        // p3.color = " white";
        // p1.printColor();
        // p2.printColor();
        // p3.printColor();
    }
}
