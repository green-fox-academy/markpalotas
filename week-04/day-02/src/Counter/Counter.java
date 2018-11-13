package Counter;

public class Counter {
    int counter = 0;
    int resetTo;

    public Counter(int counter) {
        this.counter = counter;
        this.resetTo = counter;
    }

    public Counter() {
        this.resetTo = 0;
    }

    public void add() {
        this.counter++;
    }

    public void add(int toAdd) {
        this.counter += toAdd;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        this.counter = resetTo;
    }
}
