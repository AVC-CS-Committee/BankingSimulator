import java.util.Scanner;
public class LabMath {
    /* Initiate the check account */
    private double check;

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        /* to ask */
        String confirm;
        /* for adding or removing money */
        double deposit;
        double deduct;

        System.out.println("Do you want to deposit?");
        confirm = input.next();
        confirm = confirm.toLowerCase();
        if (confirm.compareTo("yes") == 0) {
            System.out.println("How much?");
            deposit = input.nextDouble();
        } else if (confirm.compareTo("no") == 0) {
            System.out.println("Would you like to deduct?");
            confirm = input.next();
            confirm = confirm.toLowerCase();
            if (confirm.compareTo("yes") == 0) {
                System.out.println("How much?");
                deduct = input.nextDouble();
            } else if (confirm.compareTo("no") == 0) {
                System.out.println("Have a nice day!");
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}
