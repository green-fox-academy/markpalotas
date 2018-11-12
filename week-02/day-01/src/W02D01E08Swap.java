public class W02D01E08Swap {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int c = a;
        a = b;
        b = c;
        System.out.println("Value of variable a: " + a);
        System.out.println("Value of variable b: " + b);
    }
}