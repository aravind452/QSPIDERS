import java.util.*;

public class SecondLargest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        int largest, secondLar;

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            largest = num1;
            if (num2 > num3 && num2 > num4) {
                secondLar = num2;
            } else if (num3 > num2 && num3 > num4) {
                secondLar = num3;
            } else {
                secondLar = num4;
            }
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            largest = num2;
            if (num1 > num3 && num1 > num4) {
                secondLar = num1;
            } else if (num3 > num1 && num3 > num4) {
                secondLar = num3;
            } else {
                secondLar = num4;
            }
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            largest = num3;
            if (num1 > num2 && num1 > num4) {
                secondLar = num1;
            } else if (num2 > num1 && num2 > num4) {
                secondLar = num2;
            } else {
                secondLar = num4;
            }
        } else {
            largest = num4;
            if (num1 > num2 && num1 > num3) {
                secondLar = num1;
            } else if (num2 > num1 && num2 > num3) {
                secondLar = num2;
            } else {
                secondLar = num3;
            }
        }

        System.out.println("The largest number is: " + largest);

        System.out.println("The second largest number is: " + secondLar);
    }
}