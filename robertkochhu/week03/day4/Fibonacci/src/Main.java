public class Main {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(fibonacci(n));

    }

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

}
