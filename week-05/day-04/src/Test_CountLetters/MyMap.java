package Test_CountLetters;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MyMap {

    public static Map<Character, Integer> combineTwoListsIntoMap(List<Character> charList, List<Integer> intList) {
        if (charList.size() != intList.size()) {
            throw new IllegalArgumentException("Cannot combine lists of unequal sizes");
        } else {
            Map<Character, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < charList.size(); i++) {
                map.put(charList.get(i), intList.get(i));
            }
            return map;
        }
    }
}
