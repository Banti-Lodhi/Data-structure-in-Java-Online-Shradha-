import java.util.Scanner;
public class indices {
    public static void main(Stringnames[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
         int matrix[][] = new int[n][m];
        //input loop
        for(int i=0; i<n; i++){
          for( int j=0; j<m; j++){
              matrix[i][j] = sc.nextInt();
          }
          // System.out.print(matrix[i][j]+" ");
        }
        int x = sc.nextInt();
        // System.out.println("The print transpose is:");
       //To print the transpose
       
          for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            if(matrix[i][j] == x){ 
                 System.out.print("X found at location ("+ i+","+j+")");
                }
             
          }
          System.out.println();
       }
      }
}
