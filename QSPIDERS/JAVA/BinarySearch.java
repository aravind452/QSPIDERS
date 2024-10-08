public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 5, 6 };
    int k = 7;
    int low = 0;
    int high = arr.length;
    int res = recursion(arr, k, low, high);
    System.out.println(res);
    // System.out.println(binarySearch(arr, k));

  }

  static int binarySearch(int[] arr, int k) {

    int low = 0;
    int high = arr.length;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == k) {
        return mid;
      } else if (k > arr[mid]) {
        low = mid + 1;

      } else {
        high = mid - 1;

      }
    }
    return -1;

  }

  static int recursion(int[] arr, int k, int low, int high) {
    int mid = (low + high) / 2;

    if (low > high) {
      return -1;
    }
    if (arr[mid] == k) {
      return mid;
    } else if (k > arr[mid]) {
      low = mid + 1;
      return recursion(arr, k, low, high);
    } else {
      high = mid - 1;
      return recursion(arr, k, low, high);
    }

  }

}
