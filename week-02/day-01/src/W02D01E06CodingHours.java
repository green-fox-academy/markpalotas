public class W02D01E06CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        int a = 6; // number of coding hours per workday
        int b = 17; // number of weeks in a semester

        System.out.println("Number of hours spent on coding in a semester: " + (a * b * 5));

        double c = (a * b * 5.0) / (24 * b * 7); // Ratio of time spent on coding

        System.out.println("Coding hours in the semester as a percentage of your total time: " + c + "%");
    }
}