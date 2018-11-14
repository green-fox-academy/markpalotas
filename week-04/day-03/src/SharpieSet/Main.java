package SharpieSet;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SharpieSet set1 = new SharpieSet();
        set1.add(new Sharpie("green", 2));
        set1.add(new Sharpie("red", 5));
        set1.add(new Sharpie("blue", 4));
        set1.add(new Sharpie("green", 3));
        set1.add(new Sharpie("red", 10));
        set1.add(new Sharpie("blue", 11));
        for (Sharpie sharpie : set1.sharpies) {
            sharpie.inkAmount = (int) (Math.random() * (1 + 1));
        }
        for (Sharpie sharpie : set1.sharpies) {
            System.out.println(sharpie.inkAmount);
        }
        System.out.println(set1.countUsable());
        set1.removeTrash();
        System.out.println(set1);
    }
}
