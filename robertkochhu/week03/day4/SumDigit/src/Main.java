public class Main {
    public static void main(String[] args) {
        int lotsOfDigits = 129;
        int sum = 0;
        System.out.println(digitCounter(lotsOfDigits, sum));
    }

    public static int digitCounter(int lotsOfDigits, int sum) {
        if (lotsOfDigits == 0) {
            return sum;

        } else {
            sum = sum + lotsOfDigits % 10;
            lotsOfDigits = lotsOfDigits / 10;
            return digitCounter(lotsOfDigits, sum);
        }


    }
}
