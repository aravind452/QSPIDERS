
public class ObtainThePairs {

  public static void main(String[] args) {
    int[] arr = { 1, -2, 6, -1, 3 };
    obtainPairs(arr);

  }

  

  int max = Integer.MAX_VALUE;

  static void obtainPairs(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        System.out.print("[");
        for (int k = i; k <= j; k++) {
          if (k == j) {
            System.out.print(arr[k]);
          } else {
            System.out.print(arr[k] + ",");
          }

        }
        System.out.print("]");

      }
      System.out.println();
    }

  }

}
