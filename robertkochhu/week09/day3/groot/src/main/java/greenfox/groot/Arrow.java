package greenfox.groot;

public class Arrow {
    private int distance;
    private int time;
    private double speed;

    public Arrow() {
    }

    public Arrow(int distance, int time) {
        this.distance = distance;
        this.time = time;
        this.speed = (double) distance/time;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
