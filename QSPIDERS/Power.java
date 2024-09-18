public class Power {
  public static void main(String[] args) {
    int x = 5;
    int n = 3;
    int power = 1;
    for (int i = 1; i <= n; i++) {
      power = power * x;

    }
    System.out.println(power);
    // System.out.println(power(5, 2));
  }

  // public static int power(int x, int y) {
  // int ans = 1;
  // if (y == 0) {
  // return 1;
  // } else {

  // ans = ans * power(x, y - 1);
  // }
  // return ans;
  // }

}
