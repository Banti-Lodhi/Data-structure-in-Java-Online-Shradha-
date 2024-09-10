import java.util.Scanner;
public class transposematrix {
    public static void main(Stringnames[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int matrix[][] = new int[n][m];

      for(int i=0; i<n; i++){
        for( int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
        }
        // System.out.print(matrix[i][j]+" ");
      }
      System.out.println("The print transpose is:");
     //To print the transpose
     for(int j=0; j<m; j++){
        for(int i=0; i<n; i++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
     }
    }
}
