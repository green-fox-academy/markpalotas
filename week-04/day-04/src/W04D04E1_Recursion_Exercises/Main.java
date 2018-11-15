package W04D04E1_Recursion_Exercises;

// Write a recursive function that takes one parameter: n and counts down from n.

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveCounter(10));
    }

    public static String recursiveCounter(int n) {
        if (n == 0) {
            return "0\n";
        } else {
            return n + "\n" + recursiveCounter(n-1);
        }
    }
}
