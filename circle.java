import java.util.Scanner;

public class circle {
    public static double getcircumference(Double radius) {
        return 2*3.14*radius;
    }
    public static void main(Stringnames[] args) {
      Scanner sc = new Scanner(System.in);
      Double radius = sc.nextDouble();
      System.out.println(getcircumference(radius));        
    }
}


