import java.util.*;

public class KthMax {

  public static void main(String[] args) {
    int[] arr = { 7, 3, 4, 18, 9, 0, -1 };
    Set<Integer> set = new HashSet<>();
    Queue<Integer> p = new PriorityQueue<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
      p.add(arr[i]);
    }
    System.out.println(set);

    System.out.println(p);
    kthMin(set, 2);

  }

  static void kthMin(Set<Integer> arr, int k) {

    Queue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());

    if (k > arr.size()) {
      System.out.println("invalid");
      return;
    }

    for (Integer i : arr) {
      p.add(i);

      if (p.size() > k) {
        p.poll();
      }
    }

    int max = p.peek();
    System.out.println(max);

  }

}
