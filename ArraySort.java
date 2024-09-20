import java.util.Scanner;

public class ArraySort {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr1 = new int[n];
    for (int i = 0; i < arr1.length; i++) {
      arr1[i] = scan.nextInt();
    }
    scan.close();
    for (int x : arr1) {
      System.out.println(x + " ");
    }
    ArraySort a = new ArraySort();

    int[] newArray = a.getArraySort(arr1);
    System.out.println("\n");
    for (int y : newArray) {
      System.out.print(y + " ");
    }
  }

  public int[] getArraySort(int arr1[]) {
    int temp;
    for (int i = 0; i < arr1.length - 1; i++) {
      for (int j = 0; j < arr1.length - 1; j++) {
        if (arr1[j] > arr1[j + 1]) {
          temp = arr1[j];
          arr1[j] = arr1[j + 1];
          arr1[j + 1] = temp;
        }
      }
    }
    return arr1;
  }
}