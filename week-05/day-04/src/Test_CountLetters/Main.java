package Test_CountLetters;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(LettersToCount.countTheLetters("aaabbbcccddde"));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You provided an empty string - I can't work with that, unfortunately.");
        } catch (NullPointerException e) {
            System.out.println("You didn't provide a string for me to work with.");
        }
//        System.out.println(LettersToCount.countTheLetters("aaaabbbbccccde"));
//        System.out.println(LettersToCount.countTheLetters("aabbcaabbcde"));
//        System.out.println(LettersToCount.countTheLetters("abcdeabcdeabcde"));
//        System.out.println(LettersToCount.countTheLetters(""));
//        System.out.println(LettersToCount.countTheLetters("a"));
//        System.out.println(LettersToCount.countTheLetters(null));
    }
}
