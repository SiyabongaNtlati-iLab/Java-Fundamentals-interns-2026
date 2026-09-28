package Chapter1;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/28/2026
 **/
import java.util.Scanner;

import static java.lang.Double.sum;

public class Homework1 {
    public static void main(String[] args){
        double adultPrice = 50;
        double kidsPrice = 37.50;

        int adultAmnt;
        int kidsAmnt;

        Scanner mealCount = new Scanner(System.in);
        System.out.print("Please enter the amount of Adult meals ordered: ");
        adultAmnt = mealCount.nextInt();
        System.out.print("Please enter the amount of Kids meals ordered: ");
        kidsAmnt = mealCount.nextInt();

        double subAdlTotal = adultAmnt * adultPrice;
        double subKidTotal = kidsAmnt * kidsPrice;
        double TotalPrice = subAdlTotal + subKidTotal;

        System.out.println("The subtotal for " + adultAmnt + " adult meals @ R" + adultPrice + " each: R" + subAdlTotal);
        System.out.println("The subtotal for " + kidsAmnt + " kids meals @ R" + kidsPrice + " each: R" + subKidTotal);
        System.out.println("Your total amount is : R" + TotalPrice);
    }
}
