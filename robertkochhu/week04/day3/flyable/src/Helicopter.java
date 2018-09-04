public class Helicopter extends Vehicle implements Flyable {
    @Override
    public void land() {
        System.out.println("iam able to land");
    }

    @Override
    public void takeoff() {
        System.out.println("iam able to takeoff");
    }

    @Override
    public void fly() {
        System.out.println("i believe i can fly");
    }
}
