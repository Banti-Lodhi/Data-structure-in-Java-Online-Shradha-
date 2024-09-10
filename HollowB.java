// // import java.ub til.*;
// public class HollowB {
//     public static void main(String[] args){
   
//         int n = 4;

//         for(int i = 1;i <= n;i++){
//             for(int j = 1; j <= i;j++){
                
//                 System.out.print("*");
//             }

//             int spaces = 2*(n-i);
//             for(int j = 1;j <= spaces;j++){
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }

//             System.out.println();
//         }

//         for(int i = n;i >= 1;i--){
//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }

            
//             int spaces = 2*(n-i);
//             for(int j = 1;j <= spaces;j++) {
//                 System.out.print(" ");
//             }

//             for(int j = 1; j <= i;j++){
//                 System.out.print("*");
//             }
            
//             System.out.println();
//         }
//     }
// }




public class HollowB {
    public static void main(Stringnames[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print("*");
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++){
                System.out.print(" ");
            }
            if(i>1)
                System.out.print("*");
            System.out.println(" ");
        }
    }        
}    