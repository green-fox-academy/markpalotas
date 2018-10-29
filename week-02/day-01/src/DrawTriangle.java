import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int yourNum = scanner.nextInt();

        for (int i = 1; i < (yourNum+1); i++) {
            for (int j = i; j < (yourNum + 1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}