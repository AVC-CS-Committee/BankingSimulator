import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    enterBankApp();
                    break;
                case '2':
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");         //Exception
            }
        }
    }
        
    private static void displayMenu() {
        System.out.println("$$$$$$$\                      $$\       $$\  ");
        System.out.println("$$  __$$\                     $$ |      \__| ");
        System.out.println("$$ |  $$ | $$$$$$\  $$$$$$$\  $$ |  $$\ $$\ $$$$$$$\   $$$$$$\ ");
        System.out.println("$$$$$$$\ | \____$$\ $$  __$$\ $$ | $$  |$$ |$$  __$$\ $$  __$$\ ");
        System.out.println("$$  __$$\  $$$$$$$ |$$ |  $$ |$$$$$$  / $$ |$$ |  $$ |$$ /  $$ | ");
        System.out.println("$$ |  $$ |$$  __$$ |$$ |  $$ |$$  _$$<  $$ |$$ |  $$ |$$ |  $$ | ");
        System.out.println("$$$$$$$  |\$$$$$$$ |$$ |  $$ |$$ | \$$\ $$ |$$ |  $$ |\$$$$$$$ | ");
        System.out.println("\_______/  \_______|\__|  \__|\__|  \__|\__|\__|  \__| \____$$ | ");
        System.out.println("                                                      $$\   $$ | ");
        System.out.println("                                                      \$$$$$$  | ");
        System.out.println("                                                       \______/ ");
        System.out.println(" $$$$$$\  $$\                         $$\            $$\ ");
        System.out.println("$$  __$$\ \__|                        $$ |           $$ | ");
        System.out.println("$$ /  \__|$$\ $$$$$$\$$$$\  $$\   $$\ $$ | $$$$$$\ $$$$$$\    $$$$$$\   $$$$$$\ ");
        System.out.println("\$$$$$$\  $$ |$$  _$$  _$$\ $$ |  $$ |$$ | \____$$\\_$$  _|  $$  __$$\ $$  __$$\ ");
        System.out.println(" \____$$\ $$ |$$ / $$ / $$ |$$ |  $$ |$$ | $$$$$$$ | $$ |    $$ /  $$ |$$ |  \__| ");
        System.out.println("$$\   $$ |$$ |$$ | $$ | $$ |$$ |  $$ |$$ |$$  __$$ | $$ |$$\ $$ |  $$ |$$ | ");
        System.out.println("\$$$$$$  |$$ |$$ | $$ | $$ |\$$$$$$  |$$ |\$$$$$$$ | \$$$$  |\$$$$$$  |$$ | ");
        System.out.println(" \______/ \__|\__| \__| \__| \______/ \__| \_______|  \____/  \______/ \__| ");
        System.out.println("");
        System.out.println("\n================");
        System.out.println("      Menu:");
        System.out.println("================");
        System.out.println("1. Enter the banking app.");
        System.out.println("2. Exit. ");
        System.out.println("Enter your choice (1 or 2): ");
     }
     private static void enterBankApp() {
        System.out.println("Welcome to the Bank App!");
        /*   FOR FUNCTIONALITY OF THE BANKING APP ADD HERE !!!!!!!!!!!!!!!!!!!!!!!!!! */ 
        System.out.println("Thank you for using the app, Goodbye!");
     }
 }
