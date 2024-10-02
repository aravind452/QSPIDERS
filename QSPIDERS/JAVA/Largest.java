import java.util.Scanner;

public class Largest {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int sub1, sub2, sub3, sub4, sub5;
    System.out.println("Enter the sub1 mark");
    sub1 = sc.nextInt();
    System.out.println("Enter the sub2 mark");
    sub2 = sc.nextInt();
    System.out.println("Enter the sub3 mark");
    sub3 = sc.nextInt();
    System.out.println("Enter the sub4 mark");
    sub4 = sc.nextInt();
    System.out.println("Enter the sub5 mark");
    sub5 = sc.nextInt();

    int per = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
    System.out.println("Percentage " + per);

    String res = (per >= 90 && per <= 100) ? "A"
        : (per >= 80 && per <= 89) ? "B"
            : (per >= 70 && per <= 79) ? "C"
                : (per >= 60 && per <= 69) ? "D" : (per > 100 || per < 0) ? "Invalid" : "F";

    System.out.println(res);

  }

}
