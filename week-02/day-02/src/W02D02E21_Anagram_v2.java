import java.lang.reflect.Array;
import java.util.*;

public class W02D02E21_Anagram_v2 {
    public static void main(String[] args) {
        // Create a function to check if the two inputs it receives are anagrams of each other

        //  Alternative solution: slice up the strings into letters, which are actually stored as numbers, which can be sorted and the results compared (the elements of the arrays one-by-one)

//        Character[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//        System.out.println(Arrays.asList(alphabet));
//
//        for (int i = 0; i < alphabet.length; i++) {
//            int charAsNum = alphabet[i];
//            System.out.println(charAsNum);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word1 = scanner.nextLine();
        System.out.println("Now another one:");
        String word2 = scanner.nextLine();

        if (anagram(word1, word2) == true) {
            System.out.println("These two words are anagrams.");
        } else {
            System.out.println("No luck this time. These two words aren't anagrams.");
        }
    }

    public static Boolean anagram(String w1, String w2) {
        Boolean isAnagram = false;
        if (w1.length() != w2.length()) {
            isAnagram = false;
        } else {
            int[] arrW1 = new int[w1.length()];
            int[] arrW2 = new int[w2.length()];
            for (int i = 0; i < w1.length(); i++) {
                arrW1[i] = w1.charAt(i);
            }
            for (int i = 0; i < w2.length(); i++) {
                arrW2[i] = w2.charAt(i);
            }
            sortIntArray(arrW1);
            sortIntArray(arrW2);
            isAnagram = true;
            for (int i = 0; i < arrW1.length; i++) {
                if (arrW1[i] != arrW2[i]) {
                    isAnagram = false;
                }
            }
        }
        return isAnagram;
    }

    public static int[] sortIntArray(int[] arrayToBeSorted) {
        int counter = 0;
        do {
            for (int i = 0; i < arrayToBeSorted.length - 1; i++) {
                if (arrayToBeSorted[i] > arrayToBeSorted[i + 1]) {
                    int tmp = arrayToBeSorted[i + 1];
                    arrayToBeSorted[i + 1] = arrayToBeSorted[i];
                    arrayToBeSorted[i] = tmp;
                    counter = 0;
                }
                if (arrayToBeSorted[i] <= arrayToBeSorted[i + 1]) {
                    counter = ++counter;
                }
            }
        } while (counter < arrayToBeSorted.length - 1);
        return arrayToBeSorted;
    }
}
