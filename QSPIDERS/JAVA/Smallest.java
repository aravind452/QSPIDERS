import java.util.*;

public class Smallest {

  public static void main(String[] args) {
    int[] arr = { 11, 16, 4, 2, 6, 3 };
    System.out.println(smallest(arr));
  }

  // method one
  static int smallest(int[] arr) {

    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;

  }

  // method two
  static int smallest2(int[] arr) {
    Arrays.sort(arr);
    return arr[0];
  }

  // static int second(int[] arr) {
  // int large = 0;
  // int secondLarge = 0;
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] > large) {
  // secondLarge = large;
  // large = arr[i];

  // } else if (arr[i] > secondLarge) {
  // secondLarge = arr[i];
  // }
  // }
  // return secondLarge;
  // }

  // static int secondSmall(int[] arr) {
  // int small = 9999;
  // int secondSmall = 9999;
  // for (int i = 0; i < arr.length; i++) {
  // if (arr[i] < small) {
  // secondSmall = small;
  // small = arr[i];

  // } else if (arr[i] < secondSmall) {
  // secondSmall = arr[i];
  // }
  // }
  // return secondSmall;
  // }

}
