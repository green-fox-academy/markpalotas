package Test_CountLetters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LettersToCount {
//    does not work if there are multiple instances of the last character in the sorted CharArray
    public static Map countTheLetters(String str) {
        char[] stringAsChar = str.toLowerCase().toCharArray();
        Arrays.sort(stringAsChar);
        System.out.println(stringAsChar);
        List<Character> charList = new ArrayList<>();
        List<Integer> countList = new ArrayList<>();
        int letterCounter = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (stringAsChar[i] == stringAsChar[i + 1]) {
                letterCounter++;
            } else {
                charList.add(stringAsChar[i]);
                countList.add(letterCounter);
                letterCounter = 1;
            }
        }
        if (charList.size() <= 1) {
            charList.add(stringAsChar[stringAsChar.length - 1]);
            countList.add(1);
        } else if (stringAsChar[stringAsChar.length - 1] == stringAsChar[stringAsChar.length - 2]) {
            countList.set(countList.size() - 1, countList.get(countList.size() - 1) + 1);
        } else {
            charList.add(stringAsChar[stringAsChar.length - 1]);
            countList.add(1);
        }
        return MyMap.combineTwoListsIntoMap(charList, countList);
    }
}
