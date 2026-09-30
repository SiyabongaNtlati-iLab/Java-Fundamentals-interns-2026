package Chapter3;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
public class WhileLoop {
    public static void main(String[] args){
        //Display java 5 times
        int x=1;

        while (x %3==0){
            System.out.println(x + " - Java");
            x+=2;
        }
        System.out.println("End");
    }
}
