// package Java function.java;

public class pattern {
    public static void main(Stringnames args[]){
        int n = 5;
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= n-i;j++){
                System.out.print(" ");
            }
        //star
        for(int j = 1; j <= i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
        }
    }
}
