package Chapter3;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
import java.util.Scanner;
public class RetirementGoal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int years;
        double annualSavings;

        do {
            System.out.print("Enter the number of years until retirement: ");
            years = sc.nextInt();

            if (years <= 0) {
                System.out.println("Error: Years until retirement must be greater than 0.");
            }
        } while (years <= 0);

        do {
            System.out.print("Enter the amount of money you can save annually: $");
            annualSavings = sc.nextDouble();

            if (years <= 0) {
                System.out.println("Error: Annual savings must be greater than 0.");
            }
        } while (annualSavings <= 0);

        double totalSavings = years * annualSavings;

        System.out.println("-----------------");
        System.out.println("Total accumulated savings at retirement: $" + totalSavings);
    }
}
