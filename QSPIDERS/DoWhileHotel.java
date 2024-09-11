import java.util.*;

public class DoWhileHotel {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws Exception {

    boolean flag = true;
    boolean menu = true;
    do {
      System.out.println("Select the Hotel");
      System.out.println("1.Buhari\n2.A2B\n3.Exit");
      int hotelInput = sc.nextInt();

      switch (hotelInput) {

        case 1:
          do {
            Thread.sleep(1000);
            System.out.println("Ridirecting to Buhari Page");
            System.out.println("Select the food!");
            System.out.println("1.Chicken Biryani\n2.Mutton Biriyani\n3.Exit");
            int foodInput = sc.nextInt();
            switch (foodInput) {
              case 1:
                System.out.println("Chicken Biriyani Rs380");
                Thread.sleep(1000);
                break;
              case 2:
                System.out.println("Mutton Biriyani Rs480");
                Thread.sleep(1000);
                break;
              case 3:
                menu = false;
                System.out.println("Ridirecting to Hotel Page!");
                Thread.sleep(1000);
                break;

            }

          } while (menu);
          break;
        case 2:
          do {
            Thread.sleep(1000);
            System.out.println("Ridirecting to A2B Page");
            System.out.println("Select the food!");
            System.out.println("1.Dosa\n2.Idly\n3.Exit");
            int foodInput = sc.nextInt();
            switch (foodInput) {
              case 1:
                System.out.println("Dosa Rs30");
                Thread.sleep(1000);
                break;
              case 2:
                System.out.println("Idly Rs20");
                Thread.sleep(1000);
                break;
              case 3:
                menu = false;
                System.out.println("Ridirecting to Hotel Page!");
                Thread.sleep(1000);
                break;

            }

          } while (menu);
          break;
        case 3:
          flag = false;
          System.out.println("Exited, Bye!");
          break;
      }
    } while (flag);

  }
}