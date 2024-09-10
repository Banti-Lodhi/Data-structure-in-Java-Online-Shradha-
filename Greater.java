import java.util.Scanner;

public class Greater{
    public static int greaterPrint(int a,int b) {
        if(a > b){
            return a;
        }
        return b;
    }
    public static void main(Stringnames[] args) {
        Scanner sc = new Scanner(System.in);
       
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(greaterPrint(a, b));
    }
} 