import java.util.*;

public class Tables {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int tableValue = sc.nextInt();
    int sum = 1;
    for (int i = 1; i <= 10; i++) {
      sum = tableValue * i;
      Thread.sleep(1000);
      System.out.println(tableValue + " X " + "" + i + " = " + sum);
    }
    sc.close();
  }

}
