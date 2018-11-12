import java.util.Arrays;

public class W02D02E24_Bubble {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending

        //  Example:
//        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
//        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        int[] myArray = {34, 12, 24, 9, 5, 0, 0, 34, 49, 62, 9};
        System.out.println(Arrays.toString(bubble(myArray)));
        System.out.println(Arrays.toString(advancedBubble(myArray, true)));
    }

    public static int[] bubble(int[] toBeSorted) {
        int[] sorted = new int[toBeSorted.length];
        for (int i = 0; i < toBeSorted.length; i++) {
            sorted[i] = toBeSorted[i];
        }
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int tmp = sorted[j + 1];
                    sorted[j + 1] = sorted[j];
                    sorted[j] = tmp;
                }
            }
        }
        return sorted;
    }

    public static int[] advancedBubble(int[] toBeSorted, Boolean descend) {
        int[] presorted = new int[toBeSorted.length];
        int[] sorted = new int[toBeSorted.length];
        for (int i = 0; i < toBeSorted.length; i++) {
            presorted[i] = bubble(toBeSorted)[i];
        }
        if (descend == true) {
            for (int i = 0; i < toBeSorted.length; i++) {
                sorted[i] = presorted[toBeSorted.length - 1 - i];
            }
        } else {
            sorted = presorted;
        }
        return sorted;
    }
}