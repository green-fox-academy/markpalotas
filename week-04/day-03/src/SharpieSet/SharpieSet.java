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
        List<Sharpie> notTrash = new ArrayList<>();
        for (Sharpie sharpie : sharpies) {
            if (sharpie.inkAmount != 0) {
                notTrash.add(sharpie);
            }
        }
        sharpies = notTrash;
        return sharpies;
    }

    public List<Sharpie> add(Sharpie sharpie) {
        this.sharpies.add(sharpie);
        return sharpies;
    }

    @Override
    public String toString() {
        return "SharpieSet{" +
                "sharpies=" + sharpies +
                '}';
    }
}
