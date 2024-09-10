

// import java.sql.Time;
// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

//constructers

// int x;
// int y;

// Complex() {
//     x = 10;
//     y = 20;
//     System.out.println("Inside constructer");

// public void display() {
//     System.out.println(x);
//     System.out.println(y);
// }

// public static void main(String[] args) {
//     Complex c1 = new Complex();
//     c1.display();
// }

//copy constructer
// class Complex {

//     private int real, imaginary;

//     // Anormal parmeterized constructer
//     public Complex(int real, int imaginary) {
//         this.real = real;
//         this.imaginary = imaginary;

//     }

//     // copy constructer
//     Complex(Complex C) {
//         System.out.println("Copy constructer called");
//         real = C.real;
//         imaginary = C.imaginary;
//     }

//     public String toString() {
//         System.out.println(real + "+" + imaginary + "i");
//         return null;

//     }

// }

//         Complex C1 = new Complex(20, 30);
//         Complex C2 = new Complex(C1);
//         Complex C3 = C2;

//     System.out.println(C3);

// int x;
// int y;

// ClassObject() {
// x = 25;
// y = 30;
// System.out.println("Inside first constructer");
// }
// ClassObject(int a) {
// x = a;
// y = 50;
// System.out.println("Inside second constructer");
// }
// ClassObject(int a, int b) {
// x=a;
// y=b;
// System.out.println("Inside third constructer");
// }

// public void display() {
// System.out.println(x);
// System.out.println(y);
// }

// ClassObject c1 = new ClassObject();
// ClassObject c2 = new ClassObject();
// ClassObject c3 = new ClassObject();
// c1.display();
// c2.display();
// c3.display();

// Declaration of method
// public int book(int pages, String name) {
//     pages = 150;
//     name = "java";
//     int cost = 3 * pages;
//     System.out.println("cost of " + name + " book is " + cost);
//     return cost;
// }

//method calling  using int keyword
//     public static int maxFunction(int x, int y) {
//         int max;
//         if(x > y) {
//             max = x;
//         }
//         else{
//             max = y;
//         }
//         return max;
//     }
//    
//         int x=10;
//         int y =16;
//         int c = maxFunction(x, y);
//         System.out.println("max value is "+c);

//     }
//     }

//method calling using void keyword
//     public static void maxFunction(int x, int y) {
//         int max;
//         if(x > y) {
//             max = x;
//         }
//         else{
//             max = y;
//         }
//         System.out.println("Maximum value is " +max);
//     }

//      int a = 16; 
//      int b = 27;
//      maxFunction(a, b);

//passing parametrs
// class book {
//     public int x;

//     int change(int x) {
//            x = x + 10;
//         return x;
//     }
// }

// 
//         book b1 = new book();
//         b1.x = 50;
//         System.out.println("Before change value " + b1.x);

//         // method is called by value
//         System.out.println("After change value " + b1.change(60));

// Method overloading

// public static int maxFunction(int x, int y) {
// public int Max;
//     if(x > y) 
//     Max = x;
//     else
//     Max = y;
//     return Max;
// }

// public static int maxFunction(int b) {
//         int a = 10;
//         int Max;
//         if(a > b)
//         Max = a;
//         else
//         Max = b;
//         return Max;
// }
// public class ClassObject {

//     public static void main(String[] args) {

//         int a1 = 20; 
//         int b1 = 40;
//         int c = maxFunction(a1, b1);
//         int d = maxFunction(40);
//         System.out.println("Maximum value 1"+c);
//         System.out.println("Maximum value 2"+d); 

//this keyword

// class A {
//     int rollno;
//     String name;

//     A() {
//         System.out.println("Hello");
//     }

//     A(int rollno, String name) {
//         this();
//         this.rollno = rollno;
//         this.name = name;

//     }

//     void Method() {
//         System.out.println("roll no is " + rollno);
//         System.out.println("name is " + name);
//     }

//     public static void main(String[] args) {

//         A a = new A(7, "Shivam");
//         a.Method();
//     }
// }

//Static Method 

//         Student a1 = new Student();
//         a1.showData();
//         Student a2 = new Student();
//         a2.showData();

//     }
// }
// class Student {
//     int x;
//     static int y;
//     Student() {
//         y++;

//     }
//     public void showData() {
//         System.out.println(x);
//         System.out.println(y);

//static keyword

//     static int x;
//     static int y;
//     static {
//         x=100;
//         y=120;
//     }
//     public static void main(String[] args) {
// System.out.println(x);
// System.out.println(y);

/*Autoboxing */
//    public class C {
//     public static void main(String[] args) {
//     int a=4;
//    Integer a2 = new Integer(a);
//    Integer a3 = 15; 
//      System.out.println(a2 +" " + a3);   
//     }
//  }

/*UnAutoboxing*/

// public class C {
//        public static void main(String[] args) {
//    Integer i = new Integer(100);
//    int a = i;
//    System.out.println(a); 
//        }
//    }

/*String variables*/

// public class C {
//    public static void main(String [] args) {
//       String s1 = "Assian";
//       char ch[] = {'V', 'i', 's', 'h', 'a', 'l'};
//       String s2 = new String(ch);
//       String s3 = new String("Preetam kumar");
//       System.out.println(s1);
//       System.err.println(s2);
//       System.err.println(s3);

//       //length of character
//       System.err.println(ch.length);

//       System.out.println(s3.length());
//    }
// }

/*String  Buffer */
// import java.io.*;
// public class C {
//    public static void main(String [] args){

//       StringBuffer s = new StringBuffer("Vishal kumar");
//     System.out.println(s.length());  

//    }
// }

/*twin prime number less than 100*/
// public class C {
//     public static void main(String[] args) {
//         for (int i = 2; i < 100; i++) {
//             if (is_Prime(i) && is_Prime(i + 2))

//                 System.out.printf("(%d, %d)\n", i, i + 2);
//         }

//     }

//     public static boolean is_Prime(long n) {
//         if (n < 2) {
//             return false;

//         }
//         for (int i = 2; i <= n/2; i++) {
//             if (n % i == 0) {
//                 return false;
//             }

//         }
//         return true;
//     }

// }

/*print current date and time */
// public class C {
//     public static void main(String[] args) {

//      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//      LocalDateTime now = LocalDateTime.now();
//      System.out.println(dtf.format(now));

//     }
// }

/*create area of pentagon */

// public class C {
//     public static void main(String[] args) {

// float p = 12;  // perimeter
// float a = 6; // apothem

// float pentagon_Area = (5/2)*p*a;
// System.out.println("Area of Pentagon "+pentagon_Area);

//     }
// }

/*n-by-n matrix */
// import java.nio.Buffer;
// import java.nio.IntBuffer;
// import java.util.Arrays;0
// import java.util.Scanner;
// public class C {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Input number");
//         int n = sc.nextInt();

//         printMatrix(n);       
//     }
//     public static void printMatrix(int n) {
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 System.out.print((int)(Math.random() * 2) + " ");

//                 // if((i+j)/2 != 0) {
//                 //     System.out.print("1");
//                 // }else
//                 // System.out.print("0");
//             }
//             System.out.println();
//         }
//     }
// }

// public class C {
//     public static void main(String[] args) {

//         Scanner A = new Scanner(System.in);
//         System.out.println("Input number");
//         int Year = A.nextInt();

//         if(Year == 365) {
//             System.out.println("This is not leap year");
//         }else if(Year == 366)
//         System.out.println("this is a leap year");  
//         else
//         System.out.println("Neither leap year nor a year");
//     }

// }
// 
/* */

// public class C {
//     public static void main(String[] args) {
//         String str1 = "PHP";
//         System.out.println("Original String : " + str1);
//         String result_str = repeat_str(str1, 7);

//         System.out.println("\n After repeating 7 times " + result_str);

//     }

//     public static String repeat_str(String str1, int n) {
//         if (str1 == null || str1.isEmpty()) {
//             return "";
//         }
//         if (n <= 0) {
//             return str1;
//         }
//         if (Integer.MAX_VALUE / n < str1.length()) {
//             throw new OutOfMemoryError("Maximum size of String will be exceeded");
//         }
//         StringBuilder x = new StringBuilder(str1.length() * n);

//         for (int i = 1; i <= n; i++) {
//             x.append(str1);

//         }
//         return x.toString();
//     }
// }

/* assecending && decending order*/

// public class C {

//     private static String[] strs = { "Banti", "Vishal", "Shiva", "Suresh", "Aneel", "Ashok", "Azeem" };

//     public enum sort_asc_dsc {
//         ASC, DSC;
//     }

//     public static void main(String[] args) {
//         System.out.println("\n Original unsorted name" + Arrays.toString(strs));

//         sort_array_by_length(strs, sort_asc_dsc.ASC);
//         System.out.println("\n Array in Asscending order " + Arrays.toString(strs));

//         sort_array_by_length(strs, sort_asc_dsc.DSC);
//         System.out.println("\n Array in decending order " + Arrays.toString(strs));

//     }

//     public static void sort_array_by_length(String[] strs, sort_asc_dsc direction) {

//         if (strs == null || direction == null || strs.length == 0) {
//             return;
//         }
//         if (direction.equals(sort_asc_dsc.ASC)) {
//             Arrays.sort(strs, (String str1, String str2) -> Integer.compare(str1.length(), str1.length()));
//         } else if (direction.equals(sort_asc_dsc.DSC)) {
//             Arrays.sort(strs, (String str1, String str2) -> (-1) * Integer.compare(str1.length(), str1.length()));
//         }
//     }

// }

/* Write a Java program to find the longest mirror image string at both ends of a given string.*/
// // public class C {
//     public String endsWithMirrorImage(String strg) {
//         int l = strg.length();
//         String f_str = "";
//         String t_str1 = "";
//         String t_str2 = "";
//         for (int i = 0; i < l; i++) {
//             t_str1 += strg.substring(i, i + 1);
//             t_str2 = "";

//             for (int j = t_str1.length() - 1; j > 1; j--) {
//                 t_str2 += t_str1.substring(j, j + 1);
//                 if (t_str2.equals(strg.substring(l - i - 1, l))) {
//                     f_str = t_str1;
//                 }

//             }

//         }
//         return f_str;
//     }

//     public static void main(String[] args) {
//         C m = new C();
//         String str1 = "rotaver";
//         System.out.println("The given string is " + str1);
//         System.out.println("the longest  mirror string in string is" + m.endsWithMirrorImage(str1)); 

//     }
// }

/*java program to find to return substring after removing the all
 instances of remove string as given from the given string main string */
// import java.util.*;
// public class C
// {
// public String removeString(String m_string, String r_string) 
// {
//   int m_st_len = m_string.length();
//   int r_st_len = r_string.length();
//   String m_lower  = m_string.toLowerCase();
//   String r_lower  = r_string.toLowerCase();
//   String f_string = "";
//   for (int i = 0; i < m_st_len; i++) 
//   {
//     if (i <= m_st_len - r_st_len) 
// 	{
//       String tmp = m_lower.substring(i,i+r_st_len);
//       if (!tmp.equals(r_lower))
//         f_string += m_string.substring(i,i+1);
//       else 
// 	  {
//         i += r_st_len-1;
//       }
//     }
//     else 
// 	{
//       String tmp2 = m_lower.substring(i,i+1);
//       if (!tmp2.equals(r_lower))
//         f_string += m_string.substring(i,i+1);
//     }
//   }
//   return f_string;
// }

// public static void main (String[] args)
//     {
//       C m= new C();
//       String str1 =  "This is the test string";
// 	  String str2= "t";
//       System.out.println("The main string is: "+str1);
//       System.out.println("The removable string is: "+str2);
//       System.out.println("The new string is: "+m.removeString(str1,str2));
// 	  }
// }


/*https://www.geeksforgeeks.org/string-class-repeat-method-in-java-with-examples/ */
// public class C {
//   public static void main(String[] args) {
//     String string = "Vishal kumar";
//     int count = 6;
//     System.out.println("string count  is in this type is "+string.repeat(count));
    
//   }
// }


/* Creating a class named “Rectangle” with two data members length and breadth and a method to calculate
 the area which is “length*breadth”. The class has three 
 constructors which are: 1). Having no parameter - values of both length and breadth are assigned zero. 
2). Having two numbers as parameters - the two numbers are assigned as length and bre…*/


// class rectangle {

//   int length ;
//   int breadth;

//  public rectangle() {
//   length =0;
//   breadth = 0;
//  }
// public rectangle(int length) {
//   this.length = 7;
//   breadth = 8;
  
// }
// public rectangle (int length, int breadth) {
//   this.length = 8;
//   this.breadth = 9;
// }
// public void A1() {
//   System.out.println(breadth*length);
//   }
// }
// public class C {
  
//   public static void main(String[] args) {
//     rectangle C1 = new rectangle();
//     C1.A1();

//     rectangle C2 = new rectangle(10);
//     C2.A1();

//     rectangle C3 = new rectangle(12,23);
//     C3.A1();
//   }
// }


/*20. */

// class AddAmount {
//   int Amount;
//   int addAmount;

//   public AddAmount() {
// Amount = 50;
//   }
//   public AddAmount(int Amount, int addAmount) {
//     this.Amount =50;
//     this.addAmount = 120;
//   }
//   public void piggieBank() {
//     System.out.println("After add money in bank then now total money is "+(Amount+addAmount));
//   }
// }
// public class C {
  
//     public static void main(String[] args) {

//    AddAmount A1 = new AddAmount();


//    A1.piggieBank();

//    AddAmount A2 = new AddAmount(67, 89);
//    A2.piggieBank();
//      }
//   }

/*Create a class named “Programming”. While creating an object of the class, 
if nothing is passed to it, then the message “I love programming languages” should be printed. 
If some String is passed to it,then in place of “programming languages” 
 the name of that String variable should be printed. */

class code {
  String ss;
  String name;

public code(String ss) {
  name = ss;+.
}
public code() {
  name = "I love programming languages"
}

}


 public class C {
  
      public static void main(String[] args) {
        code obj = new code();
        obj.ss = "Java";
        System.out,println("I love "+obj.ss);
        System.out.println(obj.name);
  }}


  /*How is ambiguous overloaded method call resolved in java? */

  // public static void print(Object object) {
  //   System.out.println(object);
  // }
  // public static void print(String String) {
  //   System.out.println(string);
  // }

  // public class C {
  //   public static void main(String[] args) {
  //     print(null);
  //   }
  // }