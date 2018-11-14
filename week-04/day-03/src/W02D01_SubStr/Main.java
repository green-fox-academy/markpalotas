package W02D01_SubStr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(subStringFinder("this is it this is it", "this"));
    }

    public static List<Integer> subStringFinder(String findIn, String findWhat) {
        List<Integer> foundWhere = new ArrayList<>();
        if (!findIn.contains(findWhat)) {
            foundWhere.add(-1);
        } else {
            for (int i = 0; i < findIn.length() - findWhat.length() + 1; i++) {
                if (findWhat.equals(findIn.substring(i, i + findWhat.length()))) {
                    foundWhere.add(i);
                }
            }
        }
        return foundWhere;
    }
}
