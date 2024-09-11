import java.util.*;

class DoWhile {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true;

    // Using Do-While Loop

    do {
      System.out.println("Select the input");
      System.out.println("1.Java\n2.SQL\n3.Exit");
      int input = sc.nextInt();
      switch (input) {
        case 1:
          System.out.println("Java");
          break;

        case 2:
          System.out.println("SQL");
          break;

        case 3:
          flag = false;
          System.out.println("Exit!");
          break;
        default:
          System.out.println("Invalid");
      }

    } while (flag);
    sc.close();

    // Same Code using While Loop!

    // while (flag) {
    // System.out.println("Select the input");
    // System.out.println("1.Java\n2.SQL\n3.Exit");
    // int input = sc.nextInt();
    // switch (input) {
    // case 1:
    // System.out.println("Java");
    // break;

    // case 2:
    // System.out.println("SQL");
    // break;

    // case 3:
    // flag = false;
    // System.out.println("Exit!");
    // break;
    // default:
    // System.out.println("Invalid");
    // }
    // }

  }

}
