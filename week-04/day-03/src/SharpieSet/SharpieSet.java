package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies = new ArrayList<Sharpie>();

    public int countUsable() {
        int counter = 0;
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount != 0) {
                counter++;
            }
        }
        return counter;
    }

    public List<Sharpie> removeTrash() {
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount == 0) {
                sharpies.remove(sharpie);
            }
        }
        return sharpies;
    }
}
