import java.util.*;

public class ReverseNumber {

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    ReverseNumber reverseNumber = new ReverseNumber();
    int r = reverseNumber.sc.nextInt();
    System.out.println(r);
    // int original = 151;
    // int neworiginal = original;
    // int reverse = 0;

    // while (neworiginal != 0) {
    // int temp = neworiginal % 10;
    // reverse = (reverse * 10) + temp;
    // neworiginal /= 10;
    // }

    // if (original == reverse) {
    // System.out.println("Palindrome");
    // } else {
    // System.out.println("Not palindrome");
    // }

    // Using String

    int original = 151;
    String rev = String.valueOf(original);
    StringBuilder org = new StringBuilder(rev);
    StringBuilder sb = new StringBuilder(rev);
    System.out.println(org);
    sb = sb.reverse();
    System.out.println(sb);
    if (sb.toString().equals(org.toString())) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }

  }
}

/*
 * select sal
 * from emp
 * limit 1 offset 3 order by sal asc;
 */