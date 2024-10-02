public class TriPattern3 {

  public static void main(String[] args) {
    int n = 8;
    for (int i = 1; i <= n * 2; i++) {
      if (i <= 8) {
        for (int space = i; space < 8; space++) {
          System.out.print("  ");
        }
        for (int j = 1; j <= i; j++) {
          System.out.print("* ");
        }
      }

      else if (i > 8) {
        for (int space = i; space > n; space--) {
          System.out.print("  ");
        }
        for (int down = i; down < n * 2; down++) {
          System.out.print("* ");
        }

      }

      System.out.println();
    }

  }

}
