
public class Array4 {

  public static void main(String[] args) {

    // WAJP to copy one array elements to another

    int[] arr = { 2, 4, 5, 6, 6, 9 };

    int newArray[] = new int[arr.length];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = arr[i];
    }

    for (int i = 0; i < newArray.length; i++) {
      System.out.print(newArray[i] + " ");
    }

  }

}
