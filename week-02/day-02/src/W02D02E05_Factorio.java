public class W02D02E05_Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial
        System.out.println(factorio(5));
    }

    public static int factorio(int a) {
        int factorio = 1;
        for (int i = a; i > 0; i--) {
            factorio = factorio * i;
        }
        return factorio;
    }
}
