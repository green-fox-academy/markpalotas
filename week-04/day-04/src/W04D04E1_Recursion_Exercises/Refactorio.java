package W04D04E1_Recursion_Exercises;

public class Refactorio {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(refactorio(i));
        }
    }

    public static int refactorio(int n) {
        if (n == 0) {
            return 1;
        } else {
             return n * refactorio(n - 1);
        }
    }
}
