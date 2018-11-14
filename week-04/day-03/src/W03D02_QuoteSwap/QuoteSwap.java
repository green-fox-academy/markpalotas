package W03D02_QuoteSwap;

import java.util.*;

public class QuoteSwap{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    public static String quoteSwap(ArrayList<String> list) {
        ArrayList<String> correctList = new ArrayList<>(Arrays.asList("What", "I", "cannot", "create,", "I", "do", "not", "understand."));
        ArrayList<String> workInProgress = new ArrayList<>();
        String aux = " ";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (correctList.get(i).equals(list.get(j)) && !list.get(j).equals(aux)) {
                    workInProgress.add(list.get(j));
                    aux = list.get(j);
                }
            }
        }
        String result = "";
        for (int i = 0; i < workInProgress.size(); i++) {
            result = result + workInProgress.get(i) + " ";
        }
        return result;
    }
}