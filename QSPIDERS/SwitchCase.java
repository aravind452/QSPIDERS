import java.util.*;

public class SwitchCase {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("1.Java\n2.Testing\n");

    System.out.println("Enter the value for N");
    int n = sc.nextInt();

    switch (n) {
      case 1:

        System.out.println("1.Shambu\n2.Tabrez\n3.Nandhini\n4.Surya");
        System.out.println("Select the java faculty!");
        int f = sc.nextInt();
        switch (f) {
          case 1:
            System.out.println("Java-Shambu");
            break;
          case 2:
            System.out.println("Java-Tabrez");
            break;
          case 3:
            System.out.println("Java-Nandhini");
            break;
          case 4:
            System.out.println("Java-Surya");
        }
        break;
      case 2:
        System.out.println("1.Harsha\n2.Keerthana\n3.Nandhini\n4.Nagraj\n");
        System.out.println("Select the testing faculty!");
        int d = sc.nextInt();
        switch (d) {
          case 1:
            System.out.println("Testing-Harsha");
            break;
          case 2:
            System.out.println("Testing-Keerthana");
            break;
          case 3:
            System.out.println("Testing-Nandhini");
            break;
          case 4:
            System.out.println("Testing-Nagraj");
        }
        break;
      default:
        System.out.println("Invalid");

    }

  }

}
