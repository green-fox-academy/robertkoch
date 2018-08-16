public class Main {
    public static void main(String[] args) {
        int n = 10;
        int start = 1;
        numberAdder(start, n);
    }

    public static void numberAdder(int start, int n) {

        if (start == n) {
            System.out.println(n);

        } else {
            System.out.println(start);

            numberAdder(start + 1, n);

        }


    }
}





