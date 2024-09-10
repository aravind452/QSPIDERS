public class CharPrint {

  public static void main(String[] args) {
    char ch = 'C';
    char temp = 'A';

    if (ch >= 'A' && ch <= 'Z') {
      temp = (char) (ch - 'A');
    }

    System.out.println((char) ('z' - temp));

  }

}
