/* Eddie Gomez*/

/* Version 1.2 - Changes : Eliminated check object, renamed file, created object toCheck to add or reduce. */
import java.util.Scanner;
public class LabMath {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        CheckMoney toCheck = new CheckMoney();
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
            toCheck.toAdd(deposit);
        } else if (confirm.compareTo("no") == 0) {
            System.out.println("Would you like to deduct?");
            confirm = input.next();
            confirm = confirm.toLowerCase();
            if (confirm.compareTo("yes") == 0) {
                System.out.println("How much?");
                deduct = input.nextDouble();
                toCheck.toReduce(deduct);
            } else if (confirm.compareTo("no") == 0) {
                System.out.println("Have a nice day!");
            }
        } else {
            System.out.println("Invalid input!");
        }

        System.out.print(toCheck.getAmount());
    }
}
