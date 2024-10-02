import java.util.*;

class ForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    for (int i = input; i > 0; i--) {
      System.out.print(i + " ");
    }

    // int i = 1;
    // for (; i <= input; i++) {
    // System.out.print(i + " ");
    // }

    sc.close();
  }

}