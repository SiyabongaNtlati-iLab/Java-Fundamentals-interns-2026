package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/

import java.util.Locale;
import java.util.Scanner;
public class RoomPrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int price =0;

        System.out.println("Select a bed size:");
        System.out.println("A - Queen($125)");
        System.out.println("B - King($139)");
        System.out.println("C - King bed and pullout couch($165)");
        System.out.println("Enter your choice(A,B or C)");

        String choice = scanner.next().toUpperCase();

        if (choice.equals("A")){
            price = 125;
        } else if(choice.equals("B")){
            price = 139;
        } else if(choice.equals("C")){
            price = 165;
        } else{
            price = 0;
            System.out.println("Invalid bed choice.");
        }

        if (price > 0){
            System.out.println("\nSelect a view:");
            System.out.println("1 - Lake View(+$15)");
            System.out.println("2 - Park View($0)");
            System.out.println("Enter your choice(1/2):");

            int viewChoice = scanner.nextInt();

            if (viewChoice == 1){
                price = price + 15;
                System.out.println("\nTotal Room price: $"+price);
            } else if(viewChoice == 2){
                System.out.println("\nTotal Room price: $"+price);
            } else{
                System.out.println("Invalid view choice.");
            }
        }
        scanner.close();
    }
}
