public class Main {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("John", false, false, 0, "Turkey");
        Pirate pirate2 = new Pirate("James", false, false, 1, "Eagle");
        Pirate pirate3 = new Pirate("Tom", false, false, 2, "Mayor");


        pirate1.brawl(pirate2);


    }
}
