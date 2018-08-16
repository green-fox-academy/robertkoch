public class Counter {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(recCounter(n));
    }

    public static int recCounter(int n) {
        if (n == 1) {
            return n;
        } else {
            System.out.println(n);
            return recCounter(n - 1);

        }

    }

}

