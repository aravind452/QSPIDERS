import java.util.Arrays;

class PassByValue {
  public static void main(String[] args) {

    int[] originalArray = { 6, 7, 8 };
    System.out.println("Before Change Address " + originalArray);
    System.out.println("Before Change Elements " + Arrays.toString(originalArray));
    int[] res = changeArray(originalArray);
    System.err.println("After Change Address" + res);
    System.out.println(Arrays.toString(res));

  }

  static int[] changeArray(int[] arr) {
    System.out.println("Address" + arr);
    // System.out.println(arr.length);
    int[] newArray = { 1, 28, 3 };
    arr = newArray;
    System.out.println("Ressigned Address" + arr);
    return arr;
  }
}