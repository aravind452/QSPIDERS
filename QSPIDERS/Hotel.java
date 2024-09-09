import java.util.*;

public class Hotel {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException {

    System.out.println("Welcome to Swiggy");

    System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Appa Canteen");

    int num = sc.nextInt();

    switch (num) {
      case 1: // Buhari
        System.out.println("Select your favourite food!");
        System.out.println("1.Mutton Biryani\n2.Chicken Biriyani\n3.Chicken 65");
        int food = sc.nextInt();
        switch (food) {
          case 1: // Mutton Biriyani
            int mBPrice = 380;
            System.out.println("Mutton Biriyani " + mBPrice);
            System.out.println("Enter the quantity!");

            int quantity = sc.nextInt();
            int totalBill = quantity * mBPrice;
            System.out.println("Total Bill " + totalBill);
            System.out.println("1.Continue\n2.Exit");
            int cont = sc.nextInt();
            if (cont == 1) {

              System.out.println("Select the payment method!");
              System.out.println("1.Gpay\n2.Phonepe");
              int pay = sc.nextInt();
              if (pay == 1 || pay == 2) {
                if (pay == 1) {
                  System.out.println("Gpay Payement");
                  Thread.sleep(3000);

                } else if (pay == 2) {
                  System.out.println("Phonepe Payment");
                  Thread.sleep(3000);
                }

                System.out.println("Enter the Bill Amount");
                int userBill = sc.nextInt();

                if (totalBill == userBill) {
                  int otp = (int) (Math.random() * 10000000);
                  Thread.sleep(3000);

                  System.out.print("System otp: " + otp);
                  System.out.println();

                  System.out.println("Enter the OTP");
                  int userOTP = sc.nextInt();
                  if (otp == userOTP) {
                    System.out.println("Order placed!");
                  } else {
                    System.out.println("Order failed, Wrong OTP");
                  }
                }
              }

            } else {
              System.out.println("Exited, Bye! Comeback to place the order!");
            }
            break;
          case 2: // Chicken Biriyani
            int cBPrice = 380;
            System.out.println("Chicken Biriyani " + cBPrice);
            System.out.println("Enter the quantity!");

            int quantityCB = sc.nextInt();
            int totalBillCB = quantityCB * cBPrice;
            System.out.println("Total Bill " + totalBillCB);
            System.out.println("1.Continue\n2.Exit");
            int conf = sc.nextInt();
            if (conf == 1) {

              System.out.println("Select the payment method!");
              System.out.println("1.Gpay\n2.Phonepe");
              int pay = sc.nextInt();
              if (pay == 1 || pay == 2) {

                if (pay == 1) {
                  System.out.println("Gpay Payement");
                  Thread.sleep(3000);

                } else if (pay == 2) {
                  System.out.println("Phonepe Payment");
                  Thread.sleep(3000);
                }

                System.out.println("Enter the Bill Amount");
                int userBill = sc.nextInt();

                if (totalBillCB == userBill) {
                  int otp = (int) (Math.random() * 10000000);
                  Thread.sleep(3000);
                  System.out.print("System otp: " + otp);
                  System.out.println();

                  System.out.println("Enter the OTP");
                  int userOTP = sc.nextInt();
                  if (otp == userOTP) {
                    System.out.println("Order placed!");
                  } else {
                    System.out.println("Order failed, Wrong OTP");
                  }
                }
              }

            } else {
              System.out.println("Exited, Bye! Comeback to place the order!");
            }

            break;
        }

        break;

      case 2:
        break;

      default:
        System.out.println("Invalid Option!");

    }

  }
}
