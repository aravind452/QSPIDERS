import java.util.*;

public class OnesAndZeros {

  public static void main(String[] args) {

    int[] arr = { 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1 };
    int[] res = separateZerosAndOnes(arr);
    System.out.println(Arrays.toString(res));

  }

  // First method

  static int[] separateZerosAndOnes(int[] arr) {

    int zeros = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0)
        zeros++;
    }

    for (int i = 0; i < arr.length; i++) {
      if (i < zeros) {
        arr[i] = 0;

      } else {
        arr[i] = 1;
      }
    }
    return arr;
  }

  // Second method
  static int[] separateZerosAndOnes1(int[] arr) {

    int zeros = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        arr[zeros] = 0;
        zeros++;
      }

    }
    for (int i = zeros; i < arr.length; i++) {
      arr[i] = 1;

    }
    return arr;
  }

  // Sir method
  static void separateZerosAndOnesMethod(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      if (arr[left] == 1 && arr[right] == 0) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
      if (arr[left] == 0) {
        left++;
      } else {
        right--;
      }
    }

  }
}
