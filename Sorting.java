// public class Sorting {
//     public static void PrintArray(int arr[]) {
//         for(int i=0; i<arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = {7,4,6,2,1,9};
//         //bubblesort        
//         for(int i=0; i<arr.length-1; i++){
//             for(int j = 0; j<arr.length-i-1; j++){
//                 if(arr[j] > arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//         PrintArray(arr);
//     }
// }


/* 
public class Sorting {
    public static void printArray(int arr[]) {
        
        for(int i=0; i<arr.length; i++) {

            System.out.print(arr[i] +" ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 8, 9, 12, 5, 34, 45, 18, 1 };
        // selection sort
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {

                    smallest = j;
                }
            }
            // swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
}
 */
public class Sorting {
    public static void printArray(int arr[]) {

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        int arr[] = {4,1,8,5,64,12,18,0};
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > current) {
                //keep swapping
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}