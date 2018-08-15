import java.util.Arrays;

class DiceSet {
    // You have a `DiceSet` class which has a list for 6 dices
// You can roll all of them with roll()
// Check the current rolled numbers with getCurrent()
// You can reroll with reroll()
// Your task is to roll the dices until all of the dices are 6
    int[] dices = new int[6];

    int[] roll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
        return dices;
    }

    int[] getCurrent() {
        return dices;
    }

    int getCurrent(int i) {
        return dices[i];
    }

    void reroll() {
        for (int i = 0; i < dices.length; i++) {
            dices[i] = (int) (Math.random() * 6) + 1;
        }
    }

    void reroll(int k) {
        dices[k] = (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        diceSet.getCurrent();
        diceSet.roll();
        diceSet.getCurrent();
        diceSet.getCurrent(5);
        diceSet.reroll();
        diceSet.getCurrent();
        diceSet.reroll(4);
        diceSet.getCurrent();

        int sum = diceSet.dices[0] + diceSet.dices[1] + diceSet.dices[2] + diceSet.dices[3] + diceSet.dices[4] + diceSet.dices[5];
        do {
            diceSet.roll();
            System.out.println("GOT IT");


        } while (sum == 36);

    }


}
