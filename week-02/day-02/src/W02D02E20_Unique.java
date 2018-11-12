import java.util.Arrays;

public class W02D02E20_Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        int[] mylist = {1,1,1,0,0,0,2,5,0,1,11,23,36,45,36,2,3};
//        mylist = sortIntArray(mylist);
//        System.out.println(Arrays.toString(mylist));
//        mylist = unique(mylist);
//        System.out.println(Arrays.toString(mylist));
        System.out.println(Arrays.toString(unique(sortIntArray(mylist))));
    }

    public static int[] unique(int[] inputList) {
        int counter = 0;
        for (int i = 0; i < inputList.length - 1; i++) {
            if (inputList[i] == inputList[i + 1]) {
                counter = ++counter;
            }
        }
        int[] uniqueList = new int[inputList.length - counter];
        int e = 0;
        for (int i = 0; i < inputList.length - 1; i++) {
            if (inputList[i] != inputList[i + 1]) {
                uniqueList[e] = inputList[i];
                e = ++e;
            }
        }
        uniqueList[uniqueList.length - 1] = inputList[inputList.length - 1];
        return uniqueList;
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
