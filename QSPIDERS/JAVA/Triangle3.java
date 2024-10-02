public class Triangle3 {
  public static void main(String[] args) {
    char ch = 'A';
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(ch++ + " ");
      }
      System.out.println();
      ch = 'A';
    }

  }

}
