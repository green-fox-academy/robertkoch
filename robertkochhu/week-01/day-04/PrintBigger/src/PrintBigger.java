import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui1 = scanner.nextInt();
        int ui2 = scanner.nextInt();

        if (ui1 > ui2) {
            System.out.println(ui1);
        } else if (ui1 == ui2) {
            System.out.println("egyenlo");
        } else {
            System.out.println(ui2);
        }
    }
}
