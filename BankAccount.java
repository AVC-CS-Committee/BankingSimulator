/* @Author : Eddie Gomez
 * @Version : Version 2.0
 * Revamping formatting and reducing reduntant code
 */
public class BankAccount {

    private double balance;
    private String profileName;

    public BankAccount(double userBalance, String name) {
        this.balance = userBalance;
        this.profileName = name;
    }

    public void setName(String userName) {
        this.profileName = userName;
    }

    public void toDeduct(double userDeduction) {
        this.balance -= userDeduction;
    }

    public void toAdd(double userAddition) {
        this.balance += userAddition;
    }

    public double getBalance() {
        return balance;
    }

    public void printInfo() {
        System.out.println(profileName + "current balance: " + balance);
    }

    public void printUpdateInfo() {
        System.out.println(profileName + "updated balance: " + balance);
    }
}