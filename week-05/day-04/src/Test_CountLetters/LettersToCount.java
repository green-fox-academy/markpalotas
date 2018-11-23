package Test_CountLetters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LettersToCount {
    public static Map countTheLetters(String str) {
        if (str.equals("")) {
            throw new IndexOutOfBoundsException();
        }
        char[] stringAsChar = str.toCharArray();
        Arrays.sort(stringAsChar);
        List<Character> charList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        int letterCounter = 1;
        if (str.length() == 1) {
            charList.add(stringAsChar[0]);
            countList.add(letterCounter);
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (!charList.contains(stringAsChar[i])) {
                    charList.add(stringAsChar[i]);
                }
            }
            for (int j = 0; j < str.length() - 1; j++) {
                if (stringAsChar[j] == stringAsChar[j + 1]) {
                    letterCounter++;
                    if (j + 1 == str.length() - 1) {
                        countList.add(letterCounter);
                    }
                } else {
                    countList.add(letterCounter);
                    letterCounter = 1;
                    if (j + 1 == str.length() - 1) {
                        countList.add(1);
                    }
                }
            }
        }
        return MyMap.combineTwoListsIntoMap(charList, countList);
    }
}
