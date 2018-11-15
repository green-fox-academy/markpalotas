package W04D04E1_Recursion_Exercises;

// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigit(356));
    }

    public static int sumDigit(int n) {
        if (n < 10) {
            return n%10;
        } else {
            return n % 10 + sumDigit(n / 10);
        }
    }
}
