package AverageProjects;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxGuess = 100;
        int attempts = 5;
        int secretNumber = (int) Math.round(Math.random() * maxGuess);
        int userGuess;

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();

            if (userGuess == secretNumber){
                System.out.println("Correct!");
                break;
            }
            else if(userGuess > secretNumber)
                System.out.println("Too high");
            else
                System.out.println("Too low");
        }
        System.out.println("Game over! The secret number was " + secretNumber);
    }
}
