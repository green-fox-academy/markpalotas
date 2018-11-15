package W04D04E1_Recursion_Exercises;

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }

    public static int power(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base * power(base, n - 1);
        }
    }
}
