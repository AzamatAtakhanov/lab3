package MiniBank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1111", 10000);
        Scanner sc = new Scanner(System.in);
        int attempts = 3;
        boolean hasEntered = false;
        System.out.println("===== SIMPLE ATM =====");
        for (int i = attempts; i > 0; i--) {
            System.out.print("Enter your PIN: ");
            String pin = sc.nextLine();
            if (account.validatePin(pin)) {
                hasEntered = true;
                System.out.println("Login successful!");
                break;
            }
            System.out.println("Invalid PIN!");
            System.out.println("You have " + (i - 1) + " " + (i - 1 == 1 ? "attempt" : "attempts"));
        }

        while (hasEntered) {
            System.out.println("===== ATM MENU =====");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("How much money would you like to deposit?: ");
                    float depositAmount = sc.nextFloat();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("How much money would you like to withdraw?: ");
                    float withdrawAmount = sc.nextFloat();
                    if (account.getBalance() >= withdrawAmount)
                        account.withdraw(withdrawAmount);
                    else
                        System.out.println("Sorry, your balance is only " +  account.getBalance());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    hasEntered = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
