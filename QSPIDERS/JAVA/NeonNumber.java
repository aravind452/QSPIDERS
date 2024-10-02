public class NeonNumber {
  public static void main(String[] args) {
    int number = 91;
    int square = number * number;
    int rem = 0, sum = 0;
    while (square > 0) {
      // System.out.println('i');
      rem = square % 10;
      sum = sum + rem;
      square /= 10;

    }
    if (sum == number) {
      System.out.println("Neon");
    } else {
      System.out.println("Not Neon");
    }
  }

}
