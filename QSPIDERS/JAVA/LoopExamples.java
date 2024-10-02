import java.util.*;

public class LoopExamples {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
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
      System.out.println("First and Last Digit sum " + answer);

      int middle = input / 10;
      int sumBetween = 0;
      while (middle >= 10) {
        int temp = middle % 10;
        sumBetween += temp;
        middle /= 10;
      }

      System.out.println("In Between Digits Sum " + sumBetween);

      if(answer == sumBetween){
        System.out.println("Xylem");
      }
      else {
        System.out.println("Phloem");
      }

      sc.close();
    }
  }
}
