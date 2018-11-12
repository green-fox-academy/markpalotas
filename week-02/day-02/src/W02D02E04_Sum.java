public class W02D02E04_Sum {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Write a function called `sum` that sum all the numbers
        //   until the given parameter and returns with an integer
        System.out.println(sum(10));
        }

    public static int sum(int parA) {
        int sum = 0;
        for (int i = parA; i > 0; i--) {
            sum = sum + i;
        }
        return sum;
    }
}
