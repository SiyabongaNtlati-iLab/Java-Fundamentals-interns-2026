package Chapter1;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/28/2026
 **/

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        String name;
        int age;
        double height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your Age: ");
        age = sc.nextInt();
        System.out.println("Enter your height: ");
        height = sc.nextDouble();
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Height : "+ height);

    }
}
