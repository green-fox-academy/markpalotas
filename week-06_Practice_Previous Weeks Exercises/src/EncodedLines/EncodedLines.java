package EncodedLines;

import Doubled.Doubled;

import java.util.List;
import java.util.Scanner;
import Doubled.Doubled;

public class EncodedLines {
    public static void main(String[] args) {
        List<String> decrypted = decryptCharShiftedText(Doubled.readFile(Doubled.askForPath("input")), askForByHowMuch());
        Doubled.writeFile(Doubled.askForPath("output"), decrypted);
    }

    public static String shiftCharacters(String input, int byHowMuch) {
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            if ((int) (inputArray[i]) != 32) {
                inputArray[i] = (char) ((int) inputArray[i] + byHowMuch);
            }
        }
        return new String(inputArray);
    }

    public static List<String> decryptCharShiftedText(List<String> input, int byHowMuch) {
        for (int i = 0; i < input.size(); i++) {
            input.set(i, shiftCharacters(input.get(i), byHowMuch));
        }
        return input;
    }

    public static int askForByHowMuch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter by how much the characters in the text to be decrypted need to be shifted to arrive at the original text:");
        int byHowMuch = scanner.nextInt();
        return byHowMuch;
    }
}
