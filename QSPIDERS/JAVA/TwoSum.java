import java.util.*;

public class TwoSum {

  public static void main(String[] args) {
    int[] arr = { 8, 1, 2, 9, 6, 5, 16, 4 };
    Arrays.sort(arr);
    setTwoSum(arr, 16);

  }

  static void twoSum(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      if (arr[left] + arr[right] == target) {
        System.out.println(arr[left] + " " + arr[right]);
        left++;
        right--;
      } else if ((arr[left] + arr[right]) > target) {
        right--;
      } else {
        left++;
      }
    }

  }

  // Using HashSet

  static void setTwoSum(int[] arr, int target) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      int comp = target - arr[i];
      if (set.contains(comp)) {
        System.out.println(comp + " " + arr[i]);
      } else {
        set.add(arr[i]);
      }
    }
  }

}
