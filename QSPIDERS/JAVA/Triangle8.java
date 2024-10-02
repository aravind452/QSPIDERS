public class Triangle8 {
  public static void main(String[] args) {
    int n = 5;
    int k = 1;
    int d = 5;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i % 2 == 0) {
          System.out.print(k++ + " ");
        } else {
          System.out.print(d-- + " ");
        }
        if (k == 6) {
          k = 1;
        }
        if (d == 0) {
          d = 5;
        }
      }

      System.out.println();

    }

  }

}
