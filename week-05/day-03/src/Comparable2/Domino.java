package Comparable2;

public class Domino implements Comparable<Domino> {
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
    public int compareTo(Domino domino) {
        if (getLeftSide() != domino.getLeftSide()) {
            return getLeftSide() - domino.getLeftSide();
        } else {
            return getRightSide() - domino.getRightSide();
        }
    }
}