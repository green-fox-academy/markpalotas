package W04D04E1_Recursion_Exercises;

// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2 {
    public static void main(String[] args) {
        System.out.println(string1("XxxxyyyY"));
    }

    public static String string1(String string) {
        if (string.equals("")) {
            return string;
        } else {
            if (string.substring(0, 1).equals("x")) {
                return "" + string1(string.substring(1));
            } else {
                return string.substring(0, 1) + string1(string.substring(1));
            }
        }

    }
}
