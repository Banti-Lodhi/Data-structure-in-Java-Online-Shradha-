import java.util.Scanner;

public class BitOperation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper 1:SET,Oper 0:Clear 
    
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1 << pos;
        if(oper == 1){
            // SET
        int newBitMast = bitMask | n;
        System.out.println(newBitMast); 
        }else{
            //CLEAR
            int newBitMast = ~(bitMask);
            int newNumber = newBitMast & n;
            System.out.println(newNumber);
        }
       
//         int newBitMast = ~(bitMask);
         
//         int newNumber = newBitMast & n;
//     //     if(newNumber == 0){
//     //          System.out.println("bit was zero");
//     //     }else{
//     //    System.out.println("bit was not zero");
//     // }
//     System.out.println(newNumber);
  }
}