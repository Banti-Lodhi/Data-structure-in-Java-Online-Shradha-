import java.util.Scanner;

public class count {
    public static void main(Stringnames[] args){
   
        int positive = 0,negative = 0,zeroes = 0;

        System.out.println("Press 1 to coninue and 0 to  stop");
        
        Scanner sc = new Scanner(System.in);
        
    int input  = sc.nextInt();
    while(input == 1){
        System.out.println("Enter your number:");
         
        int number = sc.nextInt();
        if(number > 0){
            positive++;
        }
        else if(number < 0){
            negative++;
        }
        else{
            zeroes++;
        }
        System.out.println("press 1 to continue & 0 to stop");
        input = sc.nextInt();
    }
    System.out.println("positives:"+positive);
    System.out.println("negatives:" + negative);
    System.out.println("zeroes:" + zeroes);
    }
}