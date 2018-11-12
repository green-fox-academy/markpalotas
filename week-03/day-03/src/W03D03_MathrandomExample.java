import java.util.*;

public class W03D03_MathrandomExample {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Integer randomDouble = (int) (Math.random() * 50 + 1);
            System.out.println(randomDouble);
        }
    }
}
