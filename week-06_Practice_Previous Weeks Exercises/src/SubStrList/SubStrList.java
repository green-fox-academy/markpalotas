package SubStrList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubStrList {
    public static void main(String[] args) {
        //  Create a function that takes a string and a list of string as a parameter
        //  Returns the index of the string in the list where the first string is part of
        //  Only need to find the first occurence and return the index of that
        //  Returns `-1` if the string is not part any of the strings in the list

        //  Example

        String[] searchArr = new String[] {"this", "is", "what", "I'm", "searching is"};
        System.out.println(subStrList("is", searchArr).toString());
        System.out.println(subStrListWithContains("is", searchArr).toString());

        //  should print: `4`

        System.out.println(subStrList("not", searchArr).toString());
        System.out.println(subStrListWithContains("not", searchArr).toString());

        //  should print: `-1`
    }

    public static List<Integer> subStrList(String toFind, String[] toSearchIn) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < toSearchIn.length; i++) {
            if (isSubstringManual(toFind, toSearchIn[i])[0] == 1) {
                indices.add(i);
            }
        }
        if (indices.isEmpty()) {
            indices.add(-1);
        }
        return indices;
    }

    public static List<Integer> subStrListWithContains(String toFind, String[] toSearchIn) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < toSearchIn.length; i++) {
            if (isSubstring(toFind, toSearchIn[i])) {
                indices.add(i);
            }
        }
        if (indices.isEmpty()) {
            indices.add(-1);
        }
        return indices;
    }

    public static int[] isSubstringManual(String toCheck, String toCheckIn) {
        int[] result = new int[2];
        int counter = 0;
        if (toCheck.length() <= toCheckIn.length()) {
            for (int i = 0; i < toCheckIn.length() - toCheck.length() + 1; i++) {
                if (toCheck.equals(toCheckIn.substring(i, i + toCheck.length()))) {
                    result[0] = 1;
                    result[1] = ++counter;
                }
            }
        }
        return result;
    }

    public static boolean isSubstring(String toCheck, String toCheckIn) {
        return (toCheckIn.contains(toCheck));
    }
}