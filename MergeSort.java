public class MergeSort {
  public static void conquer(int arr[], int si, int mid, int ei) {
    int merged[] = new int[ei - si + 1];
    int idx1 = si;
    int idx2 = mid + 1;
    int x = 0;
    while (idx1 <= mid && idx <= ei) {
      if (arr[idx1] <= arr[idx2]) {
        arr[x++] = arr[idx1++];
      } else {
        arr[x++] = arr[idx2++];
      }
    }
    while (idx1 <= mid) {
      arr[x++] = arr[idx1++];
    }
    while (idx2 <= ei) {
      arr[x++] = arr[idx2++];
    }
    for (int i = 0, j = si; i < merged.length; i++, j++) {
      arr[j] = merged[i];
    }
  }

  public static void divide(int arr[], int si, int ei) {
    if (si >= ei) {
      return;
    }
    int mid = si - (ei - si) / 2;
    divide(arr, si, mid);
    divide(arr, mid + 1, ei);
    conquer(arr, si, mid, ei);
  }

  public static void main(String[] args) {
    int arr[] = { 8, 3, 4, 6, 5, 3 };
    int n = arr.length;
    divide(arr, 0, n - 1);

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}