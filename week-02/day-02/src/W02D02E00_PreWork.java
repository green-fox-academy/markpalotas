import java.util.Scanner;
import java.util.Arrays;

public class W02D02E00_PreWork {
    public static void main(String[] args) {
        int[] myFirstArray = new int[10];
        for (int i = 0; i < myFirstArray.length; i++) {
            myFirstArray[i] = i;
        }
        System.out.println(Arrays.toString(myFirstArray));
        System.out.println(myFirstArray.toString());
        int b = 7;
        System.out.println(b);
        System.out.println();
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);

        System.out.println("///////////////////");

        Integer x = 5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));

        int matrix[][] = new int[4][5];
        System.out.println(matrix.length + " " + matrix[0].length);
        }
}
