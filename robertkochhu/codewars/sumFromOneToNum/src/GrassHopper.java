public class GrassHopper {
    public static void main(String args[]) {
        int n = 7;
        System.out.println(summation(n));
    }

    public static int summation(int n) {
        int sum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            return sum;
        } else return 0;
    }
}