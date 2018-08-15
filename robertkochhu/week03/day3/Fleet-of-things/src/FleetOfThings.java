public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing thing1 = new Thing("Get Milk");
        fleet.add(thing1);
        Thing thing2 = new Thing("remove obstacles");
        fleet.add(thing2);
        Thing thing3 = new Thing("stand up");
        thing3.complete();
        fleet.add(thing3);
        Thing thing4 = new Thing("Eat lunch");
        thing4.complete();
        fleet.add(thing4);
        

        System.out.println(fleet);
    }
}