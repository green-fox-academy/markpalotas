import java.util.Scanner;

public class W02D01E20PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two integers, pressing Enter after each one: ");

        int firstNum = scanner.nextInt();

        int secondNum = scanner.nextInt();

        int difference = (firstNum - secondNum);

        if (difference > 0) {

            System.out.println("This is the bigger number: " + firstNum);

            }

        else if (difference < 0) {

            System.out.println("This is the bigger number: " + secondNum);

        }

        else {

            System.out.println("These two numbers are equal.");

        }
    }
}
