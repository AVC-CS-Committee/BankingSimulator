/* @Author: Eddie Gomez
 * @Version : 2.0
 * Revamping and deleting unnecessary code.
 */

public class InterestRate {
    public double getTotalInterest(double rate, double principal, int timeComp, int years) {
        double total;
        total = principal * Math.pow((1 + (rate / timeComp)), (years * timeComp));
        return total;
    }
}