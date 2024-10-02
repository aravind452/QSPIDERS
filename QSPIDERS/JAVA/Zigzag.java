import java.util.Arrays;

public class Zigzag {
  public static void main(String[] args) {
    int[] arr1 = { 10, 20, 30, 40, 123 };

    int[] arr2 = { 50, 60, 70, 80 };
    int[] res = merge(arr1, arr2);
    System.out.println(Arrays.toString(res));
  }

  static int[] merge(int[] arr1, int[] arr2) {
    int[] finalArr = new int[arr1.length + arr2.length];
    int i = 0;
    int j = arr2.length - 1;
    int m = 0;

    while (i < arr1.length || j >= 0) {
      if (m % 2 == 0) {
        finalArr[m++] = arr1[i];
        i++;

      } else {
        finalArr[m++] = arr2[j];
        j--;
      }
    }
    return finalArr;

  }
}
