// Eddie Gomez
// Version 1.0
// Checking account for adding and reducing purposes.
// Version 1.1
// Added to give class
public class CheckMoney {
    /* Initiate the check */
    InterestRate giveAmount = new InterestRate();

    private double check;
    public void Current(double check) {
        check = 0.00;
    }

    //Add amount
    public void toAdd(double amount) {
        check = check + amount;
        giveAmount.setInterest(check);
    }

    //Reduce amount
    public void toReduce(double amount) {
        check = check - amount;
        giveAmount.setInterest(check);
    }

    //Giving the total amount
    public double getAmount() {
        return check;
    }
}