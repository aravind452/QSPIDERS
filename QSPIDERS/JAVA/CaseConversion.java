import java.util.*;

class ClassConversion {
  public static void main(String[] args) {
    char[] ch = { 'A', 'b', 'c', 'D', 'Z', '$', 'e', '#' };
    char[] res = caseConversion(ch);
    System.out.println(Arrays.toString(res));

  }

  static char[] caseConversion(char ch[]) {
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] >= 'A' && ch[i] <= 'Z') {
        ch[i] = (char) (ch[i] + 32);
      } else if (ch[i] >= 'a' && ch[i] <= 'z') {
        ch[i] = (char) (ch[i] - 32);
      }
    }
    return ch;
  }
}