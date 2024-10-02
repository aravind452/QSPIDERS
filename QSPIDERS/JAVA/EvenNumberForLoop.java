import java.util.*;

public class EvenNumberForLoop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Start Value");
    int start = sc.nextInt();
    System.out.println("End Value");
    int end = sc.nextInt();
    int flagValue = 0;
    for (int i = end; i > start; i--) {
      if (i % 2 != 0) {
        flagValue = 1;
        System.out.println("odd " + i);
      }
    }

    if (flagValue == 0) {
      System.out.println("Invalid");
    }
    sc.close();

  }

}
