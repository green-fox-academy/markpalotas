import java.util.Scanner;

public class E28DrawTriangle {
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

        for (int i = 1; i < (yourNum + 1); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // A simpler solution (hopefully a working one)

        System.out.println("Please enter another number:");

        yourNum = scanner.nextInt();

        String star = "*";

        for (int i = 1; i < (yourNum + 1); i++) {
            System.out.print(star + "\n");
            star = star + "*";
            }
    }
}
