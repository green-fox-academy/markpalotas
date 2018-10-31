import java.util.Arrays;

public class W02D02E19_Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `aj`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `aj`
        // - Print the elements of the reversed `aj`
        int[] aj = {3, 4, 5, 6, 7};
        int[] rev = new int[5];
        for (int i = 0, j = 4; i < aj.length && j > -1; i++, j--) {
            rev[j] = aj[i];
        }
        System.out.println(Arrays.toString(rev));

        // Potential improvement: how to solve without creating a new array
    }
}
