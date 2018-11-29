package ReversedOrder;

import java.util.ArrayList;
import java.util.List;
import Doubled.Doubled;

public class ReversedOrder {
    public static void main(String[] args) {
        List<String> decrypted = reverseOrderOfElements(Doubled.readFile(Doubled.askForPath("input")));
        Doubled.writeFile(Doubled.askForPath("output"), decrypted);
    }

    public static List<String> reverseOrderOfElements(List<String> input) {
        List<String> output = new ArrayList<>();
        for (int i = input.size() - 1; i > -1; i--) {
            output.add(input.get(i));
        }
        return output;
    }
}
