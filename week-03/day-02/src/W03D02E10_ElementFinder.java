import java.util.*;

public class W03D02E10_ElementFinder {
    public static void main(String... args){
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

        arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven2(arrayList));

    }

    public static String containsSeven(ArrayList inpAL) {
        String message = "";
        if (inpAL.contains(7)) {
            message = "Hoorray";
        } else message = "Nooooo";
        return message;
    }

    public static String containsSeven2(ArrayList inpAL2) {
        String message2 = "Nooooo";
        for (int i = 0; i < inpAL2.size(); i++) {
            if (inpAL2.get(i).equals(7)) {
                message2 = "Hooray";
            }
        }
        return message2;
    }
}
