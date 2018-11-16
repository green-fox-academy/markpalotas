package Pirates;

public class Pirate {
    private String name;
    private int howDrunk = 0;
    private boolean isDead = false;
    private int isDeadCount = 0;
    private boolean isPassedOut = false;
    private int eventCounter = 0;
    private int lastPassOutEvent;
    private boolean isCaptain = false;
    private String whichShip;

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
            eventCounter();
        } else {
            howDrunk++;
            eventCounter();
        }
    }

    private void countIsDead() {
        tellIsDead();
        isDeadCount++;
    }

    private void tellIsDead() {
        if (isDeadCount == 0) {
            System.out.println(this.name + " is dead");
        } else if (isDeadCount == 1) {
            System.out.println("I'm still pretty sure " + this.name + "dead);");
        } else if (isDeadCount == 2) {
            System.out.println("Get lost, I've toldya " + this.name + " is dead);");
        } else {
            System.out.println("...not tellin' ya 'gain " + this.name + "is dead...aaargh...I just did...");
        }
    }

    public void drinkMoreRum(int n) {
        if (isDead) {
            countIsDead();
        }
        if (isPassedOut) {
            System.out.println("Nice try, but not even a pirate can drink when passed out...");
            eventCounter();
        } else {
            howDrunk += n;
            eventCounter();
        }
    }

    public void howsItGoingMate() {
        if (isDead) {
            countIsDead();
        } else if (isPassedOut) {
            System.out.println("Leave'm alone, he's sleeping it off");
            eventCounter();
        } else if (this.howDrunk <= 4) {
            System.out.println("Pour me anudder, ya bastard!");
            eventCounter();
        } else {
            passOut();
        }
    }

    private void eventCounter() {
        eventCounter++;
        if (lastPassOutEvent != 0) {
            if (eventCounter - lastPassOutEvent >= 5) {
                this.isPassedOut = false;
                this.howDrunk = 0;
            }
        }
    }

    private void passOut() {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        this.isPassedOut = true;
        this.lastPassOutEvent = eventCounter;
        eventCounter();
    }

    public void die() {
        isPassedOut = false;
        isDead = true;
        System.out.println(this.name + " has just died...RIP");
    }

    public void brawl(Pirate pirate) {
        int outcome = (int) (Math.random() * 3);
        if (this.isDead) {
            countIsDead();
        } else if (this.isPassedOut) {
            System.out.println("Not happening, " + this.name + "is passed out right now");
        } else if (pirate.isPassedOut) {
            System.out.println("That's kinda perverted, mate, trying to brawl with a passed-out guy...");
            this.eventCounter();
        } else if (pirate.isDead) {
            pirate.countIsDead();
        } else if (outcome == 0) {
            System.out.println("That went well...");
            this.die();
            pirate.die();
        } else if (outcome == 1) {
            System.out.println("Good job, " + this.name);
            pirate.die();
            this.eventCounter();
        } else {
            System.out.println("Good job, " + pirate.name);
            this.die();
            pirate.eventCounter();
        }
    }

    public void appointCaptain() {
        if (isDead) {
            countIsDead();
            System.out.println("Not happening...Dead men make no good capt'n...");
        } else if (isPassedOut) {
            eventCounter();
            System.out.println("Ya sure being passed-out is a good start for a capt'n? Well, not my problem anyway...");
        } else {
            eventCounter();
            isCaptain = true;
        }
    }

    public void assignShip(String shipName) {
        this.whichShip = shipName;
    }

    public boolean isAlive() {
        return !isDead;
    }

    @Override
    public String toString() {
        String answer = name + " has consumed " + howDrunk + " bottles of rum so far ";
        if (this.isDead) {
            answer = answer + "and is quite dead...";
        } else if (this.isPassedOut) {
            answer = answer + " and accordingly, he's passed out...";
        }
        return answer;
    }
}
