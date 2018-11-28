package Armstrong_Number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        printResult(checkIfArmstrong(askForNumber()));
    }

    public static List<Integer> getDigits(int number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        return digits;
    }

    public static int generateSumOfPowers(List<Integer> input) {
        double sumOfPowers = 0;
        for (int i = 0; i < input.size(); i++) {
            sumOfPowers = sumOfPowers + Math.pow(input.get(i), input.size());
        }
        return (int) sumOfPowers;
    }

    public static boolean checkIfArmstrong(int number) {
        return number == generateSumOfPowers(getDigits(number));
    }

    public static int askForNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your candidate for the 'Armstrong number' title:");
        int number = scanner.nextInt();
        return number;
    }

    public static void printResult(boolean ifArmstrong) {
        String a = "an Armstrong number.";
        String result = (ifArmstrong) ? "This is indeed " : "Sorry, this isn't ";
        System.out.println(result + a);
    }
}
