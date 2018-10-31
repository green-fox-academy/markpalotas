import java.util.Scanner;

public class W02D01E29_DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("How high a pyramid would you like? Please enter a number");

        int pHeight = scanner.nextInt();

        String pyr = "*";

        for (int i = 0; i < pHeight; i++) {
            for (int j = 0; j < pHeight - i; j++) {
                System.out.print(" ");
            }
            System.out.println(pyr);
            pyr = pyr + "**";
        }

        System.out.println("How high a pyramid would you like? Please enter a number:");

        pHeight = scanner.nextInt();

        for (int i = 0; i < pHeight; i++) {
            for (int j = 0; j < pHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            }

//        for (int i = 0, j = (pHeight - 1); i < (pHeight * 2 - 1) && j > -1; i += 2, j--) {
//            for (int j = (pHeight - i) / 2; )
    }
}
