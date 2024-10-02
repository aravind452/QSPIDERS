public class Armstrong {

  public static void main(String[] args) {
    int number = 153;
    int neworiginal = number;
    int temp = number;
    int n = 0;
    while (temp != 0) {
      temp /= 10;
      n++;

    }
    // System.out.println(n);
    int result = 0;
    while (neworiginal > 0) {
      int tempVariable = neworiginal % 10;
      // result += Math.pow(tempVariable, n);
      result += power(tempVariable, n);
      neworiginal /= 10;

    }
    // System.out.println(result);
    if (result == number) {
      System.out.println("Armstrong!");

    } else {
      System.out.println("Not A Armstrong!");
    }
  }

  static int power(int x, int y) {
    int ans = 1;
    if (y == 0) {
      return 1;
    } else {

      for (int i = 1; i <= y; i++) {
        ans = ans * x;
      }
    }
    return ans;
  }

}
