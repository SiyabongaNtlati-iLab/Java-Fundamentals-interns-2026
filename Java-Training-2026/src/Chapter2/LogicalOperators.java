package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class LogicalOperators {
    public static void main(String[] args){
        int a=5,b=25;
        boolean c = false;

        System.out.println(a==b && c);
        System.out.println((a!=b) || (a<b));
        System.out.println(a>(b/3));
        System.out.println((b>a)||(c));

        System.out.println( !(a>= (b/5)));
        System.out.println( !(a<b) && (b==5) || !c);
    }
}
