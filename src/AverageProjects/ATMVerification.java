package AverageProjects;

import java.util.Scanner;

public class ATMVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = "1111";
        String userInput;
        int attempts = 3;
        boolean isCorrect = false;
        for (int i = attempts - 1; i >= 0; i--) {
            System.out.print("Enter PIN: ");
            userInput = sc.nextLine();

            if (userInput.equals(pin)) {
                isCorrect = true;
                break;
            }
            System.out.println("Incorrect PIN");
            System.out.println("Attempts left: " + i);
        }
        if (isCorrect)
            System.out.println("Access granted");
        else
            System.out.println("Card blocked");

        sc.close();
    }
}
