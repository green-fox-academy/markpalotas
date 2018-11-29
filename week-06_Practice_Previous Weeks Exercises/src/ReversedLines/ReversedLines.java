package ReversedLines;

import Doubled.Doubled;

import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        List<String> decrypted = decryptReversedText(Doubled.readFile(Doubled.askForPath("input")));
        Doubled.writeFile(Doubled.askForPath("output"), decrypted);
    }

    public static String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i > -1; i--) {
            output = output + input.substring(i, i + 1);
        }
        return output;
    }

    public static List<String> decryptReversedText(List<String> reversed) {
        List<String> decrypted = new ArrayList<>();
        for (String line : reversed) {
            decrypted.add(reverseString(line));
        }
        return decrypted;
    }
}
