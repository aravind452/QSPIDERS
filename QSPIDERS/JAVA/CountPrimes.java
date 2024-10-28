public class CountPrimes {

  public static void main(String[] args) {
    int[] arr = { 4, 5, 7, 1, 11, 3, 8 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      if (isPrime(arr[i])) {
        sum += arr[i];

      }
    }
    System.out.println(sum);

  }

  static boolean isPrime(int num) {

    if (num == 0 || num == 1 || num % 2 == 0) {
      return false;
    }

    for (int j = 2; j * j < num; j++) {
      if (num % j == 0) {
        return false;
      }
    }
    return true;
  }

}
