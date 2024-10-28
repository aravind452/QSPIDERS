public class StringToAddition {

  public static void main(String[] args) {
    String str = "Ab23c44d";
    System.out.println(stringToInt(str));
  }

  static int stringToInt(String str) {
    int sum = 0;
    for (int i = 0; i < str.length(); i++) {
      int ch = (str.charAt(i) - '0');
      if (ch >= 0 && ch <= 9) {

        sum = sum + ch;
      }

    }
    return sum;
  }

}
