import java.util.*;

public class OneShift {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 1, 4, 5, 1, 1, 1, 1, 0, 0, 8, 33, 45, 2342342, 4355 };
    int[] res = shiftOnes(arr);
    System.out.println(Arrays.toString(res));

  }

  // first method

  static int[] shiftOnes(int[] arr) {
    int ones = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 1) {
        arr[ones] = arr[i];
        ones++;
      }
    }
    for (int j = ones; j < arr.length; j++) {
      arr[j] = 1;
    }

    return arr;
  }

  // sir method

  static int[] shiftOnes1(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      if (arr[left] == 1 && arr[right] != 1) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      } else if (arr[left] != 1) {
        left++;
      } else {
        right--;
      }
    }
    return arr;
  }

}
