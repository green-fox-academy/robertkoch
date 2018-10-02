public class Main {
    public static void main(String[] args) {
        int bunnies = 100;
        System.out.println(earCounter(bunnies));
    }

    public static int earCounter(int bunnies) {

        if (bunnies == 1) {
            return 2;
        } else if (bunnies % 2 == 0) {
            int earAmount = earCounter(bunnies - 1) + 2;
            return earAmount;
        } else {
            int earAmount = earCounter(bunnies - 1) + 3;
            return earAmount;

        }
    }
}
