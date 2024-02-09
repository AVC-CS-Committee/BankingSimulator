// Eddie Gomez
// Version 1.0
// Checking account for adding and reducing purposes.
public class CheckMoney {
    /* Initiate the check */
    private double check;
    public void Current(double check) {
        check = 0.00;
    }

    //Add amount
    public void toAdd(double amount) {
        check = check + amount;
    }

    //Reduce amount
    public void toReduce(double amount) {
        check = check - amount;
    }

    //Giving the total amount
    public double getAmount() {
        return check;
    }
}