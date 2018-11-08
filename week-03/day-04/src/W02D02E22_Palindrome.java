import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class W02D02E22_Palindrome {
    //    Create a function named create palindrome following your current language's style guide. It should take a string, create a palindrome from it and then return it.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any string of characters:");
        String input = scanner.nextLine();
        System.out.println("The palindrome of your string is");
        System.out.println(createPalindrome(input));
    }

    public static String createPalindrome(String inpStr) {
        String palindrome = "";
        Character[] inpArray = new Character[inpStr.length()];
        for (int i = 0; i < inpStr.length(); i++) {
            inpArray[i] = inpStr.charAt(i);
        }
//        Potentially UNNECESSARY complication
//        Character[] palArray = new Character[inpArray.length];
//        for (int i = 0, j=inpArray.length-1; i < inpArray.length; i++, j--) {
//            palArray[i] = inpArray[j];
//        }
        for (int i = inpArray.length-1; i >-1; i--) {
            palindrome = palindrome + inpArray[i];
        }
        palindrome = inpStr + palindrome;
        return palindrome;
    }
}
