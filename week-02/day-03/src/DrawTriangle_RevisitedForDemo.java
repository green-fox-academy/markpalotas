import java.util.Scanner;

public class DrawTriangle_RevisitedForDemo {
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

        String star2 = "*";

        for (int i = 1; i < (yourNum + 1); i++) {
            System.out.print(star2 + "\n");
            star2 = star2 + "*";
        }
//
//        // And yet another solution that first "collects" the stars to be printed out in the respective variable
//        // TO BE WORKED ON
//
//        System.out.println("Please enter another number:");
//
//        yourNum = scanner.nextInt();
//
//        String star1 = "*";
//
//        for (int i = 1; i < (yourNum + 1); i++) {
//            System.out.print(star1 + "\n");
//            star1 = star1 + "*";
//        }
//
//        // Reproducing first attempts
//
        System.out.println("Please enter a number:");

        yourNum = scanner.nextInt();

        for (int i = 1; i < (yourNum + 1); i++) {
                System.out.print("*");
            }
            System.out.println();


        System.out.println("Please enter a number:");

        yourNum = scanner.nextInt();

        for (int i = 1; i < (yourNum + 1); i++) {
            System.out.print("* \n");
        }
        System.out.println();


        System.out.println("Please enter a number:");

        yourNum = scanner.nextInt();

        for (int i = 1; i < (yourNum + 1); i++) {
            for (int j = 1; j < yourNum + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        System.out.println("Please enter a number:");

        yourNum = scanner.nextInt();

        for (int i = 1; i < (yourNum + 1); i++) {
            for (int j = yourNum; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        }
    }


