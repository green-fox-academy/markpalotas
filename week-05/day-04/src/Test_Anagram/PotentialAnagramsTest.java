package Test_Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PotentialAnagramsTest {
    String s1;
    String s2;

    @Test
    void testAllLowerCaseWithoutSpace() {
        s1 = "bela";
        s2 = "abel";
        assertTrue(PotentialAnagrams.isAnagram(s1, s2));
    }

    @Test
    void testMixedCaseWithoutSpace() {
        s1 = "bElA";
        s2 = "abel";
        assertTrue(PotentialAnagrams.isAnagram(s1, s2));
    }

    @Test
    void testAllLowerCaseWithSpace() {
        s1 = "b e l a";
        s2 = "abe l";
        assertTrue(PotentialAnagrams.isAnagram(s1, s2));
    }

    @Test
    void testMixedCaseWithSpace() {
        s1 = "BE l a";
        s2 = "Ab eL";
        assertTrue(PotentialAnagrams.isAnagram(s1, s2));
    }
}