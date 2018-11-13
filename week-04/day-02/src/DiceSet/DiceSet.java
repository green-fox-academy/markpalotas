import java.util.Arrays;

public class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
    // You can roll all of them with roll()
    // Check the current rolled numbers with getCurrent()
    // You can reroll with reroll()
    // Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    public int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    public int[] getCurrent() {
        return dices;
    }

    public int getCurrent(int i) {
        return dices[i];
    }

    public void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    public void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(dices);
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        System.out.println("The first roll is " + diceSet.toString());
        int rerollCounter = 0;
        while (diceSet.sumOfDice() < 36) {
            diceSet.reroll();
            rerollCounter++;
        }
        System.out.println("The sum total of the numbers rolled is: " + diceSet.sumOfDice());
        System.out.println("that is, the current roll is: " + diceSet.toString() + ".");
        System.out.println("I had to reroll " + rerollCounter + " times, which then again means I'm pretty friggin' tired...");
    }

    public int sumOfDice() {
        int sum = 0;
        for (int i = 0; i < dices.length; i++) {
            sum = sum + dices[i];
        }
        return sum;
    }
}