import java.util.Scanner;
import java.util.ArrayList;

 public class Main {
     private static ArrayList<BankAccount> profiles = new ArrayList<BankAccount>();
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         displayMenu();
         char choice;
         choice = scanner.next().charAt(0);

         while (choice != '2' && choice != '1') {
             System.out.println("Invalid choice! Try 1 or 2.");
             choice = scanner.next().charAt(0);
         }        
         switch (choice) {
             case '1':
                 enterBankApp();
                 break;
             case '2':
                 System.out.println("Exiting program...");
                 System.exit(0);
                 break;
         }
     }

     private static void menuOptions() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Menu Options:");
         System.out.println("1. Deposit money.");
         System.out.println("2. Withdraw money.");
         System.out.println("3. View account details.");
         System.out.println("4. Add new account.");
         System.out.println("5. Exit.");
         System.out.println("Enter your choice: ");

         char choice = scanner.next().charAt(0);
         switch (choice) {
             case '1':
                 depositMoney();
                 break;
             case '2':
                 withdrawMoney();
                 break;
             case '3':
                 viewAccountDetails();
                 break;
             case '4':
                 addAccount();
                 break;
             case '5':
                 System.out.println("Exiting program...");
                 System.exit(0);
                 break;
             default:
                 System.out.println("Invalid choice! Please try again.");
                 menuOptions();
                 break;
         }
     }
    
     private static void depositMoney() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the amount to deposit:");
         double amount = scanner.nextDouble();
         selectAccount().deposit(amount);
         System.out.println("Deposit successful.");
         menuOptions();
     }
    
     private static void withdrawMoney() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the amount to withdraw:");
         double amount = scanner.nextDouble();
         BankAccount selectedAccount = selectAccount();
         selectedAccount.withdraw(amount);
         if (selectedAccount.getBalance() > 0) {
             System.out.println("Withdrawal successful.");
         } else {
             selectedAccount.deposit(amount);
             System.out.println("Insufficient funds!");
         }
         menuOptions();
     }
    
     private static void viewAccountDetails() {
         selectAccount().printInfo();
         menuOptions();
     }

     private static void addAccount() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter the profile name for the new account:");
         String profileName = scanner.nextLine();
         System.out.println("Enter the initial balance for the new account:");
         double balance = scanner.nextDouble();
         profiles.add(new BankAccount(balance, profileName));
         System.out.println("New account added successfully!");
         menuOptions();
     }

     private static BankAccount selectAccount() {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Select an account:");
         for (int i = 0; i < profiles.size(); i++) {
             System.out.println((i + 1) + ". " + profiles.get(i).getProfileName());
         }
         int accountIndex = scanner.nextInt() - 1;
         return profiles.get(accountIndex);
     }
        
     private static void displayMenu() {
         System.out.println(",-.          ,                ,-.              .     . ");
         System.out.println("|  )         |   o           (   ` o           |     | ");
         System.out.println("|-<  ,-: ;-. | , . ;-. ,-:    `-.  . ;-.-. . . | ,-: |-  ,-. ;-. ");
         System.out.println("|  ) | | | | |<  | | | | |   .   ) | | | | | | | | | |   | | | ");
         System.out.println("`-'  `-` ' ' ' ` ' ' ' `-|    `-'  ' ' ' ' `-` ' `-` `-' `-' ' ");
         System.out.println("                       `-' ");
         System.out.println("");
         System.out.println("\n================");
         System.out.println("      Menu:");
         System.out.println("================");
         System.out.println("1. Enter the banking app.");
         System.out.println("2. Exit. ");
         System.out.println("Enter your choice (1 or 2): ");
     }
     private static void enterBankApp() {
         Scanner scanner = new Scanner(System.in);
         String profileName;
         double balance;
         char choice;
    
         System.out.println("Welcome to the Bank App!");
         /*   FOR FUNCTIONALITY OF THE BANKING APP ADD HERE !!!!!!!!!!!!!!!!!!!!!!!!!! */ 
         System.out.println("This program lets you simulate having a real bank with multiple profiles!");
         System.out.println("First, let's start with your first profile:");
         System.out.println("What will your first profile name be?:");
         profileName = scanner.nextLine();
         System.out.println(profileName + " is that correct? 1: Yes, 2: No");
         choice = scanner.next().charAt(0);
         while (choice != '1') {
             while (choice != '2') {
                 System.out.println("Invalid choice! Try 1: Yes or 2: No");
                 choice = scanner.next().charAt(0);
             }
             scanner.nextLine();
             System.out.println("What will your first profile name be?:");
             profileName = scanner.nextLine();
             System.out.println(profileName + " is that correct? 1: Yes, 2: No");
             choice = scanner.next().charAt(0);
         }
         System.out.println("Splendid! Let's add some money to your account. How about we start with $100, shall we?");
         balance = 100.00;
         profiles.add(new BankAccount(balance, profileName));
         System.out.println("Here's your first account!");
         profiles.get(0).printInfo();
         System.out.println("From now on here's what you can do: ");
         menuOptions();
         System.out.println("Thank you for using the app, Goodbye!");
         System.exit(0);
     }
 }
