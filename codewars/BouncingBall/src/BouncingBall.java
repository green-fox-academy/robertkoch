public class BouncingBall {
    public static void main(String[] args) {
        double h = 1000;
        double bounce = 0.66;
        double window = 1.5;
        System.out.println(bouncingBall(h, bounce, window));
    }

    public static int bouncingBall(double h, double bounce, double window) {
        int bounceCounter = 0;
        if (h > window && h > 0 && (bounce > 0 && bounce < 1)) {
            for (double i = h * bounce; i > window; i *= bounce) {
                bounceCounter += 2;
            }
            return bounceCounter + 1;
        } else return -1;
    }
}
