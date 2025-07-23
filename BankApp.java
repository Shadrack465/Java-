import java.util.Scanner;

public class BankApp {
    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {
        int choice;
        boolean isRunning = true;
        
        while (isRunning) {
            displayMenu();
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> balance += deposit();
                case 2 -> balance -= withdraw();
                case 3 -> checkBalance();
                case 4 -> isRunning = exit();
                default -> handleInvalidInput();
            }
        }
    }

    static void displayMenu() {
        System.out.println("\nWELCOME TO OSMAN'S BANK ®");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. BALANCE");
        System.out.println("4. EXIT");
        System.out.print("Enter your choice (1-4): ");
    }

    static double deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        
        if (amount <= 0) {
            System.out.println("Error: Deposit must be > $0");
            return 0;
        }
        System.out.println("Deposited: $" + amount);
        return amount;
    }

    static double withdraw() {
        System.out.print("Enter withdrawal amount: $");
        double amount = scanner.nextDouble();
        
        if (amount > balance) {
            System.out.println("Error: Insufficient funds");
            return 0;
        } else if (amount <= 0) {
            System.out.println("Error: Withdrawal must be > $0");
            return 0;
        }
        System.out.println("Withdrawn: $" + amount);
        System.out.println("CRnARARRAAKRAAKARARRARRRRAAR");
        return amount;
    }

    static void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    static boolean exit() {
        System.out.println("Thank you for banking with us!");
        return false;
    }

    static void handleInvalidInput() {
        System.out.println("Invalid choice! Please enter 1-4");
    }
}
// New banking application
