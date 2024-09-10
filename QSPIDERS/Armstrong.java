public class Armstrong {

  public static void main(String[] args) {
    int number = 370;
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
      result += Math.pow(tempVariable, n);
      neworiginal /= 10;

    }
    // System.out.println(result);
    if (result == number) {
      System.out.println("Armstrong!");

    } else {
      System.out.println("Not A Armstrong!");
    }
  }

}
