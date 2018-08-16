import java.util.Random;

public class Pirate {
    String pirateName;
    boolean isHeDead;
    boolean isHePassedOut;
    int intoxication;
    String parrotName;
    Random random1 = new Random();

    Pirate(String pirateName, boolean isHeDead, boolean isHePassedOut, int intoxication, String parrotName) {
        this.pirateName = pirateName;
        this.isHeDead = false;
        this.isHePassedOut = isHePassedOut;
        this.intoxication = intoxication;
        this.parrotName = parrotName;

    }

    public void drinkSomeRum() {
        if (this.isHeDead == true) {
            System.out.println("He is dead");
        }
        this.intoxication++;
    }

    public void howsItGoingMate() {
        if (this.isHeDead == true) {
            System.out.println("He is dead");
        } else if (this.intoxication < 4) {
            System.out.println(this.pirateName+" Says: Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            this.isHePassedOut = true;
            this.intoxication = 0;
        }


    }

    public void die() {
        this.isHeDead = true;
    }

    public void brawl(Pirate another) {
        if (another.isHeDead == false) {
            int chances = random1.nextInt(3);
            if (chances == 0) {
                another.isHeDead = true;
                System.out.println(another.pirateName +" is murdered.");
            } else if (chances == 1) {
                this.isHeDead = true;
                System.out.println(this.pirateName +" is murdered.");
            } else if (chances == 2) {
                this.isHeDead = true;
                another.isHeDead = true;
                System.out.println(this.pirateName+ " and " +another.pirateName +" killed each other.");
            }


        }
    }
}
