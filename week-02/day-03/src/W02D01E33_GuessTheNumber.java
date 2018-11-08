import java.util.Scanner;

public class W02D01E33_GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8
        int rand = (int) (Math.random() * 101);
        Scanner scanner = new Scanner(System.in);
        int guess = 100;

        do {
            System.out.println("Can you guess which number I'm thinking of? It's between 0 and 100.");
            guess = scanner.nextInt();
            if (guess > rand) {
                System.out.println("Go for a smaller number!");
            } else if (guess < rand) {
                System.out.println("Go for a bigger one!");
            }
        } while (guess != rand);
        System.out.println("You guessed it right! The number indeed was " + rand + ".");
    }
}
