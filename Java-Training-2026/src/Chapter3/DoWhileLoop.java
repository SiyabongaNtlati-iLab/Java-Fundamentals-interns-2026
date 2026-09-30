package Chapter3;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        double average = 0;
        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter any integer: ");
            number = sc.nextInt();
            sum+= number;
            count++;

        }while (number != 0);

        average = sum / count;
        System.out.format("""
                Sum:        %d
                Average:    %.2f""", sum,average);
    }
}
