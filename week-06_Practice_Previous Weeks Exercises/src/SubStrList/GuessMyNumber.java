package SubStrList;

import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        intro();
        Scanner scanner = new Scanner(System.in);
        int howManyLives = 5;
        int numberToGuess = generateRandomInRange();
        System.out.println("OK, I've got the number. Now start guessing - you have 5 lives!");
        int guess = scanner.nextInt();
        if (guessChecker(howManyLives, numberToGuess, guess)) {
            System.out.println("You've won, congrats!");
        } else {
            System.out.println("You've lost all your lives - and thus the game, too...");
        }
    }

    public static void intro() {
        System.out.println("You will have to guess an integer number that I come up with.");
        System.out.println("To make the task somewhat easier, it's you who determines the range the number comes from.);");
    }

    public static int[] askForRange() {
        int[] range = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the lower limit of the range (integer, inclusive):");
        range[0] = scanner.nextInt();
        System.out.println("Now the upper limit (integer, inclusive):");
        range[1] = scanner.nextInt();
        return range;
    }

    public static int generateRandomInRange() {
        int[] range = askForRange();
        return (int) (Math.random() * (range[1] - range[0] + 1) + range[0]);
    }

    public static boolean guessChecker(int howManyLives, int numberToGuess, int guess) {
        while (howManyLives - 1 > 0 && guess != numberToGuess) {
            howManyLives--;
            Scanner scanner = new Scanner(System.in);
            String relation;
            if (guess > numberToGuess) {
                relation = "Too high. ";
            } else {
                relation = "Too low. ";
            }
            System.out.println(relation + "Guess again. You have " + howManyLives + " lives left.");
            guess = scanner.nextInt();
        }
        return howManyLives > 1;
    }
}
