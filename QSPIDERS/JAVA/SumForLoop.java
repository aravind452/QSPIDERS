import java.util.Scanner;

public class SumForLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int input = sc.nextInt();
    for (int i = 1; i <= input; i++) {
    sum = sum + i;

    }
    sum = ((input) * (input + 1)) / 2;
    System.out.println("Sum " + sum);
    sc.close();
  }

}
