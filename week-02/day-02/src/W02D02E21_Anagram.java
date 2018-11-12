import java.util.Arrays;

public class W02D02E21_Anagram {
    public static void main(String[] args) {
        // Create a function to check if the two inputs it receives are anagrams of each other
        System.out.println(anagram("god", "dog"));
    }

    public static boolean anagram(String inputA, String inputB) {
        boolean isAnagram = false;
        if (inputA.length() != inputB.length()) {
            isAnagram = false;
        } else {
            String[] inA = new String[inputA.length()];
            String[] inB = new String[inputB.length()];
            for (int i = 0; i < inputA.length(); i++) {
                inA[i] = inputA.substring(i, i + 1);
            }
            for (int j = 0; j < inputB.length(); j++) {
                inB[j] = inputB.substring(j, j + 1);
            }
            Arrays.sort(inA);
            Arrays.sort(inB);
            String sortedA = "";
            String sortedB = "";
            for (int k = 0; k < inA.length; k++) {
                sortedA = sortedA + inA[k];
            }
            for (int l = 0; l < inB.length; l++) {
                sortedB = sortedB + inB[l];
            }
            if (sortedA.equals(sortedB)) {
                isAnagram = true;
            }
            System.out.println(sortedA + " " + sortedB);
            System.out.println(Arrays.toString(inA));
            System.out.println(Arrays.toString(inB));
        }
        return isAnagram;
    }
    //  Alternative solution: slice up the strings into letters, which are actually stored as numbers, which can be sorted and the results compared (the elements of the arrays one-by-one)
}
