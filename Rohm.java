public class Rohm {
    public static void main(Stringnames[] args) {

        int n = 5;

        for(int i = 1;i <= n; i++){
          
          //print outer space
          for(int j = 1; j <= n - i; j++)
          {
            System.out.print(" ");
          }
           for(int k = 1; k <= n;k++){

    
                //print star
                if(i == 1 || k == 1 || i == n || k == n){

                    System.out.print("* ");
                }

                //print inner space
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
