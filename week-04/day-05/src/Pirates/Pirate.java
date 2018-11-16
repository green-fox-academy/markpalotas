package Pirates;

public class Pirate {
    private String name;
    private int howDrunk = 0;
    private boolean isDead = false;
    private int isDeadCount = 0;
    private boolean isPassedOut = false;
    private int eventCounter = 0;
    private int lastPassOutEvent;

    public Pirate() {

    }

    public Pirate(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        System.out.println("Tryin' to get rid of that ugly nickname of yours, Stinky? Not happening, too bad...");
    }

    public void drinkSomeRum() {
        if (isDead) {
            countIsDead();
        }
        if (isPassedOut) {
            System.out.println("Nice try, but not even a pirate can drink when passed out...");
            eventCounter++;
        } else {
            howDrunk++;
            eventCounter++;
        }
    }

    private void countIsDead() {
        tellIsDead();
        isDeadCount++;
    }

    private void tellIsDead() {
        if (isDeadCount == 0) {
            System.out.println("He is dead");
        } else if (isDeadCount == 1) {
            System.out.println("I'm still pretty sure he's dead);");
        } else if (isDeadCount == 2) {
            System.out.println("Get lost, I've toldya he's dead);");
        } else {
            System.out.println("...not tellin' ya 'gain...");
        }
    }

    public void drinkMoreRum(int n) {
        if (isDead) {
            countIsDead();
        }
        if (isPassedOut) {
            System.out.println("Nice try, but not even a pirate can drink when passed out...");
            eventCounter++;
        } else {
            howDrunk += n;
            eventCounter++;
        }
    }

    public void howsItGoingMate() {
        if (isDead) {
            countIsDead();
        } else if (isPassedOut) {
            System.out.println("Leave'm alone, he's sleeping it off");
            eventCounter++;
        } else if (this.howDrunk <= 4) {
            System.out.println("Pour me anudder, ya bastard!");
            eventCounter++;
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.isPassedOut = true;
            this.lastPassOutEvent = eventCounter;
        }
    }

    public void eventCounter() {
        
    }

    public
}
