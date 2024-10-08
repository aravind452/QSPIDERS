import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4 };
    int res[] = bubbleSort(arr);
    System.out.println(Arrays.toString(res));

  }

  static int[] bubbleSort(int[] arr) {
    int n = arr.length;
    boolean swap = false;
    for (int i = 0; i < arr.length - 1; i++) {
      swap = false;
      System.out.println(i + " ");
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(j + " ");
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swap = true;
        }

      }
      System.out.println();
      if (!swap)
        break;
    }
    return arr;
  }

}
