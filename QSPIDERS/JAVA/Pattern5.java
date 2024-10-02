public class Pattern5 {
  public static void main(String[] args) {
    int n = 5;
    char ch = 'A';

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (true) {
          System.out.print(ch++ + " ");
        }
        if (ch == 'E') {
          ch = '1';
        }
        if (ch == '4') {
          ch = 'A';
        }

      }
      System.out.println();
    }
  }

}
