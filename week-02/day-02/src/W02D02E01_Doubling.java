public class W02D02E01_Doubling {
    public static void main(String[] args) {
// - Create an integer variable named `baseNum` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(baseNum)`
        int baseNum = 123;
        System.out.println(doubling(baseNum));
        System.out.println("Es megegyszer duplazva: " + doubling(baseNum)*2);
    }

    public static int doubling(int a) {
        int doubled = a * 2;
        return doubled;
    }

}