import java.util.Scanner;

public class E17AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        int intEntered = 0;

        for (int c = 1; c < 6; c++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter an integer: ");

            intEntered = intEntered += scanner.nextInt();
        }

        System.out.println("The sum of the numbers you have just entered is " + intEntered + " and their average equals " + (intEntered/5) + ".");
    }
}
