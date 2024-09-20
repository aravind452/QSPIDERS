public class Pattern8 {
  public static void main(String[] args) {
    int n = 5;
    char ch = 'A';
    int value = 1;
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n; j++) {

        if (i + j == n - 1) {
          System.out.print(value++ + " ");
          ch++;
        } else {
          System.out.print(ch++ + " ");

        }

      }
      ch = 'A';
      System.out.println();
    }

  }

}
