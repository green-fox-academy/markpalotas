public class E10DefineBasicInfo {
    public static void main(String[] args) {
        // Define several things as a variable then print their values
        // Your name as a string
        // Your age as an integer
        // Your height in meters as a double
        // Whether you are married or not as a boolean
        String myName = "Mark Palotas";
        int myAge = 38;
        double myHeight = 1.87;
        boolean maritalStatus = false;
        System.out.println("My name is " + myName + ",");
        System.out.println("I am " + myAge + " years of age,");
        System.out.println("have a height of " + myHeight + "m and");

        if (maritalStatus) {
            System.out.println("I am married.");
        }
        else {
            System.out.println("I'm single.");
        }
    }
}
