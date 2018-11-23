package Test_CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LettersToCountTest {
    private String testString;
    private Map<Character, Integer> map;

    @BeforeEach
    public void resetTestVar() {
        map = new LinkedHashMap<>();
    }

//    @Test
//    void testNullString() {
//        testString = null;
//        assertThrows(NullPointerException);
//    }
//
//    @Test
//    void testEmptyString() {
//        testString = "";
//        assertThrows(IndexOutOfBoundsException);
//    }

    @Test
    void testStringLength1() {
        testString = "a";
        map.put('a', 1);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }

    @Test
    void testStringAllLowercase() {
        testString = "abc";
        map.put('a', 1);
        map.put('b', 1);
        map.put('c', 1);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }

    @Test
    void testStringAllUpperCase() {
        testString = "ABC";
        map.put('A', 1);
        map.put('B', 1);
        map.put('C', 1);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }

    @Test
    void testStringMixedCase() {
        testString = "aAbBcC";
        map.put('a', 1);
        map.put('A', 1);
        map.put('b', 1);
        map.put('B', 1);
        map.put('c', 1);
        map.put('C', 1);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }

    @Test
    void testStringWithRepetition() {
        testString = "aabbc";
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 1);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }

    @Test
    void testStringWithLastCharRep() {
        testString = "aabbcccc";
        map.put('a', 2);
        map.put('b', 2);
        map.put('c', 4);
        assertEquals(LettersToCount.countTheLetters(testString), map);
    }
}