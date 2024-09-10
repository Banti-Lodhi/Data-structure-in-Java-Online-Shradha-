import java.util.Scanner;

public class Fibonacci {
    public static void main(Stringnames[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1;
        System.out.println(a + " ");
        if(n > 1){
            //find the nth term
            for(int i = 2; i <= n; i++){
                System.out.println(b + " ");
                //The concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
        
    }
    
}
