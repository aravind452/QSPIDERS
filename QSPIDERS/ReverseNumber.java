public class ReverseNumber {

  public static void main(String[] args) {
    int original = 151;
    int neworiginal = original;
    int reverse = 0;

    while (neworiginal != 0) {
      int temp = neworiginal % 10;
      reverse = (reverse * 10) + temp;
      neworiginal /= 10;
    }

    // System.out.println("Original Number " + original);
    // System.out.println("Reversed Number " + reverse);

    if (original == reverse) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not palindrome");
    }

    // Using String

    // int original = 1234;
    // String rev = String.valueOf(original);
    // StringBuilder org = new StringBuilder(rev);
    // StringBuilder sb = new StringBuilder(rev);
    // sb = sb.reverse();
    // if (sb.equals(org)) {
    // System.out.println("Palindrome");
    // } else {
    // System.out.println("Not a palindrome");
    // }

  }
}
