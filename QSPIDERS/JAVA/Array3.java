import java.util.*;

public class Array3 {
  // create an array of user wish size and the store the elements but print from
  // reverse

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int a = sc.nextInt();

    int arr[] = new int[a];
    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the value " + (i + 1));
      arr[i] = sc.nextInt();
    }

    for (int i = arr.length - 1; i >= 0; i--) {
      System.out.print(arr[i] + " ");
    }
    sc.close();

  }
}
