public class TablesPrintVertically {

  public static void main(String[] args) {
    int tables = 4;
    int value = 10;
    for (int i = 1; i <= value; i++) {
      for (int j = 1; j <= tables; j++) {
        System.out.print(j + "x" + i + "=" + j * i + " ");
      }
      System.out.println();
    }
  }

}
