import java.util.Scanner;

public class W04D01E01_DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int dividor = scanner.nextInt();
        int dividend = 10;
        try {
            System.out.println(dividend + " divided by your number equals: " + dividend / dividor);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("fail");
        } finally {
            System.out.println("This code has finished running.");
        }
    }
}
