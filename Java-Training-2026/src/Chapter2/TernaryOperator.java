package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class TernaryOperator {
    public static void main(String[] args){
        int age = 15, number = 9;
        String feedback;

        //usual way of doing it
        //if(age >=18){
        //    feedback = "you can vote";
        //}else {
        //    feedback = "soryy you cannot vote";
        //}

        //other way of doing it
        //varialbe = condition ? trueresults : falseresult
        feedback = (age >=18) ? "you can vote": "sorry you cannot vote.";

        //if(number %2 ==0){
        //    System.out.println("even");
        //} else if(number %3 ==0){
        //    System.out.println("multiple of 3");
        //}else{
        //    System.out.println("odd");
        //}

        //other way of doing it
        feedback = (number %2 ==0) ? "even":
                (number %3==0) ? "multiple of 3": "odd";

        System.out.println(feedback);
    }
}
