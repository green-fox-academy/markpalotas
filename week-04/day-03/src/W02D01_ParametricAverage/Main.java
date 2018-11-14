package W02D01_ParametricAverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double howMany;
            System.out.println("How many numbers would you like me to calculate the average of?");
            howMany = scanner.nextDouble();
            int sumOfAll;
            System.out.println("Please enter the first number:");
            sumOfAll = scanner.nextInt();
            for (int i = 0; i < howMany - 2; i++) {
                System.out.println("Now the next one:");
                sumOfAll += scanner.nextInt();
            }
            System.out.println("Now the last one:");
            sumOfAll += scanner.nextInt();
            double average = ((int) (sumOfAll / howMany * 100)) / 100.0;
            System.out.println("The sum of the numbers you have entered is: " + sumOfAll + " and their average equals " + average);
        } catch (NumberFormatException e) {
            System.out.println("What you've entered wasn't a number, I'm afraid, or at least not in the right format.");
        }
    }
}
