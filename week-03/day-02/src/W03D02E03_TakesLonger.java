public class W03D02E03_TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        StringBuilder quoteSB = new StringBuilder(quote);

        quoteSB.insert(21, "always takes longer than ");
        quote = quoteSB.toString();

        System.out.println(quote);

        quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder quoteSB2 = new StringBuilder(quote);
        quoteSB2.insert(quote.indexOf("you"), "always takes longer than ");
        quote = quoteSB2.toString();

        System.out.println(quote);
    }
}
