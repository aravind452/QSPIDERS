//import java.util.Arrays;

public class SubArraySumQ {

  public static void main(String[] args) {
    int[] arr = { -1, 5, 6, -7 };
    System.out.println(maxSum(arr));
    // String s = "abc";
    // int max = Math.log10(s);

  }

  static int maxSum(int[] arr) {

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      int sum = 0;

      for (int j = i; j < arr.length; j++) {

        sum += arr[j];
        if (sum > max) {
          max = sum;
        }

      }

    }
    System.out.println(max);
    return max;

  }

  // Kadane Algorithm
  static int maxSub(int[] arr) {
    int max = arr[0];
    int currentMax = arr[0];
    for (int i = 1; i < arr.length; i++) {
      currentMax = Math.max(arr[i], currentMax + arr[i]);
      max = Math.max(max, currentMax);
    }
    return max;
  }

  // Prefix Sum Approach
  static int maxSumPrefix(int[] arr) {

    int[] prefixArray = new int[arr.length];
    int max = Integer.MIN_VALUE;

    for (int j = 1; j < arr.length; j++) {
      prefixArray[j] = arr[j - 1] + arr[j];
    }

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {

        int cs = (i == 0) ? prefixArray[j] : prefixArray[j] - prefixArray[i - 1];
        if (cs > max) {
          max = cs;
        }

      }
    }
    // System.out.println(Arrays.toString(prefixArray));
    return max;

  }

}
