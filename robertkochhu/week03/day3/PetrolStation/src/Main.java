public class Main {
    public static void main(String[] args) {
        Car car = new Car(0, 100);
        Station station = new Station(1000);
        System.out.println(car.gasAmount);
        station.refill(car);
        System.out.println(car.gasAmount);
        System.out.println(station.gasAmount);

    }
}
