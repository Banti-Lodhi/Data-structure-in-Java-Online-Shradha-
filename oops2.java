// Interface Class
//   String name;
//   static String school;

//   public static void changeSchool() {
//     school = "New School";
//   }
// }

interface Animal {
  int eyes = 2;

  void walk();
}
interface herviouse {
  
}

class Hourse implements Animal, herviouse {
  public void walk() {
    System.out.println("Walk on Four legs on the High way");
  }
}

public class oops2 {

  public static void main(String[] args) {

    // Student.school = "PSM Inter College rampur up";
    // Student std = new Student();
    // std.name = "Preetam Singh";
    // System.out.println(std.school);

    Hourse hsr = new Hourse();
    hsr.walk();
  }
}
