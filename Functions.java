import java.util.*;
public class Functions {
    public static int printrecusion(int n){
        
        if(n == 0){
            // System.out.println("invalid number");
            return 0;
        }
        int prevSum = printrecusion(n - 1);
        return n + prevSum;
    }
    public static void main(Stringnames[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printrecusion(n);
    }
 }

    

