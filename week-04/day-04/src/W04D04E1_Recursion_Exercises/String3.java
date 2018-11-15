package W04D04E1_Recursion_Exercises;

// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
    public static void main(String[] args) {
        System.out.println(string1("CsUpAcSiLlAg"));
        System.out.println(string2("CsUpAcSiLlAg"));
    }

    public static String string1(String string) {
        if (string.equals("")) {
            return string;
        } else {
            return string.substring(0,1) + "*" + string1(string.substring(1));
        }
    }

    public static String string2(String string) {
        if (string.length() == 1) {
            return string;
        } else {
            return string.substring(0, 1) + "*" + string2(string.substring(1));
        }
    }
}
