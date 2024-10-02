import java.util.Arrays;

public class MergeArray {

  public static void main(String[] args) {
    int[] arr1 = { 10, 20, 30, 40 };

    int[] arr2 = { 50, 60, 70, 80 };
    int[] finalArray = merge(arr1, arr2);
    int[] singleLoop = singleLoop(arr1, arr2);

    System.out.println(Arrays.toString(finalArray));
    System.out.println(Arrays.toString(singleLoop));
  }

  static int[] merge(int[] arr1, int[] arr2) {
    int[] finalArray = new int[arr1.length + arr2.length];
    int i = 0;
    int j = arr2.length - 1;

    while (i < arr1.length) {
      finalArray[i] = arr1[i];
      i++;
    }

    while (j >= 0) {
      finalArray[i] = arr2[j];
      i++;
      j--;
    }
    return finalArray;

  }

  static int[] singleLoop(int[] arr1, int[] arr2) {
    int[] finalArray = new int[arr1.length + arr2.length];
    int i = 0;
    int j = arr2.length - 1;

    while (i < arr1.length || j >= 0) {

      if (i > arr1.length - 1) {
        finalArray[i] = arr2[j];
        i++;
        j--;
      } else {
        finalArray[i] = arr1[i];
        i++;
      }
    }

    return finalArray;

  }

}
