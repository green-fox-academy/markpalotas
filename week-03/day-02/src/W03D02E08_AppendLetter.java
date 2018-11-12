import java.util.*;

public class W03D02E08_AppendLetter {
    public static void main(String... args){
            List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
            // Create a method called "appendA()" that adds "a" to every string in the "far" list.
            // The parameter should be a list.

            System.out.println(appendA(far));
    }

    public static List appendA(List inpList) {
        for (int i = 0; i < inpList.size(); i++) {
            String tmp = inpList.get(i).toString() + "a";
            inpList.set(i, tmp);
        }
        return inpList;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
