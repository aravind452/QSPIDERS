class SpyNumber {
  public static void main(String[] args) {
    int number = 132;
    int sum = 0;
    int prod = 1;
    while (number > 0) {
      int rem = number % 10;
      sum = sum + rem;
      prod = prod * rem;
      number /= 10;
    }
    String res = (sum == prod) ? "SPY" : "NOT SPY";
    System.out.println(res);
  }
}