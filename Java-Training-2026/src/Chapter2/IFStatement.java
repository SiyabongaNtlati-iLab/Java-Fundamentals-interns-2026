package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class IFStatement {
    public static void main(String[] args){
        int a=6, b=10;
        boolean c = true, d=false;

        if(a>b)
            System.out.println("a is greate than b");
        System.out.println("just another statement");

        if(b>a) {
            System.out.println("b is greater than a");
        }else{
            System.out.println("a is greater than b or equal");
        }
    }
}
