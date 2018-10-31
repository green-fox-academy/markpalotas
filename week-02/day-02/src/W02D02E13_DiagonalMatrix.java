import java.util.Arrays;

public class W02D02E13_DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix[0].length; i++) {
            matrix[i][i] = 1;
        }

        System.out.println(Arrays.deepToString(matrix));

        System.out.println("Another representation: ");

        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
 }

