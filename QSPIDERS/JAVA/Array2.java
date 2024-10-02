import java.util.*;

public class Array2 {

  // Write a java program to create an array of user wish and store chars
  // according to the user and print the char

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int a = sc.nextInt();
    char[] arr = new char[a];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the value " + (i + 1));
      arr[i] = sc.next().charAt(0);

    }
    for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");

    }
    sc.close();

  }

}
