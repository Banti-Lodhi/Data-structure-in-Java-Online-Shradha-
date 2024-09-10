import java.util.*;

// public static void sum (int a,int b) {
// int sum = a+b;
// System.out.println(sum);
// }
// int a = 20;
// int b = 10;
// sum(a,b);
// int i=0, j=9;
// do{
// i++;
// if(j-- < i++){
// break;
// }
// }
// while(i < 5);
// System.out.println(i + " " + j);

// int i = 10;
// int n1 = i++ % 5;
// System.out.println("values of i " + i + "\n" + "value of n " + n1);

// int j=0;
// do {
// for(int i=2; i<1; i++) {
// System.out.println(i);

// }
// }
// while(j++ < 2);

// (iii).
// public static String s = " ";

// p:
// for(int i=2; i<7; i++) {
// if(i == 3) {
// continue;
// }
// if(i == 5) {
// break p;
// }
// s = s + 1;
// System.out.println(s);
// }
// iv->
// int x=10;
// if(++x < 10 && (x/0 > 10)) {
// System.out.println("Vishal");
// }
// System.out.println("Ruchi kumari");

// V->

// int a=10, b=20;
// while(a > b) {

// System.out.println("Vishal");
// }
// System.out.println("Ruchi kumari");

// vi->

// int intArr[][] = { { 45, 56, 89, 98, 78 } };
// Arrays.sort(intArr);
// int intKey = 98;
// for(int i=0; i<intArr.length; i++) {
// System.out.println(intKey + " Found at index = " +
// Arrays.binarySearch(intArr, intKey));
// System.out.println("Integer Arrays " + Arrays.toString(intArr));
// System.out.println("\n new array by copyOf:\n");
// System.out.println("Integer Array "+ Arrays.toString(Arrays.copyOf(intArr,
// 12)));
// System.out.println("Integer Array " + Arrays.deepHashCode(intArr));
// }
// int intArr[] = {10, 12, 24, 36, 48};
// int intArr1[] = {10, 24, 48};
// System.out.println("Integer are equals of arr1 and arr2 " +
// Arrays.equals(intArr, intArr1));

// int a = 10;
// int b = 12;
// if (a == b) {
// System.out.println("Vishal");
// }
// System.out.println("Ruchi kumari");

/* WAP to check the number ,check if it is odd or even */
// int i = 45;
// if(i%2 == 0) {
// System.out.println("number is even");

// }
// System.out.println("number is odd");
// int a=2;
// int b=3;
// // Print the area of Rectangle
// System.out.println("Area of Rectangle "+ a*b);

// 14.
// change into ascii value in the Integer value
// char c = 'h';
// int ascii = c;

// System.out.println("Ascii value of character h is " + ascii);

// int a = 6;
// double b = 6.2;

// System.out.println("add both number int and double and its values are
// "+(a+b));

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int c = sc.nextInt();

// if(a > b)
// System.out.println("a is Greater nmuber from b and c");
// else if(b > c)
// System.out.println("b is graeter number from a and c");
// else
// System.out.println("c is greater number from a and b");

/*
 * Write a Java program that reads a floating-point number and prints "zero" if
 * the number is zero.
 * Otherwise, print "positive" or "negative". Add "small" if the absolute value
 * of the number is less than 1, or
 * "large" if it exceeds 1,000,000.
 */

// Scanner sc = new Scanner(System.in);
// System.out.println("Input value");

// double input = sc.nextDouble();

// if (input > 0) {
// if (input < 1) {
// System.out.println("Positive Small valse");
// } else if (input > 1000000) {
// System.out.println("Positive large number");
// } else
// System.out.println("positive number");
// }

// else if (input < 0) {
// if (Math.abs(input) < 1) {
// System.out.println("negative small value");
// } else if (Math.abs(input) < 1000000) {
// System.out.println("negative large number");
// } else
// System.out.println("Negative value");
// }
// else
// System.out.println("Zero");

// Scanner sc = new Scanner(System.in);
// int A = sc.nextInt();
// System.err.println("Days of the weeks");

// for(int i = 0; i <= A; i++) {
// String arr[] = {"1.Sunday", "2.Monday", "3.Tuesday", "4.Wednesday",
// "5.Thursday", "6.Friday", "7.Saturday"};
// System.out.println(arr[i]);
// }

// int number = input.nextInt();
// if(366 == number) {
// System.out.println("That is a leap year");
// }
// else
// System.out.println("Invalid days not a leapYear");

// Angle Tringle
// for(int i=1; i<=10; i++) {
// for(int j=1; j<=i; j++) {
// System.out.print(i);//repeat a number in row
// System.out.print(j);//with number

// javatutoring.com/java-program-vowel-or-consonant

// int i=0;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a character");
// char ch = sc.next().charAt(0);
// switch (ch) {
// case 'a':
// case 'e':
// case 'i':
// case 'o':
// case 'u':

// case 'A':
// case 'E':
// case 'I':
// case 'O':
// case 'U': i++;

// }
// if(i == 1) {
// System.out.println("Enter character "+ch+ "is vowel");
// }
// else
// if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
// System.out.println("Enter character "+ch+ "is Constant");
// }
// else
// System.out.println("Not an elaphabet");

// Scanner sc = new Scanner(System.in);
// System.out.println("Input year");
// int year = sc.nextInt();
// if(((year % 400 == 0 )|| (year % 4 == 0)) && (year % 100 != 0)) {
// System.out.println( "is a leap year");
// }
// else
// System.out.println("is not a leap year");

/*
 * write a program in java to display n terms of natural numbers and their sum
 * and Average
 */
// int n, i, sum = 0;
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter input number");
// n = sc.nextInt();
// }
// System.out.println("the first n natural number are " + n);
// for (i = 0; i < n; i++) {
// System.out.println(i);
// sum += i;
// }
// System.out.println("the sum of natural number upto " + n + " terms " + sum);

// double Average = sum/n;
// System.out.println("Average of sum number is "+Average);

/* Cube of a number of integer value */
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter input numebr");
// int n = sc.nextInt();
// for (int i = 1; i < n; i++) {
// System.out.println("the number of cube is " + i + " and " + "Its cube is " +
// i * i * i);

// int n, i, sum = 0;
// {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter input number from a user");
// n = sc.nextInt();
// }
// System.out.println("The first n odd natural number are " + n);
// for (i = 1; i < n; i++) {
// if (i % 2 != 0) {
// System.out.println(i);
// sum += i;
// }
// }
// System.out.println("The sum of natural odd number upto " + n + " terms " +
// sum);

/*
 * display the pattern like right angle triangle with number increased by 1 in
 * java
 */
// int n=5, number =1;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++) {
// System.out.print(number +" ");
// number++;
// }
// System.out.println();
// }

/* Pyramid with smae number print per line */
// int n = 4;
// for (int i = 1; i <= n; i++) {
//   for (int j = 1; j < (n - i); j++) {
//     System.out.print(" ");
//   }
//   for (int j = 1; j <= i; j++) {
//     System.out.print(i+" ");
//   }
//   System.out.println();
// }

/*Floud,s trianle */
// int n=5;

// //inner loop
// for(int i=1; i<=n; i++) {

//   //outer loop
//   for(int j=1; j<=i; j++) {
//     int sum =i+j;
//     if(sum%2 == 0) {
//       System.out.print("1");
//     } else
//     System.out.print("0");
//   }
//   System.out.println();
// }

/*paattern like a diamond */
// int n = 5;
//  // inner loop
//  for(int i=1; i<=n; i++) {

//   //ouer loop
//   for(int j=1; j<=n-i; j++) {
//     //spaces
//     System.out.print(" ");
//   }
//   for(int j=1; j<=2*i-1; j++) {
//      System.out.print("*");
//   }
//   System.out.println();
//  }

//  for(int i=n; i>=1; i--) {

//   //ouer loop
//   for(int j=1; j<=n-i; j++) {
//     //spaces
//     System.out.print(" ");
//   }
//   for(int j=1; j<=2*i-1; j++) {
//      System.out.print("*");
//   }
//   System.out.println();
//  }

/*pascal triangle */

//   public static int factorial(int i) {
//     if(i == 0) 
//       return 1;

//     return i*factorial(i-1);
//  }

//     int n=5;
//   Excercises g = new Excercises();
//     // inner loop
//     for (int i = 0; i <= n; i++) {
//       // outer loop
//       for (int j = 0; j <= n - i; j++) {
//         // spaces
//         System.out.print(" ");
//       }
//       for (int j = 0; j <= i; j++) {

//         // pascal formula

//         System.out.print(" " + g.factorial(i) / g.factorial(i - j) * g.factorial(j));

//       }
//       System.out.println();

//     }

/*number rhombus structure */
public class Excercises {
  // public static void main(String args[]) {

    // int n = 7;

    // // inner loop
    // for (int i = 0; i <= n; i++) {
    // // outer loop
    // for (int j = 0; j <= n - i; j++) {
    // // spaces
    // System.out.print(" ");
    // }

    // //1st Half
    // for(int j=i; j>=1; j--) {
    // System.out.print(j );
    // }
    // //Ind Half
    // for(int j=2; j<=i; j++) {
    // System.out.print(j );
    // }
    // System.out.println();
    // }

    // //down print

    // // inner loop
    // for (int i = n; i >= 0; i--) {
    // // outer loop
    // for (int j = 0; j <= n - i; j++) {
    // // spaces
    // System.out.print(" ");
    // }

    // //1st Half
    // for(int j=i; j>=1; j--) {
    // System.out.print(j );
    // }
    // //Ind Half
    // for(int j=2; j<=i; j++) {
    // System.out.print(j );
    // }
    // System.out.println();
    // }

    /* print character rhombus structure */

    // int n = 7;
    // int count = 1;
    // int count2= 1;
    // char ch = 'A';

    // for(int i=1; i<(n*2); i++) {
    // for(int j = n-count2; j>0; j--) {
    // //space
    // System.out.print(" ");
    // }
    // if(i < n) {
    // count2++;
    // }else{
    // count2--;
    // }
    // for(int j = 0; j<count; j++) {
    // //print character
    // System.out.print(ch);
    // if(j < count/2) {
    // ch++;
    // }else
    // ch--;
    // }
    // if(i < n) {
    // count += 2;
    // }else
    // count -= 2;

    // ch = 'A';
    // System.out.println();
    // }

    /* check whether it is negative, zero, or positive */

    // Scanner In = new Scanner(System.in);
    // System.out.println("Input number");
    // int n = In.nextInt();

    // if (n > 0) {
    // if (n < 1)
    // System.out.println("positive large small value");
    // else if (n > 1000000) {
    // System.out.println("positive value is large exceeds");
    // } else {
    // System.out.println("number is positive");
    // }
    // } else if (n < 0) {
    // if (Math.abs(n) > 1) {
    // System.err.println("value is small large negative");
    // }

    // else if (Math.abs(n) < 1000000) {
    // System.out.println("number is large negative");
    // } else
    // System.out.println("number is negative");
    // } else
    // System.out.println("number is zero");

    /* count the digits the number */

    // Scanner In =new Scanner(System.in);
    // System.out.println("Input number is less than ten billion");

    // if(In.hasNextLong()) {
    // Long n = In.nextLong();
    // if(n < 0) {
    // n *= -1;
    // }
    // if(n >= 1000000000) {
    // System.out.println("number is greater or equals 10,000,000,000");
    // }
    // else{
    // int digits = 1;
    // if(n >= 10 && n < 100) {
    // digits = 2;
    // }

    // if(n >= 100 && n < 1000) {
    // digits = 3;
    // }

    // if(n >= 1000 && n < 10000) {
    // digits = 4;
    // }

    // if(n >= 10000 && n < 100000) {
    // digits = 5;
    // }

    // if(n >= 100000 && n < 1000000) {
    // digits = 6;
    // }

    // if(n >= 1000000 && n < 100000000) {
    // digits = 7;
    // }

    // if(n >= 10000000 && n < 100000000) {
    // digits = 8;
    // }

    // System.out.println("number of digits in number " +digits);

    // }
    // }
    // else
    // System.out.println("The number is not integer");

    /* All number are equals */

    // Scanner In = new Scanner(System.in);
    // System.out.println("print Input number");
    // int A = In.nextInt();
    // int B = In.nextInt();
    // int C = In.nextInt();

    // if(A == B && B == C && C == A) {
    // System.out.println("NUMBER ARE EQUALS ");
    // }

    // else if((A != B && B != C && C != A)) {
    // System.out.println("NUMBER ARE NOT EQUALS ");
    // }
    // else
    // System.out.println("Number are neither eqauls or diff");

    /* increasing and decreasing order and otherwise */

    // Scanner In = new Scanner(System.in);
    // System.out.println("print Input number");
    // int A = In.nextInt();
    // int B = In.nextInt();
    // int C = In.nextInt();

    // if(A > B && B < C) {
    // System.out.println(" In Increasing order");
    // }
    // else if(A < B && B > C) {
    // System.out.println("In Decreasing order");
    // }
    // else
    // System.out.println("Neither Increasing or decreasing order");

    /* */

//     Scanner In = new Scanner(System.in);
//     System.out.println("Input number First");
//     double num1 = In.nextDouble();
//     System.out.println("Input number Second");
//     double num2 = In.nextDouble();
// In.close();

//     if (Math.abs(num1 - num2) <= 0.01) {
//       System.out.println("number both are same");
//     } else
//       System.out.println("number both are different");


/* take of an array 10 elements .split it into middle 
and store the elements in two diff arrays in java program*/


    // this method accepts a array and prints the value
    static void pprint(int arr[])
    {
        for (int var : arr) {
            System.out.print(var + " ");
        }
 
        System.out.println();
    }
 
    public static void main(String args[])
    {
        // original array
        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
 
        // size of array
        int n = a.length;
 
        // accepting the value of position from the user
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter position to split.");
 
        int pos = scanner.nextInt();
 
        // validating the position for invalid values.
        if (pos > 0 && pos < n) {
            // method  1 : using two for loops
 
            // declaring array B and C
            int b[] = new int[pos];
            int c[] = new int[n - pos];
 
            // initializing array B
            for (int i = 0; i < pos; i++) {
                b[i] = a[i];
            }
 
            // initializing array C
            for (int i = 0; i < n - pos; i++) {
                c[i] = a[i + pos];
            }
 
            // printing the array b and c
 
            pprint(b);
            pprint(c);
        }
 
        else {
            System.out.println("Invalid position.");
        }
 
  }
}
