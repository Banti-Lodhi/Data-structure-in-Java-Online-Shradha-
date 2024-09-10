import java.util.Scanner;

// import java.util.Scanner;

// public class power {
//     public static void main(String[] args){
//         System.out.println("Enter x:");

//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         System.out.println("Enetr n :");
//         int n = sc.nextInt();
        
//         int result = 1;
//         for(int i = 0; i < n; i++){
//             result = result * x;
//             System.out.println("X to power n is:"+result);
//         }
//     }
    
// }

public class power {
    public static void main(Stringnames[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }
            n2 = n2 - n1;
        }
        System.out.println("GCD is:"+ n2);
        // System.out.println(n2);
    }
}