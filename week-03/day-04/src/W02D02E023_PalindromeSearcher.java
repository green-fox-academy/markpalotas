import java.util.Scanner;

public class W02D02E023_PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string of characters and I'll see if there are any palindrome sections in it:");
        String input = scanner.nextLine();
    }

    public static String searchPalindrome(String inpStr) {
        String palindromes = "";

        return palindromes;
    }

    public static String checkPalindrome(String inpStr) {
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
        return palindrome;
    }
}
