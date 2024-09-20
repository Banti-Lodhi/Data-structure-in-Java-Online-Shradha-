public class swapElement {
  public static void main(String[] args) {

    // 1.
    // int x = 10;
    // int y = 20;
    // int temp = x;
    // x = y;
    // y = temp;
    // System.out.println(x);
    // System.out.println(y);

    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j < 5; j++) {
    // System.out.println(j);
    // }
    // }

    // 2.

    // int[] x = { 32, 12, 36, 1, 27 };
    // int temp;
    // for (int j = 0; j < x.length - 1; j++) {
    // for (int i = 0; i < x.length - 1; i++) {
    // if (x[i] > x[i + 1]) {
    // temp = x[i];
    // x[i] = x[i + 1];
    // x[i + 1] = temp;

    // }
    // }
    // }
    // for (int arr : x) {
    // System.out.print(arr + " ");
    // }
    // System.out.println("\nMaximum value = " + x[x.length - 1]);
    // System.out.println("Minimum value = " + x[0]);

    // 3.
    String arr[] = { "(", "(", "(", ")", ")", ")" };
    int O = 0;
    int C = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("(")) {
        O++;
      } else if (arr[i].equals(")")) {
        C++;
      } else {
        System.out.println("Array Error Occurad");
      }
    }
    if (O == C) {
      System.out.println("Equals " + O + " == " + C);
    } else {
      System.out.println("Not Equals " + O + " != " + C);
    }
  }
}
