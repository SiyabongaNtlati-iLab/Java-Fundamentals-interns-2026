package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class ExploreOperators {
    public static void main(String[] args){
        int a, b;

        a = 5;
        b = 15;

        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b" + b);

        a+=5;
        b+=2;

        System.out.println("Current Value of A" + a);
        System.out.println("Current Value fo b: " + b);

        a-=3;
        b-=6;
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        a*=2;
        b*=3;
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);

        a/=7;
        b/=6;
        System.out.println("Current Value of a: " + a);
        System.out.println("Current Value of b: " + b);
    }
}
