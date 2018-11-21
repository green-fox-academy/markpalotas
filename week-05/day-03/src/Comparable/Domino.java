package Comparable;

import java.util.Arrays;

public class Domino implements Comparable {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }


    @Override
    public int compareTo(Object o) {
        if (getLeftSide() < ((Domino)(o)).getLeftSide()) {
            return -2;
        } else if (getLeftSide() > ((Domino)(o)).getLeftSide()) {
            return 2;
        } else {
            if (getRightSide() < ((Domino)(o)).getRightSide()) {
                return -1;
            } else if (getRightSide() > ((Domino)(o)).getRightSide()) {
                return 1;
            } else {
                return 0;
            }
        }
    }


}