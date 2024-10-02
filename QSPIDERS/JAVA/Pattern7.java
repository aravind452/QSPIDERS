public class Pattern7 {
  public static void main(String[] args) {
    int n = 5;

    int value = 5;
    for (int i = 0; i < n; i++) {
      value = 5;
      for (int j = 0; j < n; j++) {

        if (i == j) {
          System.out.print(" ");
          value--;
        }
        if (i != j) {

          System.out.print(value-- + " ");
        }

      }
      System.out.println();
    }

  }

}
