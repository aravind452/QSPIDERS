public class StringDecompression {

  public static void main(String[] args) {
    String str = "a13b2c12d4";
    System.out.println(decompress(str));
  }

  static String decompress(String str) {
    String finalStr = "";
    int i = 0;

    for (; i < str.length();) {
      char ch = str.charAt(i);
      i++;
      String count = "";
      while (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
        count += str.charAt(i);
        i++;

      }

      int c = Integer.parseInt(count);
      for (int j = 0; j < c; j++) {
        finalStr += ch;
      }
      finalStr += "\n";

    }
    return finalStr;

  }

}
