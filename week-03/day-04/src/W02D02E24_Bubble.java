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
    }

    public static int[] bubble(int[] toBeSorted) {
        for (int i = 0; i < toBeSorted.length - 1; i++) {
            for (int j = 0; j < toBeSorted.length - 1; j++) {
                if (toBeSorted[j] > toBeSorted[j + 1]) {
                    int tmp = toBeSorted[j + 1];
                    toBeSorted[j + 1] = toBeSorted[j];
                    toBeSorted[j] = tmp;
                }
            }
        }
        return toBeSorted;
    }
}