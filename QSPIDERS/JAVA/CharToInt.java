import java.util.*;

public class CharToInt {

  public static void main(String[] args) {
    char ch[] = { 'A', 'C', 'B', 'D' };
    int[] res = charToInt(ch);
    System.out.println(Arrays.toString(res));

  }

  static int[] charToInt(char[] ch) {
    int[] res = new int[ch.length];
    for (int i = 0; i < ch.length; i++) {
      res[i] = (ch[i]);
    }
    return res;
  }

}
