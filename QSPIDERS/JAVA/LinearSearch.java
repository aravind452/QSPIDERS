public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10, 11 };
    System.out.println(linearSearch(arr, 7));

  }

  static int linearSearch(int[] arr, int k) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == k) {
        return i;
      }

    }
    return -1;

  }

}
