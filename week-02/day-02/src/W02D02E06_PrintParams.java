public class W02D02E06_PrintParams {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `printParams`
        //   which prints the input String parameters
        // - It can have any number of parameters

        // Examples
        // printParams("first")
        // printParams("first", "second")
        // printParams("first", "second", "third", "fourh")
        // ...
        printParams("one", "two", "three");

        System.out.println("\nAnother way: " + printParams2("one", "two", "three"));

    }

     public static void printParams (String...ourParams){
            for (int i = 0; i < ourParams.length; i++) {
                System.out.print(ourParams[i] + " ");
            }
     }

     public static String printParams2 (String...ourParams){
            String printedParams = "";
            for (int i = 0; i < ourParams.length; i++) {
                printedParams = printedParams + " " + ourParams[i];
            }
            return printedParams;
     }
}