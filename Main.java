import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char choice;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=============");
            System.out.println("Menu:");
            System.out.println("\n=============");
            System.out.println("1. Enter the banking app.");
            System.out.println("2. Exit. ");
            System.out.println("Enter your choice (1 or 2): ");
            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.println("Entering the banking app.");
                    break;
                case '2':
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");

            }
        }
    } 
}