package Test_Sum;

import java.util.ArrayList;

public class MyArrayList {

    public Integer sum(ArrayList<Integer> myArrayList) {
        if (myArrayList.isEmpty()) {
            return null;
        } else {
            Integer sum = 0;
            for (int i = 0; i < myArrayList.size(); i++) {
                sum = sum + myArrayList.get(i);
            }
            return sum;
        }
    }
}
