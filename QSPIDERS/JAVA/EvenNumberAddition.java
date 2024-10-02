public class EvenNumberAddition {
  public static void main(String[] args) {
    int input = 1013;
    int sum = 0;
    while (input != 0) {
      int temp = input % 10;
      if (temp % 2 == 0 && temp != 0) {
        sum = sum + temp;

      }
      input /= 10;
    }
    if (sum == 0) {
      System.out.println("Invalid");
    } else {
      System.out.println(sum);
    }
  }

}
