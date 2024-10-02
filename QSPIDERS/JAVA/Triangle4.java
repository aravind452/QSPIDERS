public class Triangle4 {
  public static void main(String[] args) {
    // int n = 5;
    int k = 1;
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(k++ + " ");

      }
      k = 2;
      System.out.println();
    }
  }

}
