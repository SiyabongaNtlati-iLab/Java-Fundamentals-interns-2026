package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class IncrementDecrement {
    public static void main(String[] args){
        int x = 4;

        System.out.println("Current value of x: " + x);
        System.out.print("Pre-increment: " + ++x);

        x=25;
        System.out.print("Current value of x: " + x);
        System.out.print("Pre-decrement: " + --x);
        System.out.print("Value after pre-decrement " + x);

        x=16;

        System.out.print("Current Value of x: " + x);
        System.out.print("post-increment: " + x++);
        System.out.print("Value after post-increment " + x);

        x*=2;

        System.out.print("Current Value of x: " + x);//34
        System.out.print("post-increment: " + x--);//34
        System.out.print("Value after post-increment " + x);//33
    }
}
