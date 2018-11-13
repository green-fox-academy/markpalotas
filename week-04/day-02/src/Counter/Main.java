package Counter;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);
        counter1.add();
        counter1.add();
        System.out.println(counter1.counter);
        counter2.add(55);
        System.out.println(counter2.counter);
        counter2.reset();
        counter1.reset();
        System.out.println(counter1.counter);
        System.out.println(counter2.counter);
    }
}
