public class DecimalToBinary {
  public static void main(String[] args) {
    int decimal = 13;
    StringBuilder str = new StringBuilder();
    while (decimal > 0) {
      int rem = decimal % 2;
      str.append(rem);
      decimal /= 2;
    }
    System.out.println(str);

  }

}
