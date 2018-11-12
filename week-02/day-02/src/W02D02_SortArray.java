import java.util.Arrays;
import java.util.Scanner;

public class W02D02_SortArray {
    public static void main(String[] args) {
        int[] myArray = {1, 20, 10, 5, 22};
        System.out.println(Arrays.toString(sortIntArray(myArray)));
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
