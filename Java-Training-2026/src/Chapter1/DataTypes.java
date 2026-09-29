package Chapter1;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/28/2026
 **/
public class DataTypes {
    public static void main(String[] args){
        int intAge;
        short number = 5;
        long longAge = 25;
        double salary = 5000.00;
        float wage = 5000.00f;
        boolean isEmployed;
        char letter = 'A';
        String strDay = "Today is a Monday";

        intAge = 36;
        isEmployed = false;

        System.out.println("the Age is: (" + intAge + ", " + longAge + ")");
        System.out.println("Salary: " + salary);
        System.out.println("Employed? " + isEmployed);
        System.out.println("Letter: " + letter);
        System.out.println("Day: " + strDay);
        System.out.println("Number: " + number);
    }
}
