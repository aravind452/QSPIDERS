public class Fibonacci {

  public static void main(String[] args) {
    // int n = 93;
    // double phi = (1 + Math.sqrt(5)) / 2;
    // System.out.println(phi);
    // double fib = (Math.pow(phi, n) - Math.pow(1 - phi, n)) / Math.sqrt(5);
    // // System.out.println(Math.pow(phi, n));
    // // System.out.println(Math.pow(1 - phi, n));
    // System.out.println(Math.round(fib));
    fibonacci(8);

  }

  static void fibonacci(int series) {
    int a = 0, b = 1, sum = 0;
    for (int i = 1; i <= series; i++) {
      System.out.println(sum);
      sum = a + b;
      a = b;
      b = sum;
    }
  }
}
