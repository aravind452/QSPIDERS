public class Triangle1 {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
    System.out.print("* ");
    }
    System.out.println();
    }
    fun();

  }

  public static void fun() {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int space = n; space > i; space--) {
        System.out.print("  ");

      }
      for (int j = 1; j <= i; j++) {
        System.err.print(j + " ");
      }
      System.err.println();
    }
  }

}