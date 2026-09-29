package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class IF_Else {
    public static void main(String[] args){
        int a=6,b=10;
        boolean c=true, d=false;

        if (a == b){
            System.out.println("a is b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else if(a > b){
            System.out.println("a is greater than b");
        } else if ( a %3 == 0){
            System.out.println("a is a multiple of 3");
        } else{
            System.out.println("a is just a number");
        }
    }
}
