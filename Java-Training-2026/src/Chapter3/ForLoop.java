package Chapter3;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/30/2026
 **/
public class ForLoop {
    public static void main(String[] args){
        for(int x = 1;x<=5;x++){
            System.out.println(x+" - java");
        }
        for(int x=1, y=10; x<=5; x++, y--){
            System.out.println(x + " - " + y);
        }

        System.out.println("*Compound condition*");
        for(int x=1, y=10; x<=5 && y>=0; x++,y--){
            System.out.println(x + " --- " + y);
        }
        System.out.println("*Compound condition*");
        for(int x=1, y=10; x<=5 || y>=0; x++,y--) {
            System.out.println(x + " --- " + y);
        }
    }
}
