import java.util.Scanner;

public class W02D01E18OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        int yourNumber = scanner.nextInt();

        if ((yourNumber % 2) == 0) {

            System.out.println("Even");
        }

        else {
            System.out.println("Odd");
        }
    }
}
