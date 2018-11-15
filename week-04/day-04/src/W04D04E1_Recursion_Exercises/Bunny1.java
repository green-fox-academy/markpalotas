package W04D04E1_Recursion_Exercises;

// We have a number of bunnies and each bunny2 has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

public class Bunny1 {
    public static void main(String[] args) {
        System.out.println(bunny(15));
    }

    public static int bunny(int n) {
        if (n == 1) {
            return 2;
        } else {
            return 2 + bunny(n - 1);
        }
    }
}
