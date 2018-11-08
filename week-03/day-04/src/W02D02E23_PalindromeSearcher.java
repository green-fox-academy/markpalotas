import java.util.Scanner;

public class W02D02E23_PalindromeSearcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string of characters and I'll see if there are any palindrome sections in it:");
        String input = scanner.nextLine();
        System.out.println("I found the following palindromes:");
        System.out.println(searchPalindrome(input));
    }

    public static String searchPalindrome(String inpStr) {
        String palindromes = "";
        for (int i = 3; i <= inpStr.length(); i++) {
            for (int j = 0; j < inpStr.length() - i + 1; j++) {
                String subStr = inpStr.substring(j, j + i);
                if (subStr.equals(checkPalindrome(subStr))) {
                    palindromes = palindromes + " " + subStr;
                }
            }
        }
//        if (inpStr.substring(0, 3).equals(checkPalindrome(inpStr.substring(0, 3)))) {
//            palindromes = inpStr.substring(0, 3);
//        }
        return palindromes;
    }

    public static String checkPalindrome(String inpStr) {
        String palindrome = "";
        Character[] inpArray = new Character[inpStr.length()];
        for (int i = 0; i < inpStr.length(); i++) {
            inpArray[i] = inpStr.charAt(i);
        }
        for (int i = inpArray.length-1; i >-1; i--) {
            palindrome = palindrome + inpArray[i];
        }
        return palindrome;
    }
}
