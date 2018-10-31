import java.util.Scanner;

public class W02D01E15MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the distance (rounded to the next km) that you wish to convert to miles: ");

        int distInKm = scanner.nextInt();

        System.out.println("This distance expressed in miles is:" + (distInKm * .621371));
    }
}