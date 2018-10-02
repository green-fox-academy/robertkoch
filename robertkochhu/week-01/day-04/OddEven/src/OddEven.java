import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ui = scanner.nextInt();
        if (ui % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }
}
