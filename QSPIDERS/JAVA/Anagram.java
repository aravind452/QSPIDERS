
public class Anagram {

  public static void main(String[] args) {
    String str1 = "earth";
    String str2 = "heart";
    System.out.println(isAnagram(str1, str2) ? "Anagram" : "Not Anagram");
  }

  static boolean isAnagram(String str1, String str2) {
    int[] ch1 = new int[26];
    int[] ch2 = new int[26];

    for (int i = 0; i < str1.length(); i++) {
      ch1[str1.charAt(i) - 'a']++;
    }
    for (int i = 0; i < str2.length(); i++) {
      ch2[str2.charAt(i) - 'a']++;
    }

    for (int i = 0; i < ch1.length; i++) {
      if (ch1[i] != ch2[i]) {
        return false;

      }
    }
    return true;

  }

}
