package Test_Anagram;

import java.util.Arrays;

public class PotentialAnagrams {

    public static boolean isAnagram(String str1, String str2) {
        char[] charStr1 = str1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] charStr2 = str2.replaceAll("\\s+", "").toLowerCase().toCharArray();
        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        return Arrays.equals(charStr1, charStr2);
    }
}
