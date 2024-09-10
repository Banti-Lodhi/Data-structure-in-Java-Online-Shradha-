public class palind{
    public static void main(Stringnames args[]){
    int n = 5;
    for(int i = 1; i <= n; i++){ 

        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }

        //ist half
        for(int j = i; j >= 1; j--){
            System.out.print(j);
        }

        //iind half
        for(int j = 2;j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
  }
}