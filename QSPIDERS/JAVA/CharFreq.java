import java.util.*;

public class CharFreq {

  public static void main(String[] args) {
    charFreq("hello lol");

  }

  static void charFreq(String str) {

    String rep = "";
    String dis = "";

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if (map.containsKey(str.charAt(i))) {
        map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
      } else if (str.charAt(i) != ' ') {
        map.put(str.charAt(i), 1);
      }
    }

    for (Map.Entry<Character, Integer> c : map.entrySet()) {
      if (c.getValue() == 1) {

        rep += c.getKey() + " ";

      } else {
        dis += c.getKey() + " ";
      }

    }

    System.out.println(map);
    System.out.println("Repeated " + rep);
    System.out.println("Unique " + dis);

  }

}
