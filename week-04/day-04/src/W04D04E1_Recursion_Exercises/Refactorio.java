package W04D04E1_Recursion_Exercises;

public class Refactorio {
    public static void main(String[] args) {
        System.out.println(refactorio(5));
    }

    public static int refactorio(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * refactorio(n - 1);
        }
    }
}
