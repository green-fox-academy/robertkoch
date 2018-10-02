public class TaskFActorial {
    public static void main(String[] args) {
        int number = 7;
        int output = factorio(number);
        System.out.println(output);
    }

    public static int factorio(int a) {
        int factonumber = 1;
        for (int i = 1; i <= a; i++) {
            factonumber = factonumber * i;

        }
        return factonumber;
    }
}
