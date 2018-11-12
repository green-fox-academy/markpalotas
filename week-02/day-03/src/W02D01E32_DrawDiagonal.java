import java.util.Scanner;

public class W02D01E32_DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("What should be the height of your square?");

        int sqHeight = scanner.nextInt();

        for (int i = 0; i < sqHeight; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int i = 0; i < sqHeight - 2; i++) {
            System.out.print("%");
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            for (int j = 0; j < sqHeight - 3 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println();
        }
        for (int i = 0; i < sqHeight; i++) {
            System.out.print("%");
        }
    }
}
