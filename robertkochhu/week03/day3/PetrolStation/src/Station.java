public class Station {
    int gasAmount;

    public void refill(Car car) {
        this.gasAmount -= car.capacity;
        car.gasAmount += this.gasAmount;

    }
}
