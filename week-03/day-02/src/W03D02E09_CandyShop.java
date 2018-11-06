import java.lang.reflect.Array;
import java.util.*;

public class W03D02E09_CandyShop {
    public static void main(String... args){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

//        if (arrayList.get(1) instanceof Integer) {
//            System.out.println("Integer");
//        }
//        if (arrayList.get(3) instanceof Boolean) {
//            System.out.println("Boolean");
//        }

        System.out.println(sweets(arrayList));
//         Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

        arrayList.clear();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);

        System.out.println(sweets2(arrayList));
    }

    public static ArrayList<String> sweets(ArrayList<Object> inpAL) {
        ArrayList<String> correct = new ArrayList<String>();
        for (int i = 0; i < inpAL.size(); i++) {
            if (inpAL.get(i) instanceof Integer) {
                correct.add("Croissant");
            } else if (inpAL.get(i) instanceof Boolean) {
                correct.add("Ice cream");
            } else correct.add(inpAL.get(i).toString());
        }
        return correct;
    }

    public static ArrayList<Object> sweets2(ArrayList<Object> inpAL2) {
        for (int i = 0; i < inpAL2.size(); i++) {
            if (inpAL2.contains(2)) {
                inpAL2.set(inpAL2.indexOf(2), "Croissant");
            } else if (inpAL2.contains(false)) {
                inpAL2.set(inpAL2.indexOf(false), "Ice cream");
            }
        }
        return inpAL2;
    }
}
