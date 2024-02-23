/* Editors: Eddie Gomez
 *
 * Version 1.1
 * Changes to the compund interest formula (Completed)
 */

public class InterestRate {

    // Declared APY percentage and total amount.
    private double r;
    private double P;
    private double total;
    private int t;

    public void Interest(double r, double p, double total, int t)  {
        r = 0.05;
        P = 0.00;
        total = 0.00;
        t = 0;
    }

    public void setInterest(double amount, int years) {
        t = years;
        P = amount;
    }

    public void RateCalculation() {
        total = (P * Math.pow((1.00 + r), t))
    }
    
    public double getTotal() {
        return total;
    }
}