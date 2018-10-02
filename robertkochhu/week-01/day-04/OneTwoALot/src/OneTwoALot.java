import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui = scanner.nextInt();

        if (ui > 2) {
            System.out.println("a lot");
        } else if (ui == 2) {
            System.out.println("two");
        } else if (ui == 1) {
            System.out.println("one");
        } else {
            System.out.println("not enough");
        }

    }
}

