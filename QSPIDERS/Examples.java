public class Examples {
  public static void main(String[] args) {
    int input = 123456;
    int temp = 0;
    while (input != 0) {
      temp = temp + input % 10;
      input /= 10;
    }
    System.out.println(temp);
  }

}
