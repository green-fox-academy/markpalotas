package SubInt;

import java.util.ArrayList;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and a list of numbers as a parameter
        //  Returns the indeces of the numbers in the list where the first number is part of
        //  Returns an empty list if the number is not part any of the numbers in the list

        //  Example:
        System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
        //  should print: `[0, 1, 4]`
        System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
        //  should print: '[]'
        System.out.println(subInt(11, new int[]{1, 11, 111, 666, 655116666, 811, 9, 5}));
    }

    public static List<Integer> subInt(int toFind, int[] findIn) {
        List<Integer> indeces = new ArrayList<>();
        int digitsInToFind = (int) (Math.log10(toFind) + 1);
        for (int i = 0; i < findIn.length; i++) {
            int digitsInFindIn = (int) (Math.log10(findIn[i]) + 1);
            if (digitsInFindIn == digitsInToFind && toFind == findIn[i]) {
                indeces.add(i);
            } else if (digitsInFindIn > digitsInToFind) {
                for (int j = 0; j < digitsInFindIn - digitsInToFind + 1; j++) {
                    int findInTransformed;
                    findInTransformed = findIn[i] - ((int) (Math.pow(10, digitsInFindIn - j)) * (findIn[i] / (int) (Math.pow(10, digitsInFindIn - j))));
                    findInTransformed = findInTransformed / (int) (Math.pow(10, digitsInFindIn - digitsInToFind - j));
                    if (findInTransformed == toFind && i != indeces.get(indeces.size() - 1)) {
                        indeces.add(i);
                    }
                }
            }
        }
        return indeces;
    }
}