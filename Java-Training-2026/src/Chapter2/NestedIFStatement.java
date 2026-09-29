package Chapter2;

/**
 * @author : themb
 * Project : Java-Training-2026
 * Date : 9/29/2026
 **/
public class NestedIFStatement {
    public static void main(String[] args) {
        int creditScore = 500;
        double salary = 15000;
        boolean employmentStatus = true;
        String feedback = "declined";
        if (employmentStatus) {
            if (salary >= 15000) {
                if (creditScore >= 600) {
                    feedback = "Approved";
                } else if (creditScore >= 500 && creditScore <= 599)
                    feedback = "Approved";
            } else {
                feedback = "Declined(low credit score)";
            }
        } else {
            feedback = "Declined: you need to earn at least 15k";
        }
        System.out.println(feedback);
    }
}
