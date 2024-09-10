// // // public class Array{
// // //     public static void main(String[] args){
// // //         int marks[] = new int [3];
// // //         marks[0] = 99; //math marks
// // //         marks[1] = 93; //chemistry
// // //         marks[2] = 98;//physics
// // //         for(int i = 0;i < 3;i++){
// // //             System.out.println(marks[i]);
// // //         }
// // //     }
// // // }
// // import java.util.Scanner;

// // public class Array{
// //     public static void main(String[] args) {
        
// //         Scanner sc = new Scanner(System.in);
// //         int size = sc.nextInt();
// //         int numbers[] = new int[size];
// //            for(int i = 0;i < size;i++){
// //             numbers[i] = sc.nextInt();
// //            }
// //            for(int i = 0; i < size;i++){
// //             // System.out.println(numbers[i]+" ");
// //            }
// //     }
// // }


import java.util.Scanner;

public class Array{
    public static void main(Stringnames[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
// //         String names[] = new String[size];
// //         for(int i = 0; i < size;i++){
// //             names[i] = sc.next();
// //         }
// //         //output names
// //         for(int i = 0; i < size;i++){
// //         System.out.println("names"+(i+1)+"are:"+names[i]);
// //    }
   
//   int numbers[] = new int[size];
//   for(int i = 0; i < size;i++){
//     numbers[i] = sc.nextInt();
//   }
//   int min = Integer.MIN_VALUE;
//   int max = Integer.MAX_VALUE;
//   for(int i = 0;i < size;i++){
//     if(numbers[i] < min){
//         min = numbers[i];

//     }
//     if(numbers[i] > max){
//         max = numbers[i];
//     }
//   }
//  System.out.println("Largest nmuber is:" + max); 
  
//  System.out.println("Smallest number is:" + min);
  

int numbers[] = new int[size];
//input
for(int i = 0;i < size;i++){
    numbers[i] = sc.nextInt();
}
boolean isAscending = true;
for(int i = 0; i < size-1;i++){
 //Notice numbers size -1 as terminate condition.
 if(numbers[i] > numbers[i+1]){
    //This is the condition for descending order.
    isAscending = false;
 }
}
if(isAscending){
    System.out.println("The order is sorted order in asscending order");
}
System.out.println("The order is not sorted in asscendig order");
  }
}