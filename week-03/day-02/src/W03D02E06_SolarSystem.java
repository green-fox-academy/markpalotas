import java.util.*;

public class W03D02E06_SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));

        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.

        System.out.println(putSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

        planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.println(putSaturn2(planetList));
    }

    public static ArrayList<String> putSaturn(ArrayList inputAL) {
        inputAL.add(5, "Saturn");
        return inputAL;
    }

    public static ArrayList<String> putSaturn2(ArrayList inputAL2) {
        inputAL2.add(inputAL2.indexOf("Jupiter") + 1, "Saturn");
        return inputAL2;
    }
}