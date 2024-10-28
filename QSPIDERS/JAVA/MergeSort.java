import java.util.*;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 8, 2, 4, 1, 0 };
    int left = 0;
    int right = arr.length;
    divide(arr, left, right);

  }

  static void divide(int[] arr, int left, int right) {
    if (left == right)
      return;

    int mid = (left + right) / 2;
    divide(arr, left, mid);
    divide(arr, mid + 1, right);
    merge(arr, left, right, mid);

  }

  static void merge(int[] arr, int left, int right, int mid) {

    int[] leftArray = new int[mid];
    int[] rightArray = new int[arr.length - mid];
    int[] res = new int[right];

    for (int i = 0; i < leftArray.length; i++) {
      leftArray[i] = arr[i];
    }

    for (int i = mid; i < rightArray.length; i++) {
      rightArray[i] = arr[i];
    }

    int i = 0, j = 0, k = 0;
    while (i < leftArray.length || j < rightArray.length) {

      if (leftArray[i] < rightArray[j]) {
        res[k++] = leftArray[i];
      } else {
        res[k++] = rightArray[j];
      }
      i++;
      j++;

    }

    while (i < leftArray.length) {
      res[k++] = leftArray[i++];
    }
    while (j < rightArray.length) {
      res[k++] = rightArray[j++];
    }

    System.out.println(Arrays.toString(leftArray));
    System.out.println(Arrays.toString(rightArray));

  }

}
