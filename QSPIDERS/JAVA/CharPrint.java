import java.util.*;

public class CharPrint {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character (only Uppercase)");
    char ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <= 'Z') {
      char temp = (char) ('a' + ('A' + 'Z' - ch) - 'A');
      System.out.println(temp);
    }
    sc.close();

  }

}
