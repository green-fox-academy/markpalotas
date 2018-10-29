import java.util.Scanner;
import java.util.Arrays;

public class PreWork {
    public static void main(String[] args) {
        int[] myFirstArray = new int[10];
        for (int i = 0; i < myFirstArray.length; i++) {
            myFirstArray[i] = i;
        }
        System.out.println(Arrays.toString(myFirstArray));
        int a = 5;
        System.out.println(a++);
        System.out.println(++a);
    }
}
