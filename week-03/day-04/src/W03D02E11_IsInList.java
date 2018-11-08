import java.util.*;

public class W03D02E11_IsInList{
    public static void main(String... args){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"
        ArrayList<Integer> toBeChecked = new ArrayList<>(Arrays.asList(4, 8, 12, 16));
        System.out.println(checkNums(list, toBeChecked));
    }

    public static Boolean checkNums(ArrayList<Integer> inpList, ArrayList<Integer> numList) {
        Boolean contAll = false;
        if (inpList.containsAll(numList)) {
            contAll = true;
        }
        return contAll;
    }
}