public class FindNaturalNos {

  public static void main(String[] args) {
    int arr[] = { 1, 4, 6, 9 };
    findNaturalNos1(arr);

  }

  // First method
  static void findNaturalNos(int[] arr) {

    for (int i = 1; i < arr.length; i++) {
      int start = arr[i - 1] + 1;
      int end = arr[i];
      for (int j = start; j < end; j++) {
        System.out.print(j + " ");

      }

    }

  }

  // Second method
  static void findNaturalNos1(int[] arr) {
    for (int i = 1; i < arr.length; i++) {

      int start = arr[i - 1];
      int end = arr[i];
      if (end - start > 0) {
        for (int j = 1; j < (end - start); j++) {
          System.out.print((start + j) + " ");
        }

      }
    }

  }

  // Sir method
  static void findNaturalNos2(int[] arr) {
    int j = 1;
    for (int i = 0; i < arr.length; i++, j++) {
      if (arr[i] != j) {
        System.out.println(j + " ");
        i--;

      }

    }
  }
}
