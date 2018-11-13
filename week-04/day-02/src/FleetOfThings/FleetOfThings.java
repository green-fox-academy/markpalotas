package FleetOfThings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet myFleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing stand = new Thing("Stand up");
        Thing lunch = new Thing("Eat lunch");
        myFleet.add(milk);
        myFleet.add(obstacles);
        myFleet.add(stand);
        myFleet.add(lunch);
        stand.complete();
        lunch.complete();
        System.out.println(myFleet);
    }
}