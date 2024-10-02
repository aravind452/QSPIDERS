public class TriPattern1 {

  public static void main(String[] args) {
    int n = 8;
    for (int i = 1; i <= n; i++) {

      for (int space = n; space > i; space--) {
        System.out.print("  ");
      }

      for (int j = i; j > 0; j--) {
        System.out.print(j + " ");
      }

      for (int k = 2; k <= i; k++) {
        System.out.print(k + " ");
      }
      System.out.println();

    }

  }

}
