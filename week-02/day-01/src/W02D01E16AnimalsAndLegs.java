import java.util.Scanner;

public class W02D01E16AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have?");

        int numberOfChicken = scanner.nextInt();

        System.out.println("How many pigs do you have?");

        int numberOfPigs = scanner.nextInt();

        System.out.println("Your animals have " + (numberOfChicken*2 + numberOfPigs*4) + " legs altogether.");
    }
}