package W02_Calculator;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Calculator {
    public static void main(String... args) {
        System.out.println(calculate());

        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit
    }

    public static int calculate() {
        int[] calcArray = parseInput(askForInput());
        int result = 0;
        switch (calcArray[0]) {
            case 1:
                result = calcArray[1] + calcArray[2];
                break;
            case 2:
                result = calcArray[1] - calcArray[2];
                break;
            case 3:
                result = calcArray[1] * calcArray[2];
                break;
            case 4:
                result = calcArray[1] / calcArray[2];
                break;
            case 5:
                result = calcArray[1] % calcArray[2];
                break;
        }
        return result;
    }

    public static String askForInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in the expression in the following order: operation operand1 operand2, separated by spaces.");
        return scanner.nextLine().trim();
    }

    public static int[] parseInput(String expression) {
        int[] calcArray = new int[3];
        expression = removeMultipleSpacesInside(expression);
        String operand = expression.substring(0, 1);
        switch (operand) {
            case "+":
                calcArray[0] = 1;
                break;
            case "-":
                calcArray[0] = 2;
                break;
            case "*":
                calcArray[0] = 3;
                break;
            case "/":
                calcArray[0] = 4;
                break;
            case "%":
                calcArray[0] = 5;
                break;
        }
        calcArray[1] = Integer.parseInt(expression.substring(2, expression.indexOf(" ", 3)));
        calcArray[2] = Integer.parseInt(expression.substring(expression.indexOf(" ", 3) + 1));
        return calcArray;
    }

    public static String removeMultipleSpacesInside(String str) {
        String SpacesRemoved = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1);
            if (!temp.equals(" ")) {
                SpacesRemoved = SpacesRemoved + temp;
            } else if (!temp.equals(SpacesRemoved.substring(SpacesRemoved.length() - 1))) {
                SpacesRemoved = SpacesRemoved + temp;
            }
        }
        return SpacesRemoved;
    }
}
