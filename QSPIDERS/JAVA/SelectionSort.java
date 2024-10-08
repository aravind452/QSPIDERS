import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = { 1, -1, 0, 3, 4, -9999 };
    int[] res = selectionSort(arr);
    System.out.println(Arrays.toString(res));

  }

  static int[] selectionSort(int[] arr) {

    for (int i = 0; i < arr.length - 1; i++) {
      int min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[min]) {
          min = j;

        }
      }
      int temp = arr[min];
      arr[min] = arr[i];
      arr[i] = temp;

    }
    return arr;

  }

}
