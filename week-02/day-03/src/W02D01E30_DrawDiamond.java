import java.util.Scanner;

public class W02D01E30_DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("How high a diamond would you like? Please enter a number:");

        int dHeight = scanner.nextInt();

        String pyr = "*";

        for (int i = 0; i < ((dHeight-1)/2)+1; i++) {
            for (int j = 0; j < ((dHeight-1)/2) - i; j++) {
                System.out.print(" ");
            }
            System.out.println(pyr);
            pyr = pyr + "**";
        }
        pyr = pyr.substring(1, pyr.length() - 1);

        for (int i = 0; i < ((dHeight - 1) / 2); i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            pyr = pyr.substring(1, pyr.length() - 1);
            System.out.println(pyr);
        }

        System.out.println("How high a diamond would you like? Please enter a number:");

        dHeight = scanner.nextInt();

        for (int i = 0; i < ((dHeight + 1) / 2); i++) {
            for (int j = 0; j < ((dHeight - 1) / 2) - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < ((dHeight - 1) / 2); i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (dHeight - 2) - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
