package Chapter1;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/28/2026
 **/
public class ExploreStrings {
    public static void main(String[] args){
        String sentence= "In Java, variables must be declared before they can be used.";

        //number of characters
        System.out.println("Length: " + sentence.length());
        //position of
        System.out.println("position: " + sentence.indexOf("v",6));//5
        //character at a position(10)
        System.out.println("10th position has: " + sentence.charAt(10));
    }
}
