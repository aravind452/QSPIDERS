public class Pattern3 {
  public static void main(String[] args) {
    int n = 5;
    char ch = 'A';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j <= n / 2) {
          System.out.print(ch++ + " ");
        } else {
          System.out.print(j + 1 + " ");
        }
      }
      System.out.println();
    }
  }

}
