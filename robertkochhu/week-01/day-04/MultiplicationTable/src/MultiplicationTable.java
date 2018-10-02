import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui = scanner.nextInt();
        int i = 1;
        while (i < 11) {
            System.out.println(i * ui);
            i += 1;
        }

    }
}
