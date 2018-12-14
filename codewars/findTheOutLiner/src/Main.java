public class Main {
    public static void main(String[] args) {

    }

    static int find(int[] integers) {
        int CounterOdd = 0;
        int CounterEven = 0;
        int lastEven = 0;
        int lastOdd = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 1 || integers[i] % 2 == -1) {
                CounterOdd++;
                lastOdd = integers[i];
            }
            if (integers[i] % 2 == 0 || integers[i] == 0) {
                CounterEven++;
                lastEven = integers[i];
            }
        }
        if (CounterEven > CounterOdd) {
            return lastOdd;
        } else return lastEven;
    }
}
