public class TriPattern2 {

  public static void main(String[] args) {
    int n = 9;
    for (int i = n; i > 0; i--) {
      for (int space = 1; space < i; space++) {
        System.out.print("  ");
      }
      for (int left = i; left <= n; left++) {
        System.out.print(left + " ");
      }

      for (int right = n - 1; right >= i; right--) {
        System.out.print(right + " ");

      }
      System.out.println();

    }
  }

}
