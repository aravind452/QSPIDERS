import java.util.*;

public class Array1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");

    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the value " + (i + 1));
      arr[i] = sc.nextInt();
    }
    sc.close();

    // System.err.println(Arrays.toString(arr));

    for (int i = 0; i < arr.length; i++) {
      
      System.out.print(arr[i] + " ");
    }

  }

}
