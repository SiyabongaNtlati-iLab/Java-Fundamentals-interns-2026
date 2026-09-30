package Chapter4;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
import java.util.Scanner;
public class VoidMethods {
    public static void main(String[] args) {

        displayMessage();
        System.out.println("=============================");
        displayAddress();
    }

    static void displayMessage(){
        System.out.println("Hi, welcome to Java training");
    }

    public static void displayAddress(){
        System.out.println("""
                123 Main Street
                Rivonia
                Sandton
                0123""");
    }


}
