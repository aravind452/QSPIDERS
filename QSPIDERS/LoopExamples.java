import java.util.*;

public class LoopExamples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    if (input >= 0 && input <= 9) {
      System.out.println("Invalid");
    } else {
      int lasttDigit = input % 10;

      int firstDigit = input;

      while (firstDigit >= 10) {
        firstDigit /= 10;
      }

      int answer = lasttDigit + firstDigit;
      System.out.println(answer);

      int middle = input / 10;
      int sumBetween = 0;
      while (middle >= 10) {
        int temp = middle % 10;
        sumBetween += temp;
        middle /= 10;
      }

      System.out.println(sumBetween);

      sc.close();
    }
  }
}
