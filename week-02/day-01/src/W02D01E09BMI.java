public class W02D01E09BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        // Print the Body mass index (BMI) based on these values
        System.out.println("BMI equals: " + (massInKg / (heightInM * heightInM)));
    }
}