import java.util.*;

public class ArrayRotation {

  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50 };
    int n = 3;
    int[] res = arrayRotation(arr, n);
    System.out.println(Arrays.toString(res));
  }

  static int[] arrayRotation(int[] arr, int n) {

    int[] res = new int[arr.length];

    int i = 0;
    int j = 0;

    for (j = n; j < arr.length; j++) {
      res[i] = arr[j];
      i++;

    }

    for (int k = 0; k < n; k++) {
      res[i] = arr[k];
      i++;

    }

    // Single loop method

    // for (int i = 0; i < arr.length; i++) {

    // int newIndex = (i + arr.length - n) % arr.length;
    // res[newIndex] = arr[i];
    // }

    return res;

  }

}
