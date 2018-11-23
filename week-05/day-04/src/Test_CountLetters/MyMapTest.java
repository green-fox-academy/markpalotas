package Test_CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMapTest {
    List<Character> list1;
    List<Integer> list2;
    Map<Character, Integer> map;

//    @Test
//    void combineUnequalSizes() {
//        list1 = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
//        list2 = new ArrayList<>(Arrays.asList(1, 2));
//        assertEquals(MyMap.combineTwoListsIntoMap(list1, list2), map);
//    }

    @Test
    void combineUnequalSizes() {
        list1 = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        map = new LinkedHashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        assertEquals(MyMap.combineTwoListsIntoMap(list1, list2), map);
    }
}